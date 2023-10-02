package hu.webuni.bookshop.service;

import java.time.LocalDate;
import java.util.ArrayList;
import javax.transaction.Transactional;
import org.springframework.stereotype.Service;
import hu.webuni.bookshop.model.Author;
import hu.webuni.bookshop.model.Book;
import hu.webuni.bookshop.repository.AuthorRepository;
import hu.webuni.bookshop.repository.BookRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class InitDbService {

	private BookRepository bookRepository;
	private AuthorRepository authorRepository;
	
	@Transactional
	public void init() {
		
		Author a0 = new Author(0, "Bálint Piroska", LocalDate.parse("1994-04-01"),new ArrayList<>());
		this.authorRepository.save(a0);
		Author a1 = new Author(0, "Danielle Graf", LocalDate.parse("1992-04-23"),new ArrayList<>());
		this.authorRepository.save(a1);
		Author a2 = new Author(0, "Elma Van Vliet", LocalDate.parse("1983-06-24"),new ArrayList<>());
		this.authorRepository.save(a2);
		Author a3 = new Author(0, "Jo Foster", LocalDate.parse("1986-04-28"),new ArrayList<>());
		this.authorRepository.save(a3);
		Author a4 = new Author(0, "Mihalec Gábor", LocalDate.parse("1983-06-20"),new ArrayList<>());
		this.authorRepository.save(a4);
		Author a5 = new Author(0, "Deliága Éva", LocalDate.parse("1977-07-20"),new ArrayList<>());
		this.authorRepository.save(a5);
		Author a6 = new Author(0, "Kádár Annamária", LocalDate.parse("1999-07-13"),new ArrayList<>());
		this.authorRepository.save(a6);
		Author a7 = new Author(0, "Melinda Blau", LocalDate.parse("1987-09-14"),new ArrayList<>());
		this.authorRepository.save(a7);
		Author a8 = new Author(0, "Éve Herrmann", LocalDate.parse("1994-09-13"),new ArrayList<>());
		this.authorRepository.save(a8);
		Author a9 = new Author(0, "Kim John Payne", LocalDate.parse("1976-08-09"),new ArrayList<>());
		this.authorRepository.save(a9);
		Author a10 = new Author(0, "Quentin Gréban", LocalDate.parse("1980-03-05"),new ArrayList<>());
		this.authorRepository.save(a10);
		Author a11 = new Author(0, "Mark Gungor", LocalDate.parse("1979-07-18"),new ArrayList<>());
		this.authorRepository.save(a11);
		Author a12 = new Author(0, "Marie-Héléne Place", LocalDate.parse("1981-03-12"),new ArrayList<>());
		this.authorRepository.save(a12);
		Author a13 = new Author(0, "Francesca Cavallo", LocalDate.parse("1984-03-10"),new ArrayList<>());
		this.authorRepository.save(a13);
		Author a14 = new Author(0, "Patrice Karst", LocalDate.parse("1978-05-23"),new ArrayList<>());
		this.authorRepository.save(a14);
		Author a15 = new Author(0, "Vekerdy Tamás", LocalDate.parse("1977-10-19"),new ArrayList<>());
		this.authorRepository.save(a15);
		Author a16 = new Author(0, "Gombos Edina", LocalDate.parse("1982-11-12"),new ArrayList<>());
		this.authorRepository.save(a16);
		Author a17 = new Author(0, "Robin Lim", LocalDate.parse("1991-07-28"),new ArrayList<>());
		this.authorRepository.save(a17);
		Author a18 = new Author(0, "Dr. Eigner Bernadett", LocalDate.parse("1988-03-20"),new ArrayList<>());
		this.authorRepository.save(a18);
		Author a19 = new Author(0, "Máté Enikő", LocalDate.parse("1998-11-03"),new ArrayList<>());
		this.authorRepository.save(a19);
		Author a20 = new Author(0, "Eva Bronsveld", LocalDate.parse("1993-11-06"),new ArrayList<>());
		this.authorRepository.save(a20);
		Author a21 = new Author(0, "Dr. Major János", LocalDate.parse("1980-11-10"),new ArrayList<>());
		this.authorRepository.save(a21);
		Author a22 = new Author(0, "Cziglécki Gábor", LocalDate.parse("1984-05-07"),new ArrayList<>());
		this.authorRepository.save(a22);
		Author a23 = new Author(0, "Michele Borba", LocalDate.parse("1980-07-07"),new ArrayList<>());
		this.authorRepository.save(a23);
		Author a24 = new Author(0, "Dr. Mary Hartzell", LocalDate.parse("1979-05-01"),new ArrayList<>());
		this.authorRepository.save(a24);
		Author a25 = new Author(0, "Dobiné Olasz-Papp Nóra", LocalDate.parse("1979-05-08"),new ArrayList<>());
		this.authorRepository.save(a25);
		Author a26 = new Author(0, "Gary Chapman", LocalDate.parse("1990-09-09"),new ArrayList<>());
		this.authorRepository.save(a26);
		Author a27 = new Author(0, "Lara Pollero", LocalDate.parse("1990-02-03"),new ArrayList<>());
		this.authorRepository.save(a27);
		Author a28 = new Author(0, "Dr. Shefali Tsabary", LocalDate.parse("1991-07-26"),new ArrayList<>());
		this.authorRepository.save(a28);
		Author a29 = new Author(0, "Daniel Siegel", LocalDate.parse("1993-06-14"),new ArrayList<>());
		this.authorRepository.save(a29);
		Book b0 = new Book(0, "A Varázskert- Szorongásoldás és képzeletfejlesztés", "9320271145131", "A Varázskert gyakorlatsorozat egy képzelőerő - fejlesztő - relaxációs program 5-12 éves gyerekek...", 3790, new ArrayList<>());
		this.bookRepository.save(b0);b0.addAuthor(a0);
		Book b1 = new Book(0, "Kötődő nevelés- A világ legjobban várt babái, akik most megőrjítenek", "1295654455303", "Amikor a mi kis napsugarunk egyszer csak a földre hajítja a tányérját...A lefekvés egy rémálom?...", 4749, new ArrayList<>());
		this.bookRepository.save(b1);b1.addAuthor(a1);
		Book b2 = new Book(0, "Nagyi, kérlek... - Új, ünnepi kiadás- Emlékek ajándékba - Kérdezz-felelek a nagymamával régi időkről, napjainkról és sok minden másról", "4341308845486", "Vannak nagymamák, akik negyvenöt évesek, és vannak, akik már a kilencvenötödik évükben járnak...", 3799, new ArrayList<>());
		this.bookRepository.save(b2);b2.addAuthor(a2);
		Book b3 = new Book(0, "Anya, kérlek... - Új, ünnepi kiadás- Emlékek ajándékba. Kérdezz-felelek a régi időkről, napjainkról és sok minden másról", "5661356062591", "Mindenkinek vannak az életében nagyon fontos emberek. Van, akit azért szeretünk, amilyen, mások...", 3799, new ArrayList<>());
		this.bookRepository.save(b3);b3.addAuthor(a2);
		Book b4 = new Book(0, "Az én családfám- Családtörténeti emlékkönyv", "4203015626291", "Minden családnak megvan a maga története, melynek felfedezése bármennyi fáradozást megér. Könyvünk...", 7120, new ArrayList<>());
		this.bookRepository.save(b4);b4.addAuthor(a3);
		Book b5 = new Book(0, "Gyűrű-kúra- A sikeres házasság kézikönyve kezdőknek, házasoknak és újrakezdőknek", "1175120268805", "A Gyűrű-kúra kihagyhatatlan olvasmány házasságra készülőknek, de haszonnal forgathatják a...", 4275, new ArrayList<>());
		this.bookRepository.save(b5);b5.addAuthor(a4);
		Book b6 = new Book(0, "Mit kezdjünk a szorongással?- Pszichológiai útmutató + félelemoldó mesék", "8166395292076", "A nagy sikerű Mit kezdjünk az akaratossággal? című könyv folytatásában a pszichológus-pedagógus...", 2992, new ArrayList<>());
		this.bookRepository.save(b6);b6.addAuthor(a5);
		Book b7 = new Book(0, "A TE meséd- Történetek rólad, neked", "3118169134599", "Kedves Édesanya és Édesapa! Az egyik legszebb ajándék, amit gyermekünknek adhatunk, ha...", 4265, new ArrayList<>());
		this.bookRepository.save(b7);b7.addAuthor(a6);
		Book b8 = new Book(0, "Nagymama naplója- Unokáimnak", "8610286695975", "Kikészíti egy-két éves gyermeke szüntelen követelőzése, hisztizése és engedetlensége? Aggódik, hogy...", 5224, new ArrayList<>());
		this.bookRepository.save(b8);b8.addAuthor(a7);
		Book b9 = new Book(0, "A suttogó titkai 1.- A csecsemő gondozása és nevelése", "9404349131868", "Suttogónak eredetileg azt nevezték, aki különleges képessége folytán pusztán türelemmel és halk...", 52241, new ArrayList<>());
		this.bookRepository.save(b9);b9.addAuthor(a7);
		Book b10 = new Book(0, "00 Montessori fejlesztő gyakorlat 15 hónapos kortól- A gyermek támogatása az első felfedezések időszakában", "3955001357144", "A gyermekközpontú szemlélet elterjedése a köztudatban nagyon nagy részben a jeles olasz...", 3799, new ArrayList<>());
		this.bookRepository.save(b10);b10.addAuthor(a8);
		Book b11 = new Book(0, "Melegszívű fegyelmezés- Kisgyerekkortól kamaszkorig", "9647844255438", "A gyereknevelésben ugyanúgy vannak korszakok és divatok, mint a kultúra minden más területén. Volt...", 3591, new ArrayList<>());
		this.bookRepository.save(b11);b11.addAuthor(a9);
		Book b12 = new Book(0, "Házasság 2.0- A kapcsolatot cseréld, ne a társad!", "5851649043817", "A népszerű Gyűrű-kúra szerzője ezúttal azokhoz a párokhoz szól, akik hosszú éveket, akár...", 3325, new ArrayList<>());
		this.bookRepository.save(b12);b12.addAuthor(a4);
		Book b13 = new Book(0, "Szeretlek, anya!- 31 őszinte vallomás", "8482900807346", "Sokszor azoknak fogalmazzuk meg a legnehezebben, hogy mennyire fontosak nekünk, akiket a...", 6165, new ArrayList<>());
		this.bookRepository.save(b13);b13.addAuthor(a10);
		Book b14 = new Book(0, "Férfiagy, női agy- Isten hozott egy jobb házasságban!", "4672303203499", "A házasság egy kozmikus vicc, annyira különbözünk egymástól - írja az előadásairól készült videók...", 47406, new ArrayList<>());
		this.bookRepository.save(b14);b14.addAuthor(a11);
		Book b15 = new Book(0, "0 Montessori fejlesztő gyakorlat kisbabáknak", "1295724133872", "Amikor egy baba világra jön, természetes, hogy telve vagyunk várakozással - féltve óvjuk őt, és...", 3799, new ArrayList<>());
		this.bookRepository.save(b15);b15.addAuthor(a12);
		Book b16 = new Book(0, "Mit kezdjünk az akaratossággal?- Pszichológiai útmutató + dacszelídítő mesék", "3586166872408", "A pszichológus-pedagógus szerzőpáros könyve kettő az egyben: szülőknek szóló, gyakorlatias...", 2992, new ArrayList<>());
		this.bookRepository.save(b16);b16.addAuthor(a5);
		Book b17 = new Book(0, "Esti mesék lázadó lányoknak-100 különleges nő története", "4778701459849", "Mi lenne, ha a hercegnő nem menne feleségül a királyfihoz, mert az autóversenyzés jobban...", 6649, new ArrayList<>());
		this.bookRepository.save(b17);b17.addAuthor(a13);
		Book b18 = new Book(0, "Mesepszichológia a gyakorlatban- Az önbecsülés és a küzdőképesség megalapozása gyermekkorban", "8756892353823", "A mesékben a hős számos nehéz próbatételen keresztül jut el a céljáig. Gyermekünknek felnövekedése...", 3192, new ArrayList<>());
		this.bookRepository.save(b18);b18.addAuthor(a6);
		Book b19 = new Book(0, "A láthatatlan fonal- Az elválással, távolléttel kapcsolatos félelmek enyhítésére", "3967109021707", "Azokat, akik szeretik egymást, összeköti egy láthatatlan fonal. Akkor is, ha éppen távol vannak...", 2093, new ArrayList<>());
		this.bookRepository.save(b19);b19.addAuthor(a14);
		Book b20 = new Book(0, "Jól szeretni- Tudod-e, hogy milyen a gyereked?", "9446212682336", "Megismerlek és elfogadlak. Olyannak, amilyen vagy.A te teljes világodat.Aki jól szeret, az...", 3591, new ArrayList<>());
		this.bookRepository.save(b20);b20.addAuthor(a15);
		Book b21 = new Book(0, "Babanapló", "3668455699177", "Egy gyönyörű emlékkönyv a népszerű televíziós műsorvezető, Gombos Edina előszavával, amelyben...", 4749, new ArrayList<>());
		this.bookRepository.save(b21);b21.addAuthor(a16);
		Book b22 = new Book(0, "Gyermekágy- Testi-lelki útmutató az anyaság első hónapjaira", "2059039303544", "Robin Limtől tanultuk a legtöbbet a születésről és a szülővé válásról. - Cseke Eszter...", 5699, new ArrayList<>());
		this.bookRepository.save(b22);b22.addAuthor(a17);
		Book b23 = new Book(0, "Gyerek születik- Kulcs a biztonságos, örömteli kötődéshez", "5444623828147", "Mindannyian jó szülők szeretnénk lenni, mégis gyakran érezzük, hogy valami félrecsúszik, és minden...", 3999, new ArrayList<>());
		this.bookRepository.save(b23);b23.addAuthor(a18);
		Book b24 = new Book(0, "Babanaplóm", "6415184321504", "Vidám mintás babanapló, babaváró könyvecske, kedves rajzokkal kiegészítve.Ajándéknak is...", 2880, new ArrayList<>());
		this.bookRepository.save(b24);b24.addAuthor(a19);
		Book b25 = new Book(0, "Temperamentumos gyerekek- Hogy adjuk a legjobbat az erős akaratú gyerekeknek?", "3556962546209", "Hogy adjuk a legjobbat az érzékeny, az életet intenzíven élő és erős akaratú gyerekeknek?Eva...", 3999, new ArrayList<>());
		this.bookRepository.save(b25);b25.addAuthor(a20);
		Book b26 = new Book(0, "Fájdalomkezelő kisokos- Önsegítő kalauz szülőknek", "6782862078749", "Van kiút a krónikus fájdalom mindennapos útvesztőjéből! Nem is gondolnánk, hogy a fiatalok több...", 4274, new ArrayList<>());
		this.bookRepository.save(b26);b26.addAuthor(a21);
		Book b27 = new Book(0, "Anya és apa, kérlek... meséljetek rólam! - Babanapló az első év emlékeiről", "5534486642014", "Ez egy különleges emlékkönyv, tele nagyszerű és olykor megható kérdésekkel. Kiváló ajándék minden...", 3199, new ArrayList<>());
		this.bookRepository.save(b27);b27.addAuthor(a2);
		Book b28 = new Book(0, "A mi történetünk - Szerelmemnek", "4459126476568", "A szerelmet nem lehet eléggé ünnepelni! Ha az emlékkönyvben szereplő mondatokat folytatod, örök...", 1999, new ArrayList<>());
		this.bookRepository.save(b28);b28.addAuthor(a2);
		Book b29 = new Book(0, "Várandósok és kismamák gerincének védelme", "4275341557365", "Sobel Gábor szülész-nőgyógyász szakorvos és Czigléczki Gábor idegsebész szakorvos...", 2802, new ArrayList<>());
		this.bookRepository.save(b29);b29.addAuthor(a22);
		Book b30 = new Book(0, "E-könyv -Szárnyalók", "1932401683752", "Mindenki azt szeretné, hogy a gyereke jól teljesítsen és sokra vigye. De ezt nem mindig sikerül...", 2999, new ArrayList<>());
		this.bookRepository.save(b30);b30.addAuthor(a23);
		Book b31 = new Book(0, "Kapcsolódás- Gyógyító erő a nevelésben", "1841687311972", "Talán mindannyiunkkal előfordult, hogy váratlan vagy intenzív érzéseket kiváltó helyzetekben nem...", 4274, new ArrayList<>());
		this.bookRepository.save(b31);b31.addAuthor(a24);
		Book b32 = new Book(0, "Hozzátáplálás- Mikor mit ehet a baba és mit nem (HelloBaby különszám)", "1912259758107", "Nem kétséges, hogy a kisbaba táplálásához kezdetben a kizárólagos anyatejfogyasztás a legjobb...", 4740, new ArrayList<>());
		this.bookRepository.save(b32);b32.addAuthor(a25);
		Book b33 = new Book(0, "Az 5 szeretetnyelv - Szólóban- Egyedül, de nem magányosan", "7358160993985", "A világszerte elismert kapcsolati szakértő könyve mindenkinek szól, aki nem párkapcsolatban él, de...", 3790, new ArrayList<>());
		this.bookRepository.save(b33);b33.addAuthor(a26);
		Book b34 = new Book(0, "A házasság négy évszaka- Állandó megújulásban az örömteli és tartós párkapcsolatért", "7761604371235", "Az évszakok körforgása akárcsak a természetben, a házasságban is újra és újra megismétlődik. Időről...", 3790, new ArrayList<>());
		this.bookRepository.save(b34);b34.addAuthor(a26);
		Book b35 = new Book(0, "Babaváró napló - Tanácsok, ötletek, történetek a terhesség minden napjára", "5674069714515", "Azt a naplót tartod a kezedben, amely végigkísér az elkövetkezendő kilenc hónapon. Az első rész...", 4749, new ArrayList<>());
		this.bookRepository.save(b35);b35.addAuthor(a27);
		Book b36 = new Book(0, "E-könyv -A szülői út", "5116415166687", "Minden szülő képes boldog, egészséges és érzelmileg stabil gyereket felnevelni. Ennek ellenére sok...", 3999, new ArrayList<>());
		this.bookRepository.save(b36);b36.addAuthor(a28);
		Book b37 = new Book(0, "E-könyv -Bölcs születés", "3699475077404", "Minden újszülött egyszer jön a világra. Ezért nekünk, szülőknek és szüléssegítőknek, mindössze egy...", 3999, new ArrayList<>());
		this.bookRepository.save(b37);b37.addAuthor(a17);
		Book b38 = new Book(0, "E-könyv -Agymenés", "5728209058617", "Csak legyünk túl a kamaszkoron!A kamaszok megőrülnek a hormonjaik miatt... És...", 2999, new ArrayList<>());
		this.bookRepository.save(b38);b38.addAuthor(a29);

		
		
		
		
	}
	
}
