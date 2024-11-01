package com.mycompany.campustasksuite.studentmanager;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.pdf.PdfWriter;
import com.mycompany.campustasksuite.studentmanager.StudentTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

import javax.swing.table.AbstractTableModel;
import java.awt.image.BufferedImage;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.imageio.ImageIO;

public class GradeReportGenerator {
    private final StudentTableModel studentModel;
    private String pathToDatabase = "./src/main/java/databases/";

    public GradeReportGenerator(StudentTableModel studentModel) {
        this.studentModel = studentModel;
    }

    // Vector de frecventa
    private int[] calculateGradeDistribution() {
        int[] gradeDistribution = new int[10]; 
        for (int i = 0; i < studentModel.getRowCount(); i++) {
            float grade = (float) studentModel.getValueAt(i, 3); 
            int bucket = Math.min((int) grade, 9); 
            gradeDistribution[bucket]++;
        }
        return gradeDistribution;
    }

    // Creare Dataset
    private CategoryDataset createDataset(int[] gradeDistribution) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for (int i = 0; i < gradeDistribution.length; i++) {
            String range = i + "-" + (i + 1);
            dataset.addValue(gradeDistribution[i], "Students", range);
        }
        return dataset;
    }

    // Method to generate the bar chart
    private JFreeChart createBarChart(CategoryDataset dataset) {
        return ChartFactory.createBarChart(
                "Grade Distribution", // Title
                "Grade Range",        // X-axis label
                "Number of Students", // Y-axis label
                dataset,
                PlotOrientation.VERTICAL,
                true,                // Legend
                true,
                false
        );
    }

    // Method to save the bar chart as an image
    private BufferedImage generateChartImage(JFreeChart chart) {
        return chart.createBufferedImage(500, 400);
    }

    // Method to generate the PDF report
    public void generatePdfReport(String pdfPath) {
        int[] gradeDistribution = calculateGradeDistribution();
        CategoryDataset dataset = createDataset(gradeDistribution);
        JFreeChart chart = createBarChart(dataset);
        BufferedImage chartImage = generateChartImage(chart);

        Document document = new Document();
        try {
            PdfWriter.getInstance(document, new FileOutputStream(pdfPath));
            document.open();
            document.add(new com.itextpdf.text.Paragraph("Grade Distribution Report"));
            document.add(new com.itextpdf.text.Paragraph("\n"));

            
            String tempImagePath = this.pathToDatabase + "temp_chart.png";
            ImageIO.write(chartImage, "png", new java.io.File(tempImagePath));
            Image chartImg = Image.getInstance(tempImagePath);
            document.add(chartImg);

        } catch (DocumentException | IOException e) {
            e.printStackTrace();
        } finally {
            document.close();
        }
    }
}
