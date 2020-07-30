package CrawListSong;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CrawlSongExample {

        //Bước 1: Tạo class CrawlSongExample

        //Bước 2: Tạo phương thức main trong lớp CrawlSongExample

        public static void main(String[] args) {
            try {
                // Code here
//        Lưu ý: Tất cả các lệnh được đặt vào khối try/catch
//
//        Bước 3: Sử dụng URL của java.net để khởi tạo đường dẫn thư viện nhạc muốn lấy danh sách bài hát

                URL url = new URL("https://www.nhaccuatui.com/bai-hat/nhac-tre-moi.html");
                //Bước 4: Mở stream và đưa nó vào InputStreamReader

                // open the stream and put it into BufferedReader
                Scanner scanner = new Scanner(new InputStreamReader(url.openStream()));
                scanner.useDelimiter("\\Z");
                String content = scanner.next();
                // close scanner
                scanner.close();

                //Bước 5: Xóa tất cả các new line trong content lấy được

                // remove all new line
                content = content.replaceAll("\\n+", "");
                //Bước 6: Lọc nội dung content lấy được trong tag a chứa class name_song và In ra danh sách tên bài hát lấy được theo điều kiện lọc

                // regex
                Pattern p = Pattern.compile("name_song\">(.*?)</a>");
                Matcher m = p.matcher(content);
                while (m.find()) {
                    System.out.println(m.group(1));
                }
            }catch (MalformedURLException e) {
                    e.printStackTrace();
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }

        }
        }


