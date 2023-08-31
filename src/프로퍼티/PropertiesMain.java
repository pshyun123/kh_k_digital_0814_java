package 프로퍼티;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.Properties;

// Map의 하나의 형태 : 키와 값이 모두 String 타입으로 제한된 형태
public class PropertiesMain {

    public static void main(String[] args) throws IOException {//IOException 더 상위개념으로 간주하겠음. 예외처리 퉁쳐서 하나로 처리하겠다
        Properties properties = new Properties();
        //방금 파일 값 불러오려면
        String path = PropertiesMain.class.getResource("../클론오브젝트/database.properties").getPath();
        path = URLDecoder.decode(path, "utf-8");//한글 처리를 위해 utf-8 유니코드 형태로
        properties.load(new FileReader(path));
        String driver = properties.getProperty("driver");
        String url = properties.getProperty("url");
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");

        System.out.println("driver : " + driver);
        System.out.println("url : " + url);
        System.out.println("username : " + username);
        System.out.println("password : " + password);


    }
}


//다른 패키지여도 안죽게 하려면? 경로를 바꿔줌
//../패키지이름/