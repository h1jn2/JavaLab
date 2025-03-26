package ch4.section3_io;

import java.io.*;

public class Exam1 {
    public static void main(String[] args) {
        try {
            // file을 byte로 읽음
            FileInputStream fis = new FileInputStream("c:\\Temp\\data.txt");
            // byte 를 문자열로 변형시켜 주는 stream 을 연결해서
            // 문자열 인코딩 타입 문제로 한글이 깨질 수도 있음
            // UTF-8, EUC-KR
            InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
            BufferedReader bin = new BufferedReader(isr);

            StringBuffer sb = new StringBuffer();
            String line = "";

            // 한줄씩 읽어서 line에 저장
            while((line = bin.readLine()) != null) {
                sb.append(line);
                System.out.println(line);
            }

            File dir = new File("c:\\work");
            dir.mkdir();

            File file = new File(dir, "result.txt");
            file.createNewFile();

            if (dir.isDirectory()) {
                System.out.println(dir.getName() + "은 디렉토리입니다");
            }

            if (file.isFile()) {
                System.out.println(file.getName() + "은 파일입니다");
            }

            if (file.exists()) {
                PrintWriter out = new PrintWriter(file);
                out.println(sb.toString());
                out.flush();
                out.close();
                System.out.println(file.getAbsolutePath());
                System.out.println(file.length());
            }


        } catch (IOException e) {
            e.getStackTrace();
        }
    }
}
