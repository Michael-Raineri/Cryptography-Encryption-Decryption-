package MichaelRaineri;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String q1PlainTextSnip = "hissighthehadobviouslynotdiscernedheryetinherpositionagainstthesunbu";
        String q1Upper = q1PlainTextSnip.toUpperCase() ;
        String q5Cipher = "SHRECNHEOAOEEICURIOTNSIEYOHCEAACANOEWTHAAIURYTKUNSTSFISSESERSHHIPOSMARERGESRLSNRAGTUEOSJEDGHSLTHTHHBGRELHAHAORHHERTCUTSNNFOERBOOSRDOYSJEDHRNOTMEATEMNTURLDHTMKUDPESXOUEHNSLOVTNCHMEWSTAIOTNYEKYTITEHOTCOTEETATKIDTBEODABLREESWIDBUEUCTIETLHOEIEAEELIELASHEAARETHGHUEHEUAOOFUHIEWEEUNCAHSCHBNSASUDIAYHSIHNNDOUWHPURRIATLMEYEREYRSKISTUEOOVFOARHWEFAOFRMMHIWEFDERNTEIEEEDSAHLDESOSAHOROWEFATRNLHFKRTRUELDDBAEAHERVESLRMTHLENDRTHDTOTETAIETENTLAORCENNIOOIIREAEOMALTINEPOYIRFIIFFKBWSWUEOURSTORFTRTEEATNHDHEDEYOVDRTMWHLILELSFTUENESIRHRHHDCIHESODRRYSNEDDTTHEERHDITTEHETTOTAGSMERHUSTHMDOLMNERSAGSNWDTPLLCRONDLSOILFSEEANFOYFUOSYLRRLVTHROJTNHETNHTOHESTTOTIDVEAHEOLANLEIISROYWTUOSEUALMAODUMESHHEFMSHBALRLESTHORAVEONHREHEVSEGAWEETNINYVUATOAOYNOOLLTYTDREHTHEMHDATLIROOTNIOLAILEWEDDUHEETTWEPAIHEHHUHLUISIEWNESRINNCEEFEEHSTTRSNASDTETETUEEVOIUOUDYIICWFEMSDENDGEDMAWEIY";
        String q6Cipher = "AIMANKCINNLSSNTTRTGRRPTMIREENEROHNMNAEIIPPLRTNDWREHHDAUNSTUAOHPOAEDTDNXOEDRAMREKIZHTWTEVDCEEIEHLROTELESAEAONTDSTANSHIWOHEMAROMWHEMISAACESFOEMOISANNLAAOMDMNRASNAOYSSAEHRWEEOTOLIHOPHEIAEEANYEHTTOEOIINARHWPDFCEIEINFWEESUOMNOATTEDHRNDRRVGTAEPDWLISDHPTARNEONOSGUDTTROLOTRFENAWEHEAHDTPHDLREKOAOMMHSNAOAPSALLMEISVTAOHSTFMASCDSOUCCHSMELPNRSRDCHHELEERAERASNGAAYSRMEOFEIGREHHNTEENEEEAHCKEEEIPYLEONBIUBTIMAIQNEAAHBOEOOHOSTHERLNNUYSECEINMMHSOTIADIUAUECGNTTEEYLRSINOECDINETRNSDOIIHSIAOEIETFMYTHOHREFAERPDTIARHYTVHMCHGTASTWARTHRTONDTJTPAUSSIEHOOTSWSMEATRPSNMLFRTDINTHLPIAOTDNSPMDRACDCIIIAHILAEEYRASDENTBRYNEIOWMSTSRLLCODIHEREEOSLKMAGTRIENICWMIAIRLECIUGIINYOHAHIIELEDCWEBHSHLHRHRAITKYSEEFTHTRRHENECVIHHATOTUDDERAIUHATLOAOTIRACNNTONOTLIIONHSLCHYMIEDAOHADETIEELHFSIDEMTXHDOORHTRCAHREHENNEHFAYDSITAGSUASUNEDANTAILAEIESADOILDHTPTNSEHEREOERTIKANEADHUHMAYDHBFNO";
        String q5PlanText = "SOCAUGHTHISARMBETWEENTHECASEMENTANDTHESTONEMULLIONDAMNATIONYOUAREVERYCRUELHESAIDSNATCHINGOUTHISARMNONOIKNOWYOUDIDNTDOITONPURPOSEWELLISHALLEXPECTYOUORYOURMOTHERANDCHILDRENATLEASTISHALLNOTCOMEIHAVEPLENTYOFMONEYSHECRIEDWHEREATMYFATHERINLAWSIFIASKFORITIFYOUASKFORITBUTYOUWONTTESSIKNOWYOUYOULLNEVERASKFORITYOULLSTARVEFIRSTWITHTHESEWORDSHERODEOFFJUSTATTHECORNEROFTHESTREETHEMETTHEMANWITHTHEPAINTPOTWHOASKEDHIMIFHEHADDESERTEDTHEBRETHRENYOUGOTOTHEDEVILSAIDDURBERVILLETESSREMAINEDWHERESHEWASALONGWHILETILLASUDDENREBELLIOUSSENSEOFINJUSTICECAUSEDTHEREGIONOFHEREYESTOSWELLWITHTHERUSHOFHOTTEARSTHITHERHERHUSBANDANGELCLAREHIMSELFHADLIKEOTHERSDEALTOUTHARDMEASURETOHERSURELYHEHADSHEHADNEVERBEFOREADMITTEDSUCHATHOUGHTBUTHEHADSURELYNEVERINHERLIFESHECOULDSWEARITFROMTHEBOTTOMOFHERSOULHADSHEEVERINTENDEDTODOWRONGYETTHESEHARDJUDGEMENTSHADCOMEWHATEVERHERSINSTHEY";
        String q6PlainText = "EDMANACLOISTERIMPLIESAMONKANDAMONKROMANCATHOLICISMANDROMANCATHOLICISMSINANDSINDAMNATIONTHOUARTINAPARLOUSSTATEANGELCLAREIGLORYINMYPROTESTANTISMSHESAIDSEVERELYTHENCLARETHROWNBYSHEERMISERYINTOONEOFTHEDEMONIACALMOODSINWHICHAMANDOESDESPITETOHISTRUEPRINCIPLESCALLEDHERCLOSETOHIMANDFIENDISHLYWHISPEREDINHEREARTHEMOSTHETERODOXIDEASHECOULDTHINKOFHISMOMENTARYLAUGHTERATTHEHORRORWHICHAPPEAREDONHERFAIRFACECEASEDWHENITMERGEDINPAINANDANXIETYFORHISWELFAREDEARMERCYHESAIDYOUMUSTFORGIVEMEITHINKIAMGOINGCRAZYSHETHOUGHTTHATHEWASANDTHUSTHEINTERVIEWENDEDANDCLAREREENTEREDTHEVICARAGEWITHTHELOCALBANKERHEDEPOSITEDTHEJEWELSTILLHAPPIERDAYSSHOULDARISEHEALSOPAIDINTOTHEBANKTHIRTYPOUNDSTOBESENTTOTESSINAFEWMONTHSASSHEMIGHTREQUIREANDWROTETOHERATHERPARENTSHOMEINBLACKMOORVALETOINFORMHEROFWHATHEHADDONETHISAMOUNTWITHTHESUMHEHADALREADYPLACEDINHERHANDSABOUTFIFTYPOUNDSHEHO";
        String q7Cipher = "GBZBSAIBWHZYBKJCHZNEZGFKHBZGBZGFIZGBCIZNJHZGAKZFYMKZRJHZHGBVZGFIZEFCCBWZFLFAWZHNZGAKZKAIBZENYZKGBZGFIZWNHZXNMBZENYPFYIZYBMFAWAWLZKHACCZAWZHGBZNQBWAWLZNEZHGBZINNYPFVZMBYBZVBCCNPZKUBCBHNWZHGFHZGBZPFKZWNPZGBZEBCHZHGBZXNWHYFKHZRBHPBBWZHGBMZFWIZHGNJLGHZGAKZFQQBFYFWXBZIAKHFKHBEJCZHNZGBYZHBKKZGBZKFAIZGJKUACVZXFWZVNJZENYLASBZMBZENYZLNAWLZFPFVZXFWHZVNJZXNMBZHNZMBZGNPZINZVNJZLBHZHNZRBZCAUBZHGAKZAHZAKZHNNZCFHBZKFAIZKGBZGBYZSNAXBZKNJWIAWLZGFYIZHGYNJLGZHGBZYNNMZGBYZBVBKZKGAWAWLZJWWFHJYFCCVZAZIAIZWNHZHGAWUZYALGHCVZNEZVNJZAZIAIZWNHZKBBZVNJZFKZVNJZPBYBZGBZXNWHAWJBIZHNZQCBFIZAZGFSBZCBFYWHZHNZKAWXBZIBFYBKHZHBKKVZMAWBZHNNZCFHBZHNNZCFHBZKGBZKFAIZPFSAWLZGBYZGFWIZAWZHGBZAMQFHABWXBZNEZFZQBYKNWZPGNKBZHNYHJYBKZXFJKBZBSBYVZAWKHFWHZHNZKBBMZFWZGNJYZINWHZXNMBZXCNKBZHNZMBZFWLBCZWNZVNJZMJKHZWNHZUBBQZFPFVZRJHZINWHZVNJZCNSBZMBZMVZIBFYZPAEBZRBXFJKBZAZGFSBZRBBWZK";
        char[] q7chars = q7Cipher.toCharArray();
        String q7PlainText = "HE|EVIDENT|RESULT|OF|HASTE|HE|HAD|HELD|OUT|HIS|ARMS|BUT|THEY|HAD|FALLEN|AGAIN|TO|HIS|SIDE|FOR|SHE|HAD|NOT|COME|FORWARD|REMAINING|STILL|IN|THE";


        // Used to remove letters "Z" from Q7 for frequency analysis
/*
        for (char letter: q7chars){
            if (letter == 'Z'){
                System.out.print(" ");
            }
            else{
                System.out.print(letter);
            }
        }
*/




        convert(q1Upper);
        System.out.println();
        convert(q5PlanText);
        System.out.println();
        convert(q6PlainText);
        System.out.println();
        convert(q7PlainText);




    }
    public static void convert(String text){
        for (int i = 0 ; i < 30; i++){
            text.charAt(i);
            System.out.print(text.charAt(i));
        }

    }
}
