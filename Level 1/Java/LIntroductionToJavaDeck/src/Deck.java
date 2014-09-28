
import java.io.FileOutputStream;
import java.io.IOException;

import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfWriter;


public class Deck {

	public static void main(String[] args) throws IOException, DocumentException {
		
		char[] suit = new char[4];
		suit[0] = '\u2663';
		suit[1] = '\u2665';
		suit[2] = '\u2666';
		suit[3] = '\u2660';
		
		String[] cards = new String[52];
		int count = 0;
		
		for (int i = 0; i < suit.length; i++) {
		
			for (int j = 2; j < 15; j++) {
				
				switch (j) {
				
				case 11:
					cards[count] = "J" + suit[i] + " ";
					break;
				
				case 12:
					cards[count] = "Q" + suit[i] + " ";
					break;
				
				case 13:
					cards[count] = "K" + suit[i] + " ";
					break;
				
				case 14:
					cards[count] = "A" + suit[i] + " ";
					break;

				default:
					cards[count] = "" + j + suit[i] + " ";
				
				}
				
				count++;
			}
		}
		
		String res = "My.pdf";
		Document doc = new Document();
		PdfWriter writer = PdfWriter.getInstance(doc, new FileOutputStream(res));
		
		BaseFont baseFont = BaseFont.createFont("times.ttf", BaseFont.IDENTITY_H, true);
        Font black = new Font(baseFont, 12);
        Font red = new Font(baseFont, 12);
        
        black.setColor(BaseColor.BLACK);
		red.setColor(BaseColor.RED);
		
        PdfPTable table = new PdfPTable(13);
		PdfPCell cell;
		
		for (int i = 0; i < cards.length; i++) {
			
			cell = new PdfPCell(new Phrase(cards[i], black));
			cell.setFixedHeight(60f);
			cell.setVerticalAlignment(Element.ALIGN_CENTER);
			cell.setHorizontalAlignment(Element.ALIGN_CENTER);
			cell.setBackgroundColor(BaseColor.CYAN);
			
			if (i >= 13 && i < 39) {
				
				cell = new PdfPCell(new Phrase(cards[i], red));
				cell.setFixedHeight(60f);
				cell.setVerticalAlignment(Element.ALIGN_CENTER);
				cell.setHorizontalAlignment(Element.ALIGN_CENTER);
				cell.setBackgroundColor(BaseColor.CYAN);
			}
			
			table.addCell(cell);
		}
	
		doc.open();
		doc.add(table);
		doc.close();
	}

}