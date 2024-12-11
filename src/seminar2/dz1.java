package seminar2;

class URLBuilder {
    public static String buildURL(String baseURL, String params) {
        // Введите свое решение ниже
        StringBuilder url = new StringBuilder(baseURL);
        String splitParams[] = params.split("&");
        for (int i = 0; i < splitParams.length; i++) {
            String[] splitParam = splitParams[i].split("=");
            if (!splitParam[1].equals("null")) {
                url.append(splitParams[i]).append("&");
            }
        }
        System.out.println(url);
        url.deleteCharAt(url.length() - 1);
        System.out.println(url);
        return "";
    }
}
// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class dz1 {
    public static void main(String[] args) {
        String baseURL = "";
        String params = "";
        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            baseURL = "https://example.com/search?";
            params = "query=java&sort=desc&filter=null";
        } else {
            baseURL = args[0];
            params = args[1];
        }
        URLBuilder ans = new URLBuilder();
        System.out.println(ans.buildURL(baseURL, params));
    }
}
