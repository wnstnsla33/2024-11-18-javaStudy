/*
 * 변수 1.기본형 2.배열 3. 클래스
 * 평점 ,구분번호 ,String ,actor
 * 
 * new : 클래스의 메모리 크기를 확인후에 메모리를 할당
 * 
 * class A
 * {
 * int aa;=>0
 * double dd; => 0.0
 * }
 * 
 */

import java.text.DecimalFormat;

class Recipe
{
	String poster;
	String title;
	String chef;
	String chef_poster;
	int star;
	int hit;
}
public class 클래스_3 {
	public static void main(String[] args) {
		//1.recipe 저장
		//2.데이터를 저장할 메모리공간
		Recipe recipe1 = new Recipe();//24byte 메모리 생성
		recipe1.poster ="https://www.10000recipe.com/recipe/6915139";
		recipe1.title="치킨너겟 교촌 허니콤보 만들기";
		recipe1.chef="먹순";
		recipe1.chef_poster="https://www.10000recipe.com/profile/recipe.html?uid=77721145";
		recipe1.star=5;
		recipe1.hit=26;
		System.out.println("레시피 포스터: "+recipe1.poster);
		System.out.println("레시피 제목:" +recipe1.title);
		System.out.println("쉐프 명: "+recipe1.chef);
		System.out.println("쉐프 사진: "+recipe1.chef_poster);
		DecimalFormat df = new DecimalFormat("###,###");
		System.out.println(df.format(recipe1.hit));
		
		for(int i=1;i<=recipe1.star;i++) {
			System.out.print("★");
		}
		Recipe recipe2 = new Recipe();
		recipe2.poster="https://www.10000recipe.com/recipe/6873683";
		recipe2.title = "엄마의 레시피,소고기 미역국";
		recipe2.chef = "베리츄";
		recipe2.star = 5;
		recipe2.hit = 1331;
		recipe2.chef_poster= "https://recipe1.ezmember.co.kr/cache/rpf/2017/07/09/a641a392fe9f455cac9350a7cff6af3e1.jpg";
		System.out.println("레시피 포스터: "+recipe2.poster);
		System.out.println("레시피 제목:" +recipe2.title);
		System.out.println("쉐프 명: "+recipe2.chef);
		System.out.println("쉐프 사진: "+recipe2.chef_poster);
		System.out.println(df.format(recipe2.hit));
		
		for(int i=1;i<=recipe1.star;i++) {
			System.out.print("★");
		}
				
	}

}
