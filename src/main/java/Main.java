import com.opencsv.CSVReader;
import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.exceptions.CsvException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;


public class Main {
    public static void main(String[] args) throws Exception
    {
        List<Human> list = new CsvToBeanBuilder(new FileReader("foreign_names.csv"))
                .withType(Human.class)
                .withSeparator(';')
                .build()
                .parse();

        for(int i=0;i<300;i++)
            list.get(i).printHuman();

    }
}
