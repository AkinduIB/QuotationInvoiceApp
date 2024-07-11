package quotationinvoiceapp2;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileOutputStream;

public class printQuotation {

    public static void generatePDF(String filePath, String clientData, String formattedDate, String content, String topic) {
        try {
            // Create a document
            Document document = new Document(PageSize.A4, 36, 36, 36, 36);

            // Create a PDF writer
            PdfWriter.getInstance(document, new FileOutputStream(filePath));

            // Open the document
            document.open();

            Image logo = Image.getInstance("E:\\AVD Signs Letterhead.png");

            float pageWidth = PageSize.A4.getWidth() - document.leftMargin() - document.rightMargin();
            float imageWidth = logo.getWidth();
            float scalingFactor = pageWidth / imageWidth;

            logo.scaleToFit(pageWidth, logo.getHeight() * scalingFactor); // Scale the logo image as needed
            logo.setAlignment(Element.ALIGN_CENTER);
            document.add(logo);

            // Add date
            Paragraph dateParagraph = new Paragraph(formattedDate);
            dateParagraph.setAlignment(Element.ALIGN_RIGHT);
            document.add(dateParagraph);

            // Add client details
            Paragraph clientDetails = new Paragraph(clientData);
            clientDetails.setAlignment(Element.ALIGN_LEFT);
            document.add(clientDetails);
            
            document.add(new Paragraph(" ")); // Adding a blank paragraph for space

            document.add(new Paragraph("Dear Sir/Madam,")); // Adding a blank paragraph for space

            document.add(new Paragraph(" ")); // Adding a blank paragraph for space

            boolean topicAdded = false;
            if (!topicAdded) {
                Paragraph topicParagraph = new Paragraph(topic);
                topicParagraph.setAlignment(Element.ALIGN_CENTER);
                Chunk underline = new Chunk(topic);
                underline.setUnderline(0.1f, -2f); // 0.1 thickness, -2 y-position
                topicParagraph.add(underline);
                document.add(topicParagraph);
                topicAdded = true;
            }

            // Add space
            document.add(new Paragraph(" ")); // Adding a blank paragraph for space

            document.add(new Paragraph("Concerning the discussion, I had with you I am pleased to offer you our quotation follows. ")); // Adding a blank paragraph for space

            document.add(new Paragraph(" ")); // Adding a blank paragraph for space
  
            // Add content
            document.add(new Paragraph(content));


            document.add(new Paragraph(" ")); // Adding a blank paragraph for space

            // Close the document
            document.close();

            System.out.println("PDF created successfully at: " + filePath);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
