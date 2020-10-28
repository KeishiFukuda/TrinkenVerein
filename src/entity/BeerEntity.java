package entity;

import lombok.Data;

@Data
public class BeerEntity {
	private Integer registerId;//登録番号
	private String classification;//分類
	private String productName;//製品名
	private String image;//画像データのファイルパス
	private String heading;//製品紹介文見出し
	private String textParagraph1;//製品紹介文
	private String textParagraph2;//製品紹介文
	private String textParagraph3;//製品紹介文
	private Integer price;//価格
	private String shopUrl;//購入サイトURL

}
