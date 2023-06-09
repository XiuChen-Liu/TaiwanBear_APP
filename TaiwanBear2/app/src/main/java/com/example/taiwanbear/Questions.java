package com.example.taiwanbear;

public class Questions {


    public String mQuestions[] = {
            //1~5
            "請問臺北是什麼地形?","請問新竹是什麼地形?","請問高雄是什麼地形?","新竹地區是屬於什麼氣候呢?","下列哪一個城市不是台灣的直轄市?",
            //6~10
            "台灣的首都是哪個縣市?","傳統戲曲歌仔戲的發源地是哪?","台灣人口最多的城市是哪一個?","下列城市哪一個以多雨聞名?","全台唯一不靠海的縣市是哪一個?",
            //11~15
            "有「台灣米倉」之稱的是哪一個城市?","下列哪一個為中部唯一個直轄市?","苗栗地區地形多樣，哪個不是苗栗有的地形?","雲林屬於什麼氣候呢?","有「山城」之稱的是下列哪個城市?",
            //16~20
            "嘉南平原為台灣重要農業產區，請問它位於哪個縣市?","台灣西部南北最狹長的城市是哪個?","全台面積最大的縣市是哪個?","有「台灣的後花園」之稱的是哪個城市?","位在花蓮的縱谷平原屬於什麼地形?",
            //21~25
            "八二三炮戰、古寧頭戰役是發生在哪?","澎湖四面環海，年雨量高，島上居民以什麼維生?","離島當中，哪裡地層主要以花崗片麻岩為主？","離島當中哪個地方遍布玄武岩地形？","金門雨量少、土壤貧瘠，適合種植哪種作物?"

    };

    private String mChoice[][] = {
            /*1~5題選項*/
            {"盆地","高原","丘陵","平原"},
            {"高原","平原","丘陵","臺地"},
            {"盆地","臺地","山地","高原"},
            {"亞熱帶季風氣候","副熱帶季風氣候","海洋性季風氣候","地中海型氣候"},
            {"基隆市","台北市","桃園市","高雄市"},
            /*6~10題選項*/
            {"桃園市","台北市","新北市","台中市"},
            {"宜蘭縣","嘉義縣","台東縣","花蓮縣"},
            {"台北市","高雄市","台中市","新北市"},
            {"南投縣","台南市","苗栗縣","宜蘭縣"},
            {"彰化縣","雲林縣","南投縣","屏東縣"},
            /*11~15題選項*/
            {"彰化縣","雲林縣","嘉義縣","花蓮縣"},
            {"苗栗縣","南投縣","台中市","彰化縣"},
            {"台地","盆地","山地","丘陵"},
            {"苔原氣候","海洋性副熱帶氣候","副熱帶型氣候","地中海型氣候"},
            {"彰化縣","雲林縣","苗栗縣","高雄市"},
            /*16~20題選項*/
            {"台南市","高雄市","嘉義縣","台東縣"},
            {"高雄市","屏東縣","台中市","新竹縣"},
            {"台東縣","屏東縣","花蓮縣","台南市"},
            {"花蓮縣","宜蘭縣","屏東縣","台東縣"},
            {"沖積扇平原","高原","山地","台地"},
            /*21~25題選項*/
            {"金門","馬祖","澎湖","綠島"},
            {"農業","畜牧業","漁業","木業"},
            {"蘭嶼","金門","馬祖","小琉球"},
            {"綠島","澎湖","馬祖","小琉球"},
            {"小米","大麥","高粱","玉米"}
    };


    private String mCorrectAnswers[] = {
            /*1~10題答案*/
            "盆地","丘陵","山地","海洋性季風氣候","基隆市","台北市","宜蘭縣","新北市","宜蘭縣","南投縣",
            /*11~20題答案*/
            "彰化縣","台中市","盆地","副熱帶型氣候","苗栗縣","嘉義縣","屏東縣","花蓮縣","台東縣","沖積扇平原",
            /*21~25題答案*/
            "金門","漁業","金門","澎湖","高粱"
    };


    public String getmQuestions(int a){
        String quesTitle = mQuestions[a];
        return quesTitle;
    };

    public String getmChoice1(int a) {
        String rbtnA = mChoice[a][0];
        return rbtnA;
    };

    public String getmChoice2(int a) {
        String rbtnB = mChoice[a][1];
        return rbtnB;
    };
    public String getmChoice3(int a) {
        String rbtnC = mChoice[a][2];
        return rbtnC;
    };
    public String getmChoice4(int a) {
        String rbtnD = mChoice[a][3];
        return rbtnD;
    };

    public String getCorrectAnswers(int a) {
        String Correctanswer = mCorrectAnswers[a];
        return Correctanswer;
    };
}