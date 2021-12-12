const quotes = [
    {
        quote: "찍느냐 붓느냐, 그것이 문제로다",
        author: "사장님",
    },
    {
        quote: "액션 빔",
        author: "짱구",
    },
    {
        quote: "곰은 사람을 찢어",
        author: "정준하",
    },
    {
        quote: "빵상",
        author: "깨랑까랑",
    },
    {
        quote: "음~ 맛있다",
        author: "마트 다녀오셨어요?",
    },
    {
        quote: "공부하는 이들을 위한 채널",
        author: "사오tv",
    },
    {
        quote: "소재가 떨어진다",
        author: "귀찮음",
    },
    {
        quote: "명언9",
        author: "9 맞나?",
    },
    {
        quote: "진짜 명언 9",
        author: "ㅇㄱㄹㅇ",
    },
    {
        quote: "호오오박고구마 호오박고구마 호박고구마 호박고구마 ㅎ박고구마!!!",
        author: "이제 됐냐?!!!!"
    }
];

const quote = document.querySelector("#quote span:first-child")
const author = document.querySelector("#quote span:last-child")

const todaysQuote = quotes[Math.floor(Math.random()*quotes.length)];


quote.innerText = todaysQuote.quote;
author.innerText = todaysQuote.author;