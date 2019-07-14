package com.fengxinzi.learning.test;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author fengxinzi <wangjianhua@youzan.com>
 * Date: 2019/3/20 Time: 上午9:26
 */
public class JSONTest {

    public static void main(String[] args) {
        /*System.out.println(JSON.toJSONString(genList()));
        System.out.println(System.getProperty("java.version"));
        getSize();*/
        List<String> list = genList();
        int size = list.size();
        int part = size / 10;
        List<String> stringList;
        for (int i = 0; i < part; i++) {
            stringList = list.subList(0, 10);
            System.out.println(JSON.toJSONString(stringList));
            list.subList(0, 10).clear();
        }
        stringList = list.subList(0, size % 10);
        System.out.println(JSON.toJSONString(stringList));
        System.out.println(list.size());

        String number = "9999999999999";
        Long value = Long.valueOf(number);
        Date data = new Date(value);
        System.out.println(data);
    }

    public static List<String> genList() {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 51; i++) {
            list.add(i+"abc");
        }
//        System.out.println(JSON.toJSONString(list));
        return list;
    }

    public static void getSize() {
        String test = "[\"41925555\", \"40750879\", \"42611535\", \"42086046\", \"41009300\", \"564152\", \"41476701\", \"17011737\", \"42098763\", \"18717944\", \"42376943\", \"42440305\", \"40607978\", \"42539008\", \"41921430\", \"41393051\", \"40589147\", \"343199\", \"40812057\", \"14671440\", \"42389097\", \"40631081\", \"18339951\", \"42165988\", \"42092389\", \"40363137\", \"41510323\", \"42366396\", \"42148117\", \"41284979\", \"41597609\", \"40535156\", \"41284979\", \"40305769\", \"41756582\", \"42161461\", \"41968037\", \"40549239\", \"42125241\", \"41377183\", \"42092538\", \"42211547\", \"42265192\", \"42214903\", \"42134570\", \"40969882\", \"41757041\", \"41454478\", \"41917155\", \"42106015\", \"42146655\", \"42123220\", \"40574514\", \"42129188\", \"41461971\", \"41744634\", \"41911765\", \"40408377\", \"42130280\", \"42080881\", \"40927588\", \"41486143\", \"41909165\", \"41744512\", \"41969876\", \"42093087\", \"42081365\", \"41316930\", \"41590394\", \"40833384\", \"41589273\", \"40999975\", \"41594733\", \"41915630\", \"41908158\", \"679352\", \"41919992\", \"41908795\", \"41447630\", \"41440577\", \"41574042\", \"41755444\", \"40523156\", \"41755815\", \"41372161\", \"41498522\", \"8301164\", \"41536042\", \"41467460\", \"18338875\", \"41536042\", \"41535261\", \"41379849\", \"41470973\", \"19421628\", \"15507092\", \"41568032\", \"41197721\", \"41203898\", \"41408176\", \"41408273\", \"40373484\", \"41211328\", \"16734845\", \"41452981\", \"19247759\", \"41244742\", \"631910\", \"41403080\", \"68886\", \"17301245\", \"19054131\", \"17900719\", \"17798019\", \"16847410\", \"41221502\", \"19415414\", \"41207067\", \"2343685\", \"41325442\", \"41288171\", \"41030560\", \"19445447\", \"40825844\", \"1747613\", \"41307669\", \"40006495\", \"41078260\", \"19023673\", \"41074624\", \"40749597\", \"40437614\", \"41023518\", \"41130026\", \"14708459\", \"41074624\", \"41209645\", \"40962528\", \"41176443\", \"41176001\", \"41138722\", \"41193148\", \"41153423\", \"40826282\", \"40927361\", \"41022129\", \"40564690\", \"40858201\", \"18536604\", \"40533687\", \"11239541\", \"40984389\", \"40855148\", \"15282793\", \"41074864\", \"19368144\", \"40613770\", \"40154390\", \"40969179\", \"41007433\", \"40498329\", \"40376300\", \"40782063\", \"19248858\", \"1\", \"19075839\", \"40187969\", \"40323886\", \"40017907\", \"19159916\", \"19368763\", \"19278948\", \"18334847\", \"19335903\", \"11278458\", \"19420299\", \"19336346\", \"19437975\", \"19448621\", \"16719442\", \"18007006\", \"19404131\", \"16594038\", \"18357098\", \"19309108\", \"18601096\", \"19196486\", \"19399178\", \"19401081\", \"19377817\", \"19403564\", \"19391088\", \"17217453\", \"15640622\", \"18509334\", \"19178435\", \"18172167\", \"19129881\", \"153936\", \"18152468\", \"914799\", \"19307533\", \"19311510\", \"19311266\", \"19019944\", \"18664082\", \"36\", \"172\", \"353\", \"613\", \"637\", \"2617\", \"2901\", \"19304505\", \"19306673\", \"19300520\", \"3801\", \"3962\", \"4081\", \"18904189\", \"19226222\", \"18686234\", \"4188\", \"4829\", \"5629\", \"5939\", \"6105\", \"6544\", \"6830\", \"7560\", \"9505\", \"11848\", \"12198\", \"12286\", \"12500\", \"13594\", \"13811\", \"13857\", \"14737\", \"16952\", \"17195\", \"17195\", \"17195\", \"17850\", \"17897\", \"18796\", \"18873\", \"18894\", \"19216630\", \"19336\", \"19336\", \"20293\", \"20640\", \"20762\", \"22410\", \"22868\", \"24130\", \"27415\", \"28610\", \"29907\", \"31893\", \"32185\", \"33746\", \"36894\", \"41564\", \"41945\", \"42190\", \"43594\", \"44517\", \"44932\", \"45308\", \"47999\", \"49004\", \"49598\", \"49709\", \"50955\", \"53764\", \"54023\", \"55845\", \"55863\", \"58912\", \"62645\", \"63602\", \"67162\", \"67309\", \"68473\", \"68907\", \"70712\", \"72102\", \"75797\", \"76815\", \"77406\", \"77643\", \"81110\", \"84172\", \"84390\", \"87031\", \"88585\", \"95485\", \"97352\", \"97452\", \"108238\", \"108929\", \"109360\", \"110353\", \"114570\", \"116299\", \"116393\", \"117309\", \"117902\", \"117974\", \"120945\", \"126642\", \"126716\", \"126762\", \"130704\", \"148667\", \"151714\", \"153434\", \"154985\", \"164932\", \"171949\", \"172938\", \"174800\", \"175124\", \"179049\", \"223050\", \"228679\", \"232854\", \"232919\", \"235375\", \"241998\", \"241998\", \"243045\", \"261936\", \"269181\", \"271154\", \"19273971\", \"273522\", \"277608\", \"285472\", \"299858\", \"310565\", \"318885\", \"323851\", \"331406\", \"343569\", \"355994\", \"371189\", \"383189\", \"385061\", \"395886\", \"399487\", \"421968\", \"431359\", \"19016946\", \"436873\", \"442103\", \"445566\", \"446882\", \"448407\", \"449667\", \"449720\", \"466900\", \"19186791\", \"467186\", \"468071\", \"500260\", \"500387\", \"501288\", \"508385\", \"508385\", \"512708\", \"516687\", \"516745\", \"526807\", \"535779\", \"549558\", \"567541\", \"584580\", \"589809\", \"594729\", \"596047\", \"596131\", \"596897\", \"19259355\", \"601083\", \"602234\", \"615786\", \"618707\", \"625170\", \"630980\", \"631514\", \"643003\", \"645199\", \"649969\", \"651258\", \"659657\", \"670966\", \"672959\", \"683741\", \"696403\", \"703532\", \"704513\", \"705387\", \"705666\", \"706808\", \"712354\", \"713170\", \"715578\", \"715578\", \"716591\", \"716591\", \"716899\", \"717683\", \"720483\", \"723207\", \"736811\", \"740193\", \"745743\", \"750113\", \"761942\", \"783229\", \"794279\", \"795123\", \"799449\", \"830323\", \"835638\", \"844859\", \"853212\", \"868938\", \"878069\", \"922646\", \"931568\", \"937374\", \"938477\", \"943285\", \"943761\", \"956535\", \"967744\", \"968634\", \"973715\", \"975530\", \"976298\", \"981612\", \"1003611\", \"1011930\", \"1021264\", \"1026355\", \"1049047\", \"1052662\", \"1054927\", \"1062319\", \"1071046\", \"1086135\", \"1110622\", \"1111486\", \"1125703\", \"15640622\", \"1130425\", \"1134328\", \"1151790\", \"1153070\", \"1154488\", \"1218748\", \"1227761\", \"1235996\", \"1240221\", \"1242799\", \"1249566\", \"1299446\", \"1311263\", \"1336308\", \"1344930\", \"1357286\", \"1357286\", \"1370176\", \"1371449\", \"1420675\", \"1421196\", \"1424198\", \"1436502\", \"1445202\", \"1460312\", \"1463751\", \"1464227\", \"1500148\", \"1513757\", \"1520370\", \"1525938\", \"1536959\", \"1563701\", \"1572015\", \"1624899\", \"1655766\", \"1668344\", \"1687556\", \"1688767\", \"1712598\", \"1728600\", \"1749464\", \"1821490\", \"1840127\", \"1841927\", \"1914058\", \"1920889\", \"1922786\", \"1922888\", \"1929881\", \"1934342\", \"1934803\", \"1937252\", \"1937493\", \"1969945\", \"2152574\", \"2007067\", \"2013019\", \"2021267\", \"2036376\", \"2045505\", \"2110057\", \"2110438\", \"2112037\", \"2136016\", \"2145382\", \"2156339\", \"2290367\", \"2326571\", \"2330391\", \"2345326\", \"2397294\", \"2418914\", \"2494267\", \"2537594\", \"2572795\", \"2595238\", \"682846\", \"10442817\", \"2615247\", \"2621055\", \"2649153\", \"18672962\", \"2741062\", \"2751851\", \"2763521\", \"2835141\", \"2880300\", \"2918113\", \"2920432\", \"19054514\", \"18707981\", \"18581416\", \"1292065\", \"2926746\", \"2927128\", \"2954740\", \"2958339\", \"2983752\", \"3056174\", \"3102054\", \"3283779\", \"3432693\", \"3525828\", \"3767911\", \"3796911\", \"3814168\", \"3862302\", \"3882966\", \"3973214\", \"3973214\", \"4035894\", \"4041759\", \"4045701\", \"4180714\", \"4381124\", \"4449700\", \"4514734\", \"4565801\", \"4630328\", \"4646464\", \"4651840\", \"4685903\", \"5109460\", \"5174760\", \"5509365\", \"5649409\", \"5702602\", \"5863879\", \"6032713\", \"6046441\", \"6095192\", \"6105467\", \"6118094\", \"6410296\", \"6538430\", \"6647097\", \"6716310\", \"6721209\", \"6848607\", \"6864884\", \"6866008\", \"6912479\", \"6966427\", \"7027353\", \"7538274\", \"7550122\", \"7790149\", \"7955079\", \"7978365\", \"8042110\", \"8049139\", \"8137268\", \"8200474\", \"8347938\", \"8636585\", \"8721493\", \"8725935\", \"8816086\", \"8913034\", \"9048556\", \"9273266\", \"9350364\", \"16521367\", \"9357314\", \"9421324\", \"9475624\", \"9483867\", \"9488846\", \"9591000\", \"9591700\", \"9605343\", \"9823753\", \"10014940\", \"10254492\", \"10311727\", \"10341633\", \"10355212\", \"10444866\", \"10505552\", \"10633739\", \"10695955\", \"11092272\", \"11245514\", \"11483451\", \"11494366\", \"11496456\", \"11532022\", \"11546964\", \"11553312\", \"12001492\", \"12202363\", \"12314448\", \"12321889\", \"12425256\", \"13021908\", \"13047107\", \"13051939\", \"13063264\", \"13075850\", \"13081008\", \"13121411\", \"13123784\", \"13127667\", \"13147101\", \"13153308\", \"13165130\", \"13168389\", \"13231318\", \"13237122\", \"13238203\", \"13266454\", \"13276802\", \"13288526\", \"13290640\", \"13308675\", \"13314294\", \"13321069\", \"13324216\", \"13327405\", \"13328377\", \"13343101\", \"13355882\", \"13355882\", \"13367575\", \"13374592\", \"13389856\", \"13430724\", \"13444494\", \"13447036\", \"13540334\", \"13544614\", \"13570580\", \"13583102\", \"13588243\", \"13589691\", \"13631027\", \"13646467\", \"13647081\", \"13650114\", \"13650446\", \"13659761\", \"13663231\", \"13683145\", \"13760802\", \"13761579\", \"13770441\", \"13783861\", \"13791541\", \"13799953\", \"14000860\", \"14002876\", \"14019217\", \"14035157\", \"14044068\", \"14050887\", \"14060292\", \"14065588\", \"14073659\", \"14083115\", \"14092846\", \"14095333\", \"14105700\", \"14110872\", \"14112354\", \"14116368\", \"14119632\", \"14122993\", \"14133670\", \"14133670\", \"14148201\", \"14148925\", \"14174126\", \"14179012\", \"14181398\", \"14202969\", \"14203952\", \"14204985\", \"14218155\", \"14228678\", \"14229185\", \"14240455\", \"14284387\", \"14287558\", \"14288548\", \"14288902\", \"14294404\", \"14297850\", \"14345431\", \"14363886\", \"14415960\", \"14415960\", \"14429155\", \"14429359\", \"14450437\", \"14461606\", \"14469133\", \"14470083\", \"14476428\", \"14480438\", \"14504647\", \"14506007\", \"14509171\", \"14516213\", \"14521432\", \"14529810\", \"14537044\", \"14553596\", \"14568461\", \"14576698\", \"14576698\", \"14576698\", \"14580771\", \"14587059\", \"14601902\", \"14609573\", \"14611252\", \"14615425\", \"14620627\", \"14655581\", \"14657260\", \"14660011\", \"14670488\", \"14673110\", \"14688069\", \"14713297\", \"14717697\", \"14720527\", \"14725310\", \"14725545\", \"14728177\", \"14728252\", \"14728295\", \"14728317\", \"14729559\", \"14731539\", \"14739812\", \"14744666\", \"14746569\", \"14751404\", \"14756349\", \"14756616\", \"14780230\", \"14793955\", \"14794030\", \"14795729\", \"14808680\", \"14808682\", \"14823125\", \"14833781\", \"14847034\", \"14854296\", \"14856396\", \"14857693\", \"14863420\", \"14870120\", \"14876241\", \"14876766\", \"14895385\", \"14899727\", \"14903391\", \"14915516\", \"14925916\", \"14933335\", \"14934466\", \"14940818\", \"14946871\", \"14947919\", \"14957456\", \"14969134\", \"14973872\", \"14975729\", \"14994774\", \"14998263\", \"15009599\", \"15011413\", \"15013805\", \"15016045\", \"15022149\", \"15029052\", \"15030643\", \"15038622\", \"15043356\", \"15043783\", \"15044028\", \"15051420\", \"15052312\", \"15057130\", \"15061189\", \"15068491\", \"15075864\", \"15077538\", \"15086969\", \"15092656\", \"15115109\", \"15118128\", \"15119797\", \"15120080\", \"15128665\", \"15134093\", \"15135572\", \"15141659\", \"15141961\", \"15148438\", \"15155805\", \"15156307\", \"15158495\", \"15162054\", \"15172085\", \"15172714\", \"15173764\", \"15183691\", \"15191244\", \"15202230\", \"15209435\", \"15221830\", \"15233981\", \"15236282\", \"15269334\", \"15270533\", \"15271365\", \"15279198\", \"15280119\", \"15284745\", \"15285515\", \"15297561\", \"15310490\", \"15311495\", \"15316428\", \"15326522\", \"15327759\", \"15329709\", \"15329965\", \"15329965\", \"15329965\", \"15330316\", \"15344509\", \"15353513\", \"15369722\", \"15370272\", \"15378377\", \"15379658\", \"15383398\", \"15393990\", \"15396732\", \"15400110\", \"15419908\", \"15422856\", \"15436341\", \"15436552\", \"15441786\", \"15442553\", \"15453489\", \"15456025\", \"15457374\", \"15458051\", \"15461077\", \"15462198\", \"15474521\", \"15490043\", \"15491694\", \"15505168\", \"15507385\", \"15512532\", \"15514422\", \"15528986\", \"15532817\", \"15533021\", \"15535427\", \"15555629\", \"15564690\", \"15565811\", \"15583874\", \"15606498\", \"15616710\", \"15630939\", \"15643678\", \"15643678\", \"15650116\", \"15651138\", \"15651781\", \"15653857\", \"15657969\", \"15661814\", \"15661940\", \"15662592\", \"15667499\", \"15672090\", \"15673802\", \"15674332\", \"15680133\", \"15682510\", \"15683728\", \"15684038\", \"15688875\", \"15700126\", \"15700290\", \"15701250\", \"15701250\", \"15702967\", \"15704016\", \"15706885\", \"15706885\", \"15713532\", \"16003796\", \"16003817\", \"16009242\", \"16019344\", \"16021160\", \"16028941\", \"16029012\", \"16033300\", \"16046062\", \"16050216\", \"16058467\", \"16062695\", \"16065219\", \"16073630\", \"16079360\", \"16080149\", \"16084920\", \"16091574\", \"16092287\", \"16093160\", \"16095428\", \"16103051\", \"16108096\", \"16108205\", \"16108634\", \"16114681\", \"16115580\", \"16121236\", \"16121236\", \"16121443\", \"16121492\", \"16125651\", \"16125957\", \"16131075\", \"16135781\", \"16135872\", \"16152741\", \"16161271\", \"16164630\", \"16165779\", \"16169860\", \"16172486\", \"16180674\", \"16183137\", \"16187585\", \"16188217\", \"16188217\", \"16195798\", \"16197279\", \"16204514\", \"16208419\", \"16210239\", \"16213205\", \"16213571\", \"16224724\", \"16227656\", \"16247110\", \"16259279\", \"16259279\", \"16260662\", \"16267970\", \"16273210\", \"16282382\", \"16283869\", \"16284431\", \"16291648\", \"16293413\", \"16293476\", \"16302308\", \"16306807\", \"16321796\", \"16323418\", \"16333288\", \"16337844\", \"16340828\", \"16343505\", \"16352310\", \"16354116\", \"16359335\", \"16362596\", \"16364543\", \"16368015\", \"16369386\", \"16372105\", \"16372807\", \"16374570\", \"16380303\", \"16382566\", \"16383240\", \"16392454\", \"16392672\", \"16396766\", \"16396952\", \"16406259\", \"16407105\", \"16417765\", \"16424473\", \"16425101\", \"16429242\", \"16448544\", \"16449938\", \"16450800\", \"16454427\", \"16457982\", \"16459614\", \"16460624\", \"16461224\", \"16462609\", \"16463109\", \"16470212\", \"16470814\", \"16471890\", \"16473332\", \"16494559\", \"16498227\", \"16505154\", \"16507138\", \"16519681\", \"16522066\", \"16523799\", \"16523988\", \"16531908\", \"16536808\", \"16536963\", \"16543247\", \"16546132\", \"16549141\", \"16552369\", \"16562814\", \"16563134\", \"16568127\", \"16591701\", \"16600128\", \"16603845\", \"16603845\", \"16609004\", \"16611563\", \"16616375\", \"16617034\", \"16617732\", \"16617963\", \"16619036\", \"16620557\", \"16624283\", \"16634493\", \"16636836\", \"16637006\", \"16641937\", \"16644859\", \"16644944\", \"16652050\", \"16652050\", \"16656582\", \"16668455\", \"16673971\", \"16675751\", \"16679319\", \"16681374\", \"16683203\", \"16700947\", \"16703142\", \"16712848\", \"16716789\", \"16718608\", \"16727852\", \"16740675\", \"16742158\", \"16743551\", \"16762441\", \"16762961\", \"16772255\", \"16778924\", \"16787226\", \"16787226\", \"16791955\", \"16813199\", \"16813199\", \"16814424\", \"16818385\", \"16822222\", \"16822222\", \"16824148\", \"16824201\", \"16827771\", \"16828109\", \"2986621\", \"16829564\", \"16836571\", \"16848591\", \"16848998\", \"16849376\", \"16871260\", \"16887370\", \"16905542\", \"16922787\", \"16927644\", \"16929694\", \"16933495\", \"16933760\", \"16933760\", \"16936194\", \"16941111\", \"16943314\", \"16943845\", \"16950762\", \"16950762\", \"16955961\", \"16958462\", \"16958462\", \"16958691\", \"16966625\", \"16970845\", \"16974461\", \"16975141\", \"16975141\", \"16975141\", \"16975645\", \"16975801\", \"16983476\", \"16989436\", \"16995458\", \"17000014\", \"17008607\", \"17010189\", \"17011429\", \"17012003\", \"17014009\", \"17019791\", \"17021281\", \"17023039\", \"17025861\", \"17030940\", \"17031129\", \"17031748\", \"17039963\", \"17045389\", \"17047901\", \"17059322\", \"17123425\", \"17123682\", \"17134662\", \"17150101\", \"17178479\", \"17184026\", \"17198649\", \"17206054\", \"17216515\", \"17230439\", \"17232427\", \"17234809\", \"17237613\", \"17239161\", \"17262805\", \"17283553\", \"17305481\", \"17309757\", \"17310326\", \"17313539\", \"17317850\", \"17328534\", \"17329464\", \"17329464\", \"17331471\", \"17334638\", \"17335724\", \"17365667\", \"17399701\", \"17400693\", \"17423939\", \"17426457\", \"17447098\", \"17476062\", \"17491356\", \"17509708\", \"17510024\", \"17516061\", \"17533277\", \"17538327\", \"17541464\", \"17544025\", \"17551369\", \"17558130\", \"17561597\", \"17565962\", \"17579489\", \"17588558\", \"17588558\", \"17594661\", \"17623545\", \"17641651\", \"17649621\", \"17652869\", \"17658099\", \"17667777\", \"17668230\", \"17672500\", \"17679367\", \"17679578\", \"17690226\", \"17696201\", \"17698202\", \"17702538\", \"17702538\", \"17714261\", \"17720200\", \"17720863\", \"17724756\", \"17727203\", \"17735660\", \"17738297\", \"17745545\", \"17759449\", \"17761272\", \"17776240\", \"17791693\", \"17813821\", \"17816248\", \"17817733\", \"17819657\", \"17825642\", \"17829627\", \"17833006\", \"17838133\", \"17866933\", \"17867985\", \"17878390\", \"17878390\", \"17878824\", \"17894987\", \"17901089\", \"17903455\", \"17918286\", \"17920311\", \"17921624\", \"17930683\", \"17934538\", \"17952511\", \"17957447\", \"17957617\", \"17960340\", \"17967111\", \"17967639\", \"17975446\", \"17978030\", \"17979150\", \"17983524\", \"17985336\", \"17985371\", \"17985681\", \"17985993\", \"17991151\", \"17995098\", \"17999478\", \"18007006\", \"18007180\", \"18008946\", \"18010375\", \"18011333\", \"18011555\", \"18012439\", \"18018160\", \"18022103\", \"18022262\", \"18025761\", \"18035760\", \"18037470\", \"18038422\", \"18041024\", \"18047023\", \"18047063\", \"18051728\", \"18063297\", \"18065159\", \"18067691\", \"18073070\", \"18076354\", \"18076489\", \"18078134\", \"18078375\", \"18084488\", \"18090922\", \"18092355\", \"18100158\", \"18100354\", \"18102938\", \"18104320\", \"18106277\", \"18117279\", \"18119156\", \"18119170\", \"18119170\", \"18120286\", \"18122724\", \"18122893\", \"18123025\", \"18123876\", \"18135913\", \"18135978\", \"18136626\", \"18151757\", \"18151952\", \"18155895\", \"18156445\", \"18159094\", \"18162878\", \"18163424\", \"18163424\", \"18165374\", \"18167373\", \"18169163\", \"18169832\", \"18170638\", \"18171511\", \"18177778\", \"18180375\", \"18182510\", \"18187468\", \"18207103\", \"18207459\", \"18210382\", \"18210414\", \"18216574\", \"18216574\", \"18216728\", \"18218742\", \"18222827\", \"18222862\", \"18242542\", \"18245840\", \"18246160\", \"18250883\", \"18252165\", \"18260298\", \"18265337\", \"18270451\", \"18279715\", \"18289870\", \"18291221\", \"18291221\", \"18295965\", \"18303110\", \"18303499\", \"18304248\", \"18307296\", \"18308181\", \"18313845\", \"18316116\", \"18317657\", \"18323982\", \"18329174\", \"18329629\", \"18337974\", \"18338912\", \"18339855\", \"18341201\", \"18342327\", \"18344396\", \"18345646\", \"18346830\", \"18347878\", \"18348758\", \"18353937\", \"18360416\", \"18362028\", \"18372412\", \"18373808\", \"18379218\", \"18380340\", \"18386130\", \"18386130\", \"18387172\", \"18390283\", \"18392551\", \"18392972\", \"18398199\", \"18400302\", \"18402145\", \"18404580\", \"18406163\", \"18406582\", \"18407241\", \"18407493\", \"18409538\", \"18410841\", \"18412457\", \"18412717\", \"18415933\", \"18420034\", \"18421833\", \"18422529\", \"18440737\", \"18440737\", \"18449017\", \"18449407\", \"18453377\", \"18454731\", \"18456860\", \"18457175\", \"18457602\", \"18457844\", \"18463859\", \"18465971\", \"18469473\", \"18474670\", \"18491102\", \"18491102\", \"18495620\", \"18495866\", \"18500684\", \"18500714\", \"18500714\", \"18505486\", \"18507612\", \"18512816\", \"18513615\", \"18525125\", \"18526239\", \"18529551\", \"18532506\", \"18533472\", \"18533796\", \"18540170\", \"18542061\", \"18556774\", \"18556790\", \"18562194\", \"18568605\", \"18569056\", \"18571579\", \"18573914\", \"18576176\", \"18576282\", \"18576820\", \"18578761\", \"18585513\", \"18585680\", \"18586649\", \"18587257\", \"18594349\", \"18598602\", \"18599341\", \"18601276\", \"18607249\", \"18611215\", \"18611215\", \"18611215\", \"18612198\", \"18621459\", \"18624351\", \"18626496\", \"18640286\", \"18640881\", \"18640969\", \"18643028\", \"18643262\", \"18644879\", \"18648738\", \"18649521\", \"18649954\", \"18649972\", \"18655798\", \"18666276\", \"18668816\", \"18670465\", \"18671155\", \"18673209\", \"18673209\", \"18673761\", \"18678778\", \"18688400\", \"18689247\", \"18691251\", \"18693215\", \"18694063\", \"18694063\", \"18697723\", \"18698667\", \"18699127\", \"18707050\", \"18713589\", \"18714667\", \"18714667\", \"18714667\", \"18716540\", \"18719249\", \"18721404\", \"18722284\", \"18724520\", \"18725437\", \"18725448\", \"18726787\", \"18726833\", \"18727871\", \"18733175\", \"18734221\", \"18738504\", \"18738504\", \"18739745\", \"18740199\", \"18743003\", \"18743003\", \"18745798\", \"18746561\", \"18748102\", \"18748317\", \"18748317\", \"18749948\", \"18756766\", \"18760842\", \"18762222\", \"18765390\", \"18767854\", \"18768901\", \"18771719\", \"18772056\", \"18775359\", \"18782261\", \"18783135\", \"18790022\", \"18790647\", \"18800851\", \"18802646\", \"18803225\", \"18804387\", \"18806609\", \"18809561\", \"18815785\", \"18819560\", \"18823718\", \"18826614\", \"18826691\", \"18826691\", \"18826691\", \"18833595\", \"18838351\", \"18838351\", \"18839121\", \"18839121\", \"18844379\", \"18844379\", \"18855089\", \"18855524\", \"18855524\", \"18857047\", \"18858204\", \"18858988\", \"18859178\", \"18859417\", \"18861413\", \"18863315\", \"18871821\", \"18871924\", \"18872094\", \"18875391\", \"18876756\", \"18879201\", \"18879484\", \"18882019\", \"18884062\", \"18890551\", \"18898857\", \"18899968\", \"18910669\", \"18915795\", \"18919822\", \"18922133\", \"18924089\", \"18924089\", \"18925114\", \"18926241\", \"18926241\", \"18926575\", \"18928607\", \"18929740\", \"18939757\", \"18952210\", \"18952210\", \"18956754\", \"18965357\", \"18975476\", \"18978321\", \"18983256\", \"18987280\", \"18987399\", \"18990920\", \"18990920\", \"18991781\", \"18992288\", \"18992288\", \"18998254\", \"19002980\", \"19007316\", \"19010147\", \"19010147\", \"19015125\", \"19019746\", \"19019746\", \"19022465\", \"19022889\", \"19024338\", \"19029641\", \"19029641\", \"19035587\", \"19039783\", \"19040883\", \"19040883\", \"19041189\", \"19043313\", \"19047502\", \"19047502\", \"19050155\", \"19053742\", \"19061947\", \"19064180\", \"19069634\", \"19071723\", \"164932\", \"364809\", \"500260\", \"567541\", \"1463751\", \"9731930\", \"14793955\", \"15009599\", \"16787226\", \"17878390\", \"18163424\", \"18449017\", \"18556774\", \"18561362\", \"18621459\", \"18640881\", \"18806609\", \"18871924\", \"19015125\", \"18872487\", \"14203952\", \"19041228\", \"18828118\", \"3136513\", \"18952150\", \"18457844\", \"3136513\", \"17814871\", \"18754072\", \"19080878\", \"19085944\", \"18315314\", \"19010432\", \"19009431\", \"19072100\", \"19077628\", \"18734221\", \"19061947\", \"18838351\", \"19073947\", \"18042759\", \"2035977\", \"8559601\", \"19068948\", \"18952150\", \"18383318\", \"19089314\", \"19016164\", \"1399668\", \"17579489\", \"1021264\", \"16975141\", \"19123314\", \"1749464\", \"19122622\", \"18123876\", \"19110038\", \"18955543\", \"19010147\", \"15706885\", \"19045787\", \"18790296\", \"14240455\", \"18084488\", \"19090577\", \"18909593\", \"18921675\", \"535297\", \"17579489\", \"1021264\", \"16975141\", \"19123314\", \"1749464\", \"19122622\", \"18123876\", \"18956754\", \"18993339\", \"56679\", \"19112621\", \"18943545\", \"15148438\", \"19148518\", \"2502908\", \"19145248\", \"17579489\", \"18457844\", \"19107639\", \"18220040\", \"19127277\", \"19166965\", \"15297763\", \"19158392\", \"18564942\", \"18738504\", \"976298\", \"15148438\", \"18956754\", \"18993339\", \"7802801\", \"19186970\", \"19193317\", \"19070574\", \"19179049\", \"35753\", \"19451420\", \"18174539\", \"19459367\", \"19137668\", \"40013002\", \"19414909\", \"18506541\", \"19461058\", \"16223099\", \"19325971\", \"114780\", \"19324031\", \"19448282\", \"19277694\", \"40063626\", \"40008446\", \"2495\", \"19295858\", \"19271787\", \"8941582\", \"40102328\", \"40056805\", \"40133818\", \"40113537\", \"19342580\", \"18730198\", \"40149911\", \"40234462\", \"40082147\", \"19329445\", \"18210903\", \"15521714\", \"18734218\", \"40125072\", \"40264409\", \"19171132\", \"40407266\", \"15607000\", \"19026963\", \"40133611\", \"40342984\", \"19205738\", \"40464792\", \"63077\", \"40018192\", \"40513627\", \"40539599\", \"40461684\", \"19380305\", \"40371922\", \"40304602\", \"1085324\", \"40137332\", \"40582624\", \"16182091\", \"18682566\", \"40479111\", \"18979818\", \"40595089\", \"18337639\", \"40614137\", \"40594328\", \"40425357\", \"18434307\", \"40607271\", \"40099978\", \"40154810\", \"18087819\", \"40542619\", \"40133763\", \"7018003\", \"40835887\", \"40565213\", \"19479973\", \"183968\", \"18670264\", \"40743104\", \"40929171\", \"40901908\", \"40665511\", \"1683095\", \"40894139\", \"19384596\", \"40820905\", \"14105700\", \"16068520\", \"41211141\", \"41038071\", \"41295105\", \"42161538\"]";
        List<String> list = JSON.parseArray(test, String.class);
        System.out.println(list.size());
    }
}
