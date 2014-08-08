package mouseLocator;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IdFileMaker {
	
	public static void setIdList(){
		IdFileMaker.makeIdList();
	}
	
	
	private static void makeIdList(){
		StringBuilder id = new StringBuilder();
		byte[] idInByte;
		final String appzang ="appzang00";
		final String bubblesticker ="bubblesticker";
		final String fish0000 ="fish000";
		final String fish00000 ="fish00000";
		final String fl ="fl0";
		final String jian ="jian00";
		final String linefish ="linefish0";
		final String lmft ="lmft0";
		final String mftoon ="mft0";
		final String stl ="stl";

final String k0814473772  ="0814473772";
final String k0822421377  ="0822421377";
final String k0824895928  ="0824895928";
final String k0843467388  ="0843467388";
final String k0880362308  ="0880362308";
final String k0903746014  ="0903746014";
final String k0928548992  ="0928548992";
final String k0957946007  ="0957946007";
final String k110112113114  ="110112113114";
final String k123456hjr  ="123456hjr";
final String k18902204699  ="18902204699";
final String k20135210  ="20135210";
final String k476928606  ="476928606";
final String k4820201  ="4820201";
final String k49633033  ="49633033";
final String k5202365  ="5202365";
final String k541756  ="541756";
final String k756661  ="756661";
final String k774952  ="774952";
final String k819033  ="819033";
final String k87082822  ="87082822";
final String k89102308  ="89102308";
final String k94706180  ="94706180";
final String k94717627  ="94717627";

final String ka00289  ="a00289";
final String ka00880  ="a00880";
final String ka14259  ="a14259";
final String ka53249  ="a53249";
final String ka559982  ="a559982";
final String kaaa6661  ="aaa6661";
final String kaaapp789  ="aaapp789";
final String kacocotai  ="acocotai";
final String kad4455  ="ad4455";
final String kafish001  ="afish001";
final String kafish002  ="afish002";
final String kago0714  ="ago0714";
final String kago111  ="ago111";
final String kago666  ="ago666";
final String kago6666  ="ago6666";
final String kago168168  ="ago168168";
final String kago888  ="ago888";
final String kak25888  ="ak25888";
final String kandy001  ="andy.001";

final String kb60011  ="b6001-1";
final String kb60012  ="b6001-2";
final String kb60013  ="b6001-3";
final String kb6004  ="b6004";
final String kb6006  ="b6006";
final String kb6007  ="b6007";
final String kb6008  ="b6008";
final String kbbc3313  ="bbc3313";
final String kbibi2288  ="bibi2288";
final String kbuy123  ="buy123";

final String kCarrie1026  ="Carrie1026";
final String kccline  ="cc.line";
final String kcheng666  ="cheng666";
final String kcindy11281014  ="cindy11281014";
final String kck557  ="ck557";
final String kck8855  ="ck8855";
final String kck8856  ="ck8856";
final String kcoco186  ="coco186";
final String kcoco3888  ="coco3888";
final String kcoco38888  ="coco38888";
final String kcoco88188  ="coco88188";
final String kcoco88688  ="coco88688";
final String kcorruptpig1  ="corruptpig1";
final String kcorruptpig2  ="corruptpig2";

final String kdelusionelektel  ="delusion-elektel";
final String kdcl9527  ="dcl9527";
final String kdora5566  ="dora5566";
final String kduckdc  ="duckdc";
final String kdunhill001  ="dunhill001";
final String kdunhill002  ="dunhill002";
final String kdunhill003  ="dunhill003";

final String keaglemsi  ="eaglemsi";
final String kee1992  ="ee1992";
final String kevachang5487  ="evachang5487";
final String kevayann  ="evayann";

final String kfafafa01  ="fafafa01";
final String kfafafa02  ="fafafa02";
final String kfb9889  ="fb9889";
final String kfbyou123  ="fbyou123";
final String kfc8866  ="fc8866";
final String kfei54321  ="fei54321";
final String kfinal01  ="final01";
final String kfish00005  ="fish00005";
final String kfisher20130801  ="fisher20130801";
final String kfisher20130802  ="fisher20130802";
final String kfisher20130803  ="fisher20130803";
final String kfishfish001  ="fishfish001";
final String kfishfish31  ="fishfish31";
final String kfishfish32  ="fishfish32";
final String kfishget001  ="fishget001";
final String kfishget002  ="fishget002";
final String kfishline00001  ="fishline00001";
final String kfuel01  ="fuel01";
final String kfuel02  ="fuel02";
final String kfuel03  ="fuel03";
final String kfx5678  ="fx5678";

final String kgarlintai  ="garlintai";
final String kgettato2013  ="gettato.2013";
final String kgginin77  ="gginin77";
final String kgogo76520  ="gogo76520";
final String kgood166  ="good166";

final String khb47  ="hb47";
final String khk123100  ="hk123100";

final String ki66210  ="i66210";

final String kkenbubble  ="ken.bubble";
final String kkk168168168  ="kk168168168";
final String kkuan01  ="kuan-01";
final String kkunhuangsie  ="kunhuangsie";
final String klcs2710  ="lcs2710";
final String klee20138  ="lee20138";
final String kliamrrr  ="liamrrr";
final String klife727401  ="life727401";
final String klife727402  ="life727402";
final String klife727403  ="life727403";
final String klj8088  ="lj8088";
final String klm2669  ="lm2669";
final String klv123888  ="lv123888";
final String klv2588  ="lv2588";
final String klv52020  ="lv52020";
final String klv66666  ="lv66666";
final String klv8866  ="lv8866";
final String klvaaa520  ="lvaaa520";

final String kmagaruko  ="magaruko";
final String kmars1769  ="mars1769";
final String kmhshop56  ="mhshop56";
final String kmlz1129  ="mlz1129";
final String kmrmadtw  ="mrmadtw";

final String knana23456  ="nana23456";
final String knb9520  ="nb9520";
final String knickbip1006  ="nickbip1006";
final String kNicole2013  ="Nicole2013";
final String kNIKE5566  ="NIKE5566";
final String knpcfish007  ="npcfish007";
final String knt205  ="nt205";
final String knt2051  ="nt205-1";
final String knt8858  ="nt8858";

final String koaoabubunote8  ="oaoabubunote8";
final String kok520q  ="ok520q";
final String kokchen0308  ="okchen0308";
final String kopp899  ="opp899";

final String kpc3344  ="pc3344";
final String kps0088  ="ps0088";
final String kps2233  ="ps2233";
final String kps4455  ="ps4455";
final String kpseudofisher  ="pseudofisher";

final String kqinger1998  ="qinger1998";
final String kqq123888  ="qq123888";

final String kray662  ="ray662";
final String kruo123  ="ruo123";

final String ksummer910906  ="summer910906";

final String ktarutaru1233  ="tarutaru1233";
final String ktc897  ="tc897";
final String ktennistai  ="tennistai";
final String ktv8866  ="tv8866";

final String kujmnhy823  ="ujmnhy823";
final String kusa168  ="usa168";

final String kw3941  ="w3941";
final String kwj333  ="wj333";
final String kX77712  ="X77712";
final String kX77715  ="X77715";
final String kX77716  ="X77716";
final String kX77717  ="X77717";
final String kX77719  ="X77719";
final String kxd5566  ="xd5566";
final String kxian1  ="xian-1";
final String kxian2  ="xian-2";
final String kxiyi328  ="xiyi328";
final String kxy5920  ="xy5920";
final String ky125800  ="y125800";
final String kyang17yang  ="yang17yang";
final String kyauh1021  ="yauh1021";
final String kyauh1022  ="yauh1022";
final String kyaya535  ="yaya535";
final String kyes1238899  ="yes1238899";
final String kyes8877  ="yes8877";
final String kyes888123  ="yes888123";
final String kyes12388123  ="yes12388123";
final String kYES12388858  ="YES12388858";
final String kyuanhsingipad  ="yuanhsingipad";
final String kyy567890  ="yy567890";
final String kzero8825252  ="zero8825252";

		
		try {
			FileOutputStream stream2 = new FileOutputStream("id");
			
			for(int i = 1 ; i <= 6; i++){
				
				id.append(String.format("%s%d\n",appzang,i));
				idInByte = id.toString().getBytes();
				try {
					stream2.write(idInByte);
				} catch (IOException e) {
					e.printStackTrace();
				}
				id.delete(0,id.length());
			}
			
			for(int i = 1 ; i <= 3; i++){
				
				id.append(String.format("%s%d\n",bubblesticker,i));
				idInByte = id.toString().getBytes();
				try {
					stream2.write(idInByte);
				} catch (IOException e) {
					e.printStackTrace();
				}
				id.delete(0,id.length());
			}
			
			for(int i = 1 ; i <= 51; i++){
				
				id.append(String.format("%s%02d\n",fish0000,i));
				idInByte = id.toString().getBytes();
				try {
					stream2.write(idInByte);
				} catch (IOException e) {
					e.printStackTrace();
				}
				id.delete(0,id.length());
			}
			
			for(int i = 1 ; i <= 6; i++){
				
				id.append(String.format("%s%d\n",fish00000,i));
				idInByte = id.toString().getBytes();
				try {
					stream2.write(idInByte);
				} catch (IOException e) {
					e.printStackTrace();
				}
				id.delete(0,id.length());
			}
			
			for(int i = 1 ; i <= 15; i++){
				
				id.append(String.format("%s%02d\n",fl,i));
				idInByte = id.toString().getBytes();
				try {
					stream2.write(idInByte);
				} catch (IOException e) {
					e.printStackTrace();
				}
				id.delete(0,id.length());
			}
			
				for(int i = 1 ; i <= 6; i++){
				
				id.append(String.format("%s%d\n",jian,i));
				idInByte = id.toString().getBytes();
				try {
					stream2.write(idInByte);
				} catch (IOException e) {
					e.printStackTrace();
				}
				id.delete(0,id.length());
			}

			for(int i = 1 ; i <= 50; i++){
				
				id.append(String.format("%s%02d\n",linefish,i));
				idInByte = id.toString().getBytes();
				try {
					stream2.write(idInByte);
				} catch (IOException e) {
					e.printStackTrace();
				}
				id.delete(0,id.length());
			}
			
			for(int i = 1 ; i <= 50; i++){
				
				id.append(String.format("%s%02d\n",lmft,i));
				idInByte = id.toString().getBytes();
				try {
					stream2.write(idInByte);
				} catch (IOException e) {
					e.printStackTrace();
				}
				id.delete(0,id.length());
			}
			
			for(int i = 1 ; i <= 5; i++){
				
				id.append(String.format("%s%d\n",mftoon,i));
				idInByte = id.toString().getBytes();
				try {
					stream2.write(idInByte);
				} catch (IOException e) {
					e.printStackTrace();
				}
				id.delete(0,id.length());
			}

			for(int i = 551 ; i <= 587; i++){
				
				id.append(String.format("%s%d\n",stl,i));
				idInByte = id.toString().getBytes();
				try {
					stream2.write(idInByte);
				} catch (IOException e) {
					e.printStackTrace();
				}
				id.delete(0,id.length());
			}
			

			id.append(String.format("%s\n",k0814473772 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",k0822421377 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",k0824895928 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",k0843467388 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",k0880362308 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",k0903746014 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",k0928548992 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",k0957946007 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",k110112113114 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",k123456hjr ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",k18902204699 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",k20135210 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",k476928606 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",k4820201 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",k49633033 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",k5202365 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",k541756 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",k756661 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",k774952 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",k819033 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",k87082822 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",k89102308 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",k94706180 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",k94717627 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",ka00289 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",ka00880 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",ka14259 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",ka53249 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",ka559982 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",kaaa6661 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",kaaapp789 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",kacocotai ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",kad4455 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",kafish001 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",kafish002 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",kago0714 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",kago111 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",kago666 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",kago6666 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",kago168168 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",kago888 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",kak25888 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",kandy001 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());




			id.append(String.format("%s\n",kb60011 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",kb60012 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",kb60013 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",kb6004 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",kb6006 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",kb6007 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",kb6008 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",kbbc3313 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",kbibi2288 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",kbuy123 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());




			id.append(String.format("%s\n",kCarrie1026 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",kccline ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",kcheng666 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",kcindy11281014 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",kck557 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",kck8855 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",kck8856 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",kcoco186 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",kcoco3888 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",kcoco38888 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",kcoco88188 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",kcoco88688 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",kcorruptpig1 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",kcorruptpig2 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());




			id.append(String.format("%s\n",kdelusionelektel ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",kdcl9527 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",kdora5566 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",kduckdc ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",kdunhill001 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",kdunhill002 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",kdunhill003 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());



			id.append(String.format("%s\n",keaglemsi ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",kee1992 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",kevachang5487 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",kevayann ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());




			id.append(String.format("%s\n",kfafafa01 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",kfafafa02 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",kfb9889 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",kfbyou123 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",kfc8866 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",kfei54321 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",kfinal01 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",kfish00005 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",kfisher20130801 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",kfisher20130802 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",kfisher20130803 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",kfishfish001 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",kfishfish31 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",kfishfish32 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",kfishget001 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",kfishget002 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",kfishline00001 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",kfuel01 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",kfuel02 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",kfuel03 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",kfx5678 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());



			id.append(String.format("%s\n",kgarlintai ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",kgettato2013 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",kgginin77 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",kgogo76520 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",kgood166 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",khb47 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",khk123100 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());



			id.append(String.format("%s\n",ki66210 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());



			id.append(String.format("%s\n",kkenbubble ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",kkk168168168 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",kkuan01 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",kkunhuangsie ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());



			id.append(String.format("%s\n",klcs2710 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",klee20138 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",kliamrrr ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",klife727401 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",klife727402 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",klife727403 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",klj8088 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",klm2669 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",klv123888 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",klv2588 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",klv52020 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",klv66666 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",klv8866 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",klvaaa520 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());



			id.append(String.format("%s\n",kmagaruko ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",kmars1769 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",kmhshop56 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",kmlz1129 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",kmrmadtw ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());



			id.append(String.format("%s\n",knana23456 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",knb9520 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",knickbip1006 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",kNicole2013 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",kNIKE5566 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",knpcfish007 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",knt205 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",knt2051 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",knt8858 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());



			id.append(String.format("%s\n",koaoabubunote8 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",kok520q ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",kokchen0308 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",kopp899 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());



			id.append(String.format("%s\n",kpc3344 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",kps0088 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",kps2233 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",kps4455 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",kpseudofisher ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());




			id.append(String.format("%s\n",kqinger1998 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",kqq123888 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());



			id.append(String.format("%s\n",kray662 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",kruo123 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());



			id.append(String.format("%s\n",ksummer910906 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());



			id.append(String.format("%s\n",ktarutaru1233 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",ktc897 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",ktennistai ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",ktv8866 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());



			id.append(String.format("%s\n",kujmnhy823 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",kusa168 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());




			id.append(String.format("%s\n",kw3941 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",kwj333 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());




			id.append(String.format("%s\n",kX77712 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",kX77715 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",kX77716 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",kX77717 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",kX77719 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",kxd5566 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",kxian1 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",kxian2 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",kxiyi328 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",kxy5920 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());



			id.append(String.format("%s\n",ky125800 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",kyang17yang ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",kyauh1021 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",kyauh1022 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",kyaya535 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",kyes1238899 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",kyes8877 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",kyes888123 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",kyes12388123 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",kYES12388858 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",kyuanhsingipad ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",kyy567890 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());


			id.append(String.format("%s\n",kzero8825252 ));
			idInByte = id.toString().getBytes();
			try{
			stream2.write(idInByte);
			}catch(IOException e){
			e.printStackTrace();
			}
			id.delete(0,id.length());



			

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
