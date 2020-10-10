package entity;

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





	public Integer getRegisterId() {
		return registerId;
	}

	public void setRegisterId(Integer registerId) {
		this.registerId = registerId;
	}

	public String getClassification() {
		return classification;
	}

	public void setClassification(String classification) {
		this.classification = classification;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getHeading() {
		return heading;
	}

	public void setHeading(String heading) {
		this.heading = heading;
	}

	public String getTextParagraph1() {
		return textParagraph1;
	}

	public void setTextParagraph1(String textParagraph1) {
		this.textParagraph1 = textParagraph1;
	}

	public String getTextParagraph2() {
		return textParagraph2;
	}

	public void setTextParagraph2(String textParagraph2) {
		this.textParagraph2 = textParagraph2;
	}

	public String getTextParagraph3() {
		return textParagraph3;
	}

	public void setTextParagraph3(String textParagraph3) {
		this.textParagraph3 = textParagraph3;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getShopUrl() {
		return shopUrl;
	}

	public void setShopUrl(String shopUrl) {
		this.shopUrl = shopUrl;
	}

}
