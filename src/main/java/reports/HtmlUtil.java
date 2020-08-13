package reports;

public class HtmlUtil {
    public static final String startHtmlEmailReportTest =
            "<!DOCTYPE html>\n" +
            "<html lang=\"en\" dir=\"ltr\">\n" +
            "  <head>\n" +
            "    <meta charset=\"utf-8\" />\n" +
            "    <title>Custom Report Main Page</title>\n" +
            "    <style>\n" +
            "      .top-section {\n" +
            "        text-align: center;\n" +
            "      }\n" +
            "      h1 {\n" +
            "        font-family: monospace;\n" +
            "      }\n" +
            "\n" +
            "      .links-section {\n" +
            "        margin: auto;\n" +
            "        text-align: center;\n" +
            "      }\n" +
            "      ul {\n" +
            "        text-align: center;\n" +
            "        list-style-type: none;\n" +
            "      }\n" +
            "      li {\n" +
            "        background-color: #4caf50;\n" +
            "        border-radius: 8px;\n" +
            "        padding: 5px;\n" +
            "        margin: 8px;\n" +
            "        display: inline;\n" +
            "      }\n" +
            "     \n" +
            "      li:hover {\n" +
            "        color: white;\n" +
            "        background-color: red;\n" +
            "        text-decoration: underline;\n" +
            "      }\n" +
            "      li:hover a {\n" +
            "        color: white;\n" +
            "      }\n" +
            "      #customers {\n" +
            "        font-family: \"Trebuchet MS\", Arial, Helvetica, sans-serif;\n" +
            "        border-collapse: collapse;\n" +
            "        width: 100%;\n" +
            "      }\n" +
            "\n" +
            "      td,\n" +
            "      th {\n" +
            "        border: 1px solid #ddd;\n" +
            "        padding: 8px;\n" +
            "      }\n" +
            "\n" +
            "      tr:nth-child(even) {\n" +
            "        background-color: #f2f2f2;\n" +
            "      }\n" +
            "\n" +
            "      tr:hover {\n" +
            "        background-color: #ddd;\n" +
            "      }\n" +
            "\n" +
            "      th {\n" +
            "        padding-top: 12px;\n" +
            "        padding-bottom: 12px;\n" +
            "        text-align: left;\n" +
            "        background-color: #4caf50;\n" +
            "        color: white;\n" +
            "      }\n" +
            "    </style>\n" +
            "  </head>\n" +
            "\n" +
            "  <body>\n" +
            "    <div class=\"top-section\" style=\"text-align: center;\">\n" +
            "      <h1 style=\"font-family: monospace;\">Main Page</h1>\n" +
            "    </div>\n" +
            "    <div\n" +
            "      class=\"links-section\"\n" +
            "      style=\"\n" +
            "        margin-top: auto;\n" +
            "        margin-bottom: auto;\n" +
            "        margin-right: auto;\n" +
            "        margin-left: auto;\n" +
            "        text-align: center;\n" +
            "      \"\n" +
            "    >\n" +
            "      <ul style=\"text-align: center; list-style-type: none;\">\n" +
            "        <li\n" +
            "          style=\"\n" +
            "            background-color: #4caf50;\n" +
            "            border-radius: 8px;\n" +
            "            padding-top: 5px;\n" +
            "            padding-bottom: 5px;\n" +
            "            padding-right: 5px;\n" +
            "            padding-left: 5px;\n" +
            "            margin-top: 8px;\n" +
            "            margin-bottom: 8px;\n" +
            "            margin-right: 8px;\n" +
            "            margin-left: 8px;\n" +
            "            display: inline;\n" +
            "          \"\n" +
            "        >\n" +
            "          <button\n" +
            "            style=\"\n" +
            "              color: white;\n" +
            "              margin-top: 20px;\n" +
            "              margin-bottom: 20px;\n" +
            "              margin-right: 20px;\n" +
            "              margin-left: 20px;\n" +
            "              text-decoration: none;\n" +
            "              border: none;\n" +
            "              background-color: Transparent;\n" +
            "              outline: none;\n" +
            "            \"\n" +
            "            onclick=\"showPassedTestHideOthers()\"\n" +
            "          >\n" +
            "            Passed Tests\n" +
            "          </button>\n" +
            "        </li>\n" +
            "        <li\n" +
            "          style=\"\n" +
            "            background-color: #4caf50;\n" +
            "            border-radius: 8px;\n" +
            "            padding-top: 5px;\n" +
            "            padding-bottom: 5px;\n" +
            "            padding-right: 5px;\n" +
            "            padding-left: 5px;\n" +
            "            margin-top: 8px;\n" +
            "            margin-bottom: 8px;\n" +
            "            margin-right: 8px;\n" +
            "            margin-left: 8px;\n" +
            "            display: inline;\n" +
            "          \"\n" +
            "        >\n" +
            "          <button\n" +
            "            style=\"\n" +
            "              color: white;\n" +
            "              margin-top: 20px;\n" +
            "              margin-bottom: 20px;\n" +
            "              margin-right: 20px;\n" +
            "              margin-left: 20px;\n" +
            "              text-decoration: none;\n" +
            "              border: none;\n" +
            "              background-color: Transparent;\n" +
            "              outline: none;\n" +
            "            \"\n" +
            "            onclick=\"showSkippedTestHideOthers()\"\n" +
            "          >\n" +
            "            Skipped Tests\n" +
            "          </button>\n" +
            "        </li>\n" +
            "        <li\n" +
            "          style=\"\n" +
            "            background-color: #4caf50;\n" +
            "            border-radius: 8px;\n" +
            "            padding-top: 5px;\n" +
            "            padding-bottom: 5px;\n" +
            "            padding-right: 5px;\n" +
            "            padding-left: 5px;\n" +
            "            margin-top: 8px;\n" +
            "            margin-bottom: 8px;\n" +
            "            margin-right: 8px;\n" +
            "            margin-left: 8px;\n" +
            "            display: inline;\n" +
            "          \"\n" +
            "        >\n" +
            "          <button\n" +
            "            style=\"\n" +
            "              color: white;\n" +
            "              margin-top: 20px;\n" +
            "              margin-bottom: 20px;\n" +
            "              margin-right: 20px;\n" +
            "              margin-left: 20px;\n" +
            "              text-decoration: none;\n" +
            "              border: none;\n" +
            "              background-color: Transparent;\n" +
            "              outline: none;\n" +
            "            \"\n" +
            "            onclick=\"showFailedTestHideOthers()\"\n" +
            "          >\n" +
            "            Failed Tests\n" +
            "          </button>\n" +
            "        </li>\n" +
            "      </ul>\n" +
            "    </div>";
    public static final String startHtmlEmailPassedTest=
            "  <div id=\"passed-test-section\" style=\"display: none;\">\n" +
            "      <table>\n" +
            "        <thead>\n" +
            "          <tr>\n" +
            "            <th style=\"background-color: #4caf50;\">Parameter</th>\n" +
            "            <th style=\"background-color: #4caf50;\">Method Name</th>\n" +
            "            <th style=\"background-color: #4caf50;\">Time</th>\n" +
            "          </tr>";
    public static final String endHtmlEmailPassedTest=
            "</thead>\n" +
            "      </table>\n" +
            "    </div>";
    public static final String startHtmlEmailSkippedTest=
            "  <div id=\"skipped-test-section\" style=\"display: none;\">\n" +
            "      <table>\n" +
            "        <thead>\n" +
            "          <tr>\n" +
            "            <th style=\"background-color: yellow; color: black;\">Parameter</th>\n" +
            "            <th style=\"background-color: yellow; color: black;\">Method Name</th>\n" +
            "            <th style=\"background-color: yellow; color: black;\">Time</th>\n" +
            "          </tr>";
    public static final String endHtmlEmailSkippedTest=
            "</thead>\n" +
            "      </table>\n" +
            "    </div>";


    public static final String startHtmlEmailFailedTest=
            " <div id=\"failed-test-section\" style=\"display: none;\">\n" +
            "      <table>\n" +
            "        <thead>\n" +
            "          <tr>\n" +
            "            <th style=\"background-color: red; color: black;\">Parameter</th>\n" +
            "            <th style=\"background-color: red; color: black;\">Method Name</th>\n" +
            "            <th style=\"background-color: red; color: black;\">Details</th>\n" +
            "            <th style=\"background-color: red; color: black;\">Time</th>\n" +
            "          </tr>";
    public static final String endHtmlEmailFailedTest=
            "</thead>\n" +
            "      </table>\n" +
            "    </div>";
    public static final String endHtmlEmailReportTest =
            " <script>\n" +
            "         showPassedTestHideOthers=()=> {\n" +
            "            document.getElementById(\"passed-test-section\").style.display = \"block\";\n" +
            "            document.getElementById(\"skipped-test-section\").style.display = \"none\";\n" +
            "            document.getElementById(\"failed-test-section\").style.display = \"none\";\n" +
            "        }\n" +
            "         showSkippedTestHideOthers=()=> {\n" +
            "            document.getElementById(\"passed-test-section\").style.display = \"none\";\n" +
            "            document.getElementById(\"skipped-test-section\").style.display = \"block\";\n" +
            "            document.getElementById(\"failed-test-section\").style.display = \"none\";\n" +
            "        }\n" +
            "        showFailedTestHideOthers=()=> {\n" +
            "            document.getElementById(\"passed-test-section\").style.display = \"none\";\n" +
            "            document.getElementById(\"skipped-test-section\").style.display = \"none\";\n" +
            "            document.getElementById(\"failed-test-section\").style.display = \"block\";\n" +
            "        }\n" +
            "        </script>\n" +
            "  </body>\n" +
            "</html>";
    public static final String startHtmlPassedTest ="<!DOCTYPE html>" +
            "<html lang=\"en\" dir=\"ltr\">" +
            "<head>" +
            "<meta charset=\"utf-8\">" +
            "<title>Custom Report Main Page</title>" +
            "<link rel=\"stylesheet\" href=\"css/passed-page.css\">" +
            "</head>" +
            "<body>" +
            "<div class=\"top-section\">" +
            "<h1>Passed Tests</h1>" +
            "</div>" +
            "<div class=\"passed-test-section\">" +
            "<table>" +
            "<thead>" +
            "<tr>" +
            "<th>Parameter</th>" +
            "<th>Method Name</th>" +
            "<th>Time</th>" +
            "</tr>";
    public static final String startHtmlFailedTest ="<!DOCTYPE html>" +
            "<html lang=\"en\" dir=\"ltr\">" +
            "<head>" +
            "<meta charset=\"utf-8\">" +
            "<title>Custom Report Main Page</title>" +
            "<link rel=\"stylesheet\" href=\"css/failed-page.css\">" +
            "</head>" +
            "<body>" +
            "<div class=\"top-section\">" +
            "<h1>Failed Tests</h1>" +
            "</div>" +
            "<div class=\"passed-test-section\">" +
            "<table>" +
            "<thead>" +
            "<tr>" +
            "<th>Parameter</th>" +
            "<th>Method Name</th>" +
            "<th>Details</th>" +
            "<th>Time</th>" +
            "</tr>";
    public static final String startHtmlSkippedTest ="<!DOCTYPE html>" +
            "<html lang=\"en\" dir=\"ltr\">" +
            "<head>" +
            "<meta charset=\"utf-8\">" +
            "<title>Custom Report Main Page</title>" +
            "<link rel=\"stylesheet\" href=\"css/skipped-page.css\">" +
            "</head>" +
            "<body>" +
            "<div class=\"top-section\">" +
            "<h1>Skipped Tests</h1>" +
            "</div>" +
            "<div class=\"passed-test-section\">" +
            "<table>" +
            "<thead>" +
            "<tr>" +
            "<th>Parameter</th>" +
            "<th>Method Name</th>" +
            "<th>Time</th>" +
            "</tr>";
    public static final String endHtml=
            "</thead>"+
            "</table>"+
            "</div>"+
            "</body>"+
            "</html>";
}
