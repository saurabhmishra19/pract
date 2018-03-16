package ReadFailures;

import ReadFailures.Dto.RegressionDto;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class HtmlReader {


    public static void main(String [] args){

        String pathInputFile="C:\\Users\\Saurabh_Mishra\\Documents\\groovyapp\\UI_Regression_25JAN\\UI_Regression\\stories.request.S283484_Record_Details_Integration.html";

        List<RegressionDto> regressionDtos=null;
        try{
            readDoc(pathInputFile);
        }catch (Exception ex){
            System.out.println(ex);
        }


    }

    public static List<RegressionDto> generateReport(String filePath){




    return null;
    }

    public static void readDoc(String filePath) throws IOException{
        File input=new File(filePath);
        Document doc = Jsoup.parse(input,"UTF-8");
        Elements failedSteps= doc.getElementsByClass("failed");
        Elements title= doc.getElementsByTag("title");

        System.out.println(title.html());
        //System.out.println(failedSteps.html());
        RegressionDto dto=new RegressionDto();
        dto.setFileName(title.html());
    }






}
