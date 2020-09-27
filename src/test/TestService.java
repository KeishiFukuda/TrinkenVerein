package test;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * 選んだ選択肢によって問題文を返すサービスクラス。問題文はArrayListで管理
 * indexでとりやすくする意図。
 *
 */

public class TestService {
	public static QuestionDTO move(AnswerDTO answers) {

		List<String> questions = new ArrayList<String>();
//		questions.add("ビールが好き？or苦手？");  <== 最初に呼ばれるjspに置いておく。
		questions.add("苦味・渋味orフルーティ");
		questions.add("値段高い？or安い？");

//		初期値
		QuestionDTO question = new QuestionDTO();
		question.setQuestion(questions.get(0));
		return question;




	}

}
