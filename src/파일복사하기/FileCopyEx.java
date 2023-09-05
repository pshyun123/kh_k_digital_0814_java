package 파일복사하기;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyEx {
    public static void main(String[] args) throws IOException {
        String originFileName = "src/파일복사하기/냥이.png";
        String targetFileName = "d:/tmp/kitty.png"; // 이미지는 기본적으로 압축 알고리즘 적용

        FileInputStream fis = new FileInputStream(originFileName); // 해당 위치에서 바이트 단위로 파일 읽음
        FileOutputStream fos = new FileOutputStream(targetFileName); //

        int readByteNo;
        byte[] readBytes = new byte[100];
        while ((readByteNo = fis.read(readBytes)) != -1) {
            // 파일에 읽을게 있는동안 파일을 한번에 100 Byte 씩 읽어내고
            fos.write(readBytes, 0, readByteNo);// 바로 써버림. 맨 앞에서 부터 끝까지 100 바이트 만큼
        }
        fos.flush();
        fos.close();
        fis.close();
    }
}
