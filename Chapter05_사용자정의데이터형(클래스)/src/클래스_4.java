import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
/*
 * <ul class="common_sp_list_ul ea4" style="padding:0 0 0 8px;">
            <li class="common_sp_list_li">
                <div class="common_sp_thumb">
                    <a href="/recipe/7039214" class="common_sp_link">
                                                <img src="https://recipe1.ezmember.co.kr/cache/recipe/2024/11/24/565de119b099835a80ffdfc4006583621_m.jpg">
                    </a>
                </div>
                <div class="common_sp_caption">
                    <div class="common_sp_caption_tit line2">치킨너겟 교촌 허니콤보 만들기</div>
                    <div class="common_sp_caption_rv_name" style="display: inline-block; vertical-align: bottom;">
                        <a href="/profile/recipe.html?uid=59304070"><img src="https://recipe1.ezmember.co.kr/cache/rpf/2024/10/24/1455cb2a66c286ac31d1c570f1276de11.jpg">태형제맘</a>
                    </div>
                    <div class="common_sp_caption_rv">
                                                    <span class="common_sp_caption_rv_star"><img src="https://recipe1.ezmember.co.kr/img/mobile/icon_star2_on.png"><img src="https://recipe1.ezmember.co.kr/img/mobile/icon_star2_on.png"><img src="https://recipe1.ezmember.co.kr/img/mobile/icon_star2_on.png"><img src="https://recipe1.ezmember.co.kr/img/mobile/icon_star2_on.png"><img src="https://recipe1.ezmember.co.kr/img/mobile/icon_star2_on.png"></span>
                            <span class="common_sp_caption_rv_ea">(2)</span>
                                                <span class="common_sp_caption_buyer" style="vertical-align: middle;">조회수 1,853</span>
                    </div>
                </div>
            </li>
 */

class RecipeSite
{
	static Recipe[] recipes = new Recipe[40];
	static
	{
		try {
			int j=0;
			Document doc = Jsoup.connect("https://www.10000recipe.com/recipe/list.html").get();
			Elements title =doc.select("ul.common_sp_list_ul div.common_sp_caption_tit");
			Elements chef = doc.select("ul.common_sp_list_ul div.common_sp_caption_rv_name");
			for(int i=0;i<title.size();i++) {
				recipes[j]= new Recipe();
				recipes[j].title=title.get(i).text();
				recipes[j].chef=chef.get(i).text();
				j++;
				}
			
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
}
public class 클래스_4 {
	public static void main(String[] args) {
		RecipeSite rs = new RecipeSite();
		System.out.println("레시피 목록");
		for(Recipe r:rs.recipes) {
			System.out.println(r.title);
		}
	}
}
