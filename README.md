# quotes

## Description method
the method it read jason file inside resources folder and print the author of book and the text as quotes 
i split jason file to object of string and convert it to Book class

## How you use my code 

first add library to dependencies 
``
implementation 'com.google.code.gson:gson:2.9.0'
``

second we can use  call the method in main method of your app 

such as 

````
quotesClass quotesClass = new quotesClass(); // create object 

quotesClass.quotes() we can see in thrminal after run the app 
--------------------------
Book{author='Patrick Ness', quotes='But the thing about good ideas is that they grow other ideas.'}
Book{author='Gregory David Roberts', quotes='Mumbai is the sweet, sweaty smell of hope, which is the opposite of hate; and it's the sour, stifled smell of greed, which is the opposite of love. It's the smell of Gods, demons, empires, and civilizations in resurrection and decay. Its the blue skin-smell of the sea, no matter where you are in the island city, and the blood metal smell of machines. It smells of the stir and sleep and the waste of sixty million animals, more than half of them humans and rats. It smells of heartbreak, and the struggle to live, and of the crucial failures and love that produces courage. It smells of ten thousand restaurants, five thousand temples, shrines, churches and mosques, and of hunderd bazaar devoted exclusively to perfume, spices, incense, and freshly cut flowers. That smell, above all things - is that what welcomes me and tells me that I have come home. '}
Book{author='办�?�明尼�?达大学�?�城分校毕业�?[学历认�?University of Minnesota Twin Cities', quotes='办�?�明尼�?达大学�?�城分校毕业�?|||||||微信Q：930083900<<<<<;办�?�毕业�?�?办�?��?绩�?��?办�?�教育部学历认�?�?为留学生办�?�学历文凭�?使馆留学回国人员�?明�?录�?�通知书�?Offer�?在读�?明�?雅�?托�?�?绩�?��?网上存档永久�?�查�?专业�?��?�“英国�?加拿大�?�?大利，澳洲�?新西兰�?美国 �?等国的学历学�?真实教育部认�?�?使馆认�?。专业办�?�国外�?�高校的毕业�?，�?绩�?�，长期专业为留学生解决毕业难的问题，�?实体公�?�，值得信赖】'}
Book{author='Nayyirah Waheed', quotes='as you are.’ says the universe. ‘after…’ you answer. ‘as you are.’ says the universe. ‘before…’ you answer. ‘as you are.’ says the universe. ‘when…’ you answer. ‘as you are.’ says the universe. ‘how…’ you answer. ‘as you are.’ says the universe. ‘why…’ you answer. ‘because you are happening now. right now. right at this moment and your happening is beautiful. the thing that both keeps me alive and brings me to my knees. you don’t even know how breathtaking you are. as you are.’ says the universe through tears. — as you are | you are the prayer'}
````

## Edit for class 9 

## Description method
the method it get a random quotes from API and write this quotes in Data.json file 
if the connection is cut the will get the random quotes from data.json 

## How you use my code

gradle uses in my project
``
implementation 'com.google.code.gson:gson:2.9.0'
implementation 'com.google.code.gson:gson:2.9.0'
implementation 'com.github.cliftonlabs:json-simple:3.1.0'

``

second we can use  call the method in main method of your app

such as

````
APIQuotes test = new APIQuotes(); test.quotes();  // create object 

 test.quotes(); we can see in thrminal after run the app 
RandomQuotes{author='Chloe Salinas', quotes=' Never half-ass two things. Whole-ass one thing. '}

````

## notes : in class Quotes class it contain all method 


