package com.howtodoinjava.examples;

import java.io.FileOutputStream;
import java.net.URL;

import com.itextpdf.text.Document;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class AddImageExample {
	public static void main(String[] args) {
		Document document = new Document(); 
		try
		{
			PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("AddImageExample.pdf"));
			document.open();
			document.add(new Paragraph("Alaa-sw"));

			//Add Image
			Image image1 = Image.getInstance("Alaa-sw.jpg");
			//For Fixed Positioning
			//image1.setAbsolutePosition(100f, 550f);
			//Scale to new height and new width of image
			image1.scaleAbsolute(400, 400);
			//Add to document
			document.add(image1);

			String imageUrl = "http://www.eclipse.org/xtend/images/java8_logo.png";
			Image image2 = Image.getInstance(new URL(imageUrl));
			document.add(image2);

			document.close();
			writer.close();
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
