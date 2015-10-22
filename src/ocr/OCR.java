package ocr;

import java.io.File;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

/**
 *
 * @author TAREK
 */
public class OCR {

    public static void main(String[] args) {
        for (int i = 1; i < 3; i++) {
            File imageFile = new File("..\\OCR\\src\\Images\\Image"+i+".png");
            Tesseract instance;
            instance = Tesseract.getInstance();
            try {
                instance.setDatapath("..\\OCR\\tessdata");
                String result = instance.doOCR(imageFile);
                System.out.println(result);
            } catch (TesseractException e) {
                System.err.println(e.getMessage());
            }
        }
    }
}
