package webscrape.WebScrape;

// Jsoup libraries
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

// Class where all the magic happens
public class WebScrape {
    public static void main(String[] args) {
        final String url =
                "https://www.telegraph.co.uk/markets-hub/assets/shares/?filter=ftse250";
                //"https://www.tomato.gg/stats/NA/NIKOLI149=1007862931";
                // My new link
        try {
            final Document document = Jsoup.connect(url).get();
            System.out.println(document.outerHtml());
            /*for (Element row : document.select(
                    "table.tablesorter.full tr"))
                if (row.select("td:nth-of-type(1)").text().equals("")) {
                    continue;
                }
                else {
                    final String ticker =
                            row.select("td:nth-of-type(1)").text();
                    final String name =
                            row.select("td:nth-of-type(2)").text();
                    final String tempPrice =
                            row.select("td.right:nth-of-type(3)").text();
                    final String tempPrice1 =
                            tempPrice.replace(",", "");
//                    final double price = Double.parseDouble(tempPrice1);

                    System.out.println(ticker + " " + name + " " + tempPrice1);
                }
            }*/
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}