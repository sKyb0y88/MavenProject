package Curs12;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class PdfExample {

	public static void main(String[] args) throws IOException {
		
		File file = new File("sample.pdf");
		
		PDDocument document = PDDocument.load(file);
	
		PDFTextStripper pdfStripper = new PDFTextStripper();
		
		String text = pdfStripper.getText(document);
		
		System.out.println(text);
		
		document.close();
		
		System.out.println("-----------------------------------------------------");
		
		System.out.println(readLineFromPdf("sample.pdf", "Oh", "stuff"));

	}
	
	public static String readLineFromPdf(String path, String start, String finish) throws IOException {
		String returnString = "";
		
		//readLineFromPdf("Sample.pdf", "Simple", )
		
		PDDocument document = PDDocument.load(new File(path));
		
		PDFTextStripper pdfStripper = new PDFTextStripper();	
		String allText = pdfStripper.getText(document);
		String strStart = start;
		String strFinish = finish;
		
		int startIndex = allText.indexOf(strStart);
		int endIndex = allText.indexOf(strFinish);
		
		returnString = allText.substring(startIndex, endIndex) + strFinish;
		document.close();
		
		
		return returnString;
	}

}
