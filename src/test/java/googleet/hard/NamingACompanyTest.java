package googleet.hard;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NamingACompanyTest {

	NamingACompany namingACompany = new NamingACompany();

	@Test
	void testDistinctNames() {
		assertEquals(6, namingACompany.distinctNames(new String[] { "coffee", "donuts", "time", "toffee" }));
		assertEquals(0, namingACompany.distinctNames(new String[] { "lack", "back" }));
	}

	@Test
	void sample70() {
		String[] ideas = new String[] { "koo", "fxhbmqusq", "rzvg", "q", "a", "tjubb", "qblgfkrrxk", "ikvlyuvwuk",
				"mdetnttjp", "b", "fldnysp", "gzvg", "gci", "xagjtfb", "xnudb", "lwiyqlp", "apzdfaon", "fczd",
				"qyjjsfqecq", "qvvf", "ecaocimm", "iqs", "qptqapju", "axq", "slynhxidsn", "mrpyqdvrmw", "i",
				"pjtlcuimrf", "vvgszsjs", "ypkru", "vbgnqwedg", "jpymsy", "zzm", "cyfmtar", "xhwcovmx", "x",
				"fqicpvodz", "akjfffmt", "skqukhgsot", "aavrdxiryf", "rpevrxozfd", "zuongbaxap", "ynjcvase", "kxhabbs",
				"rahvbrcs", "uz", "sfzgjxppjd", "ddtbitf", "ebmpz", "g", "ttm", "wiglxmczzc", "gtofutg", "ob", "nzkvy",
				"pdg", "wlfr", "axrdhfi", "jh", "lmlw", "ilxkx", "ynqwdenei", "wxblf", "gibmm", "zabu", "icbidvypo",
				"m", "lxkevqkll", "joomyhqc", "bonpjg", "ukzq", "e", "nxwcg", "asatttv", "yvhsnf", "xvwqmp", "wg",
				"ubduavd", "vactai", "hom", "bapz", "yt", "mkn", "tibb", "ewfu", "trederbkx", "wmtut", "jinvhxj", "cqu",
				"rnydjeopuz", "cysig", "kh", "dbk", "dbznhj", "bxebxep", "aaqbpzh", "xotpbrlg", "cyish", "rkjwb",
				"bwri", "yye", "xsom", "gykg", "igafxva", "n", "vtoppllvlp", "sef", "av", "uqs", "gwmevq", "dqs",
				"fxpuvktpm", "zdhpxo", "dxhabbs", "gvjso", "v", "ywwwparp", "pj", "pzlzj", "eob", "xefxorf", "tjy",
				"kdarodqlc", "sjbhbuj", "yxzqejcyn", "ixwcg", "fop", "eklftim", "wudxz", "drxr", "yxjvqgdli",
				"oeubdkxlyc", "sizoma", "neir", "frederbkx", "at", "czcpptnma", "erf", "qnmvlw", "skfwgaiheu",
				"hbbnklj", "eqrewiyno", "vwluyibm", "bkjwb", "fkcfzpm", "ocudj", "lys", "sbr", "zhvaxuso", "wwue", "bj",
				"hnwgeg", "jvvf", "o", "ygdd", "zudxz", "hbl", "pvjmafplmi", "lpaxpfpzko", "nxzsqqedp", "uphm", "cwby",
				"xahvbrcs", "gvf", "faeqsxpz", "eykx", "vxzqejcyn", "ucqykivm", "p", "cxp", "gqtwxw", "er", "dbb",
				"lreztqj", "ccj", "lfwientjzo", "ypf", "vhme", "jftmpu", "kbxw", "piwvwq", "mlhqixfc", "d", "y", "pqvv",
				"ifrae", "gcyowfphx", "zhvjzezqj", "kl", "linvhxj", "zmwlxhuahc", "fngjyikfmn", "jmmjp", "xgmwvktaj",
				"mtrgluhp", "ytvme", "ex", "jxayebfrko", "nvc", "prwpnjel", "knsgjcpfi", "avduec", "hoouvx",
				"jojozmjhy", "thovztxe", "kfo", "usuhc", "kfozc", "sl", "qcsdfpoijl", "nu", "pnydjeopuz", "ymaqsega",
				"xbzr", "fn", "pykg", "aldnysp", "azmpb", "pqeahlihx", "nyui", "qyish", "u", "zfo", "zxwcg", "pgyxqnny",
				"h", "lwnokca", "kxnxd", "nxjzz", "buj", "ciwigw", "jqs", "utrgluhp", "ysuhc", "tco", "sjrape", "jl",
				"zsaq", "udsqykpfv", "yu", "qbh", "rvs", "jxbugeay", "ebek", "bt", "zoomyhqc", "z", "uvs", "hdvhw",
				"aisdhqxyj", "joj", "t", "dxjvqgdli", "el", "nob", "xnyll", "zikpmnms", "rpkruft", "oci", "udg", "rob",
				"ywwvlkuqw", "igle", "uzhnoc", "qg", "gegvlrfsvd", "gwlpbhe", "bet", "tbuuvvy", "ws", "jmt", "hbduavd",
				"clezrxulqh", "eprbxtbjjn", "ddpv", "qdn", "gzxfgx", "gnydjeopuz", "qfccys", "xxufeucljo", "auo", "khe",
				"fvmqumk", "yhifoc", "idc", "ybtkox", "eflqo", "pjy", "kcozzsk", "cb", "aqqftbjc", "yazbhknu",
				"oamghggik", "tra", "obijxkpca", "spfew", "qlhqixfc", "tpkru", "ciqhho", "nfzgjxppjd", "gaeqsxpz",
				"kzb", "oohhr", "iarm", "pfqqbeait", "bo", "dlkkmhouev", "jr", "snyll", "kojozmjhy", "uma", "ukif",
				"cpns", "mxwcg", "hvxneajqo", "erwawgmzqj", "hzsjdm", "darm", "iiuvt", "ukayirnku", "ubk", "axbjka",
				"plltfd", "vyu", "abtkox", "ivrszz", "uvell", "qfyystr", "np", "ukppobdvu", "ayrnwm", "ofvzzuer",
				"wbtksgrhz", "zwjplv", "tyrgjol", "edduhfho", "sphyre", "zkzsnszj", "undmd", "apkruft", "bedi", "rv",
				"alv", "rtjkhcq", "ydj", "cmfn", "jf", "usbzrp", "rfiddvig", "mq", "csaq", "fxbgumwbn", "jn", "qekuglf",
				"okgo", "xfkoiakok", "pb", "df", "kkzkp", "fzb", "vew", "tsioxyann", "xz", "chwcovmx", "wlgibnq",
				"xkfwgaiheu", "xcptq", "clmffdm", "lqj", "hqicpvodz", "wfqnfx", "ymirgjere", "zs", "cu", "vxpuvktpm",
				"abkptqgox", "dxrlvfotx", "cmupn", "mffevfvq", "tvjso", "uwkzvvh", "nhe", "pzxpie", "atqynehwdx", "efo",
				"zrlmdrx", "dmsxraf", "xbtkox", "wcqykivm", "uvrszz", "tmie", "qo", "fzklye", "rmmvlabypg", "omxmmgsd",
				"gekauffqxf", "lqnobuwpp", "qpydl", "kkzq", "srfkp", "hmirgjere", "xanzgv", "efhlk", "lzkvy", "byligab",
				"celps", "wqqftbjc", "bepaxsnzxt", "bv", "shpyiojpv", "epnqysiyrf", "fhp", "lef", "yet", "aqhvfhnrd",
				"gbhdrmbmm", "fmec", "fbrqe", "xayb", "cazkeqmy", "bnl", "pyish", "bhfet", "ckoxxy", "qnuudvo",
				"bwmwrcj", "czrfuv", "tuzgsqbqml", "lsh", "crcwdijxag", "rhlfgaxln", "cfkfjri", "wtvme", "ggafxva",
				"lfcl", "iwnokca", "onovnya", "lmvnok", "j", "ofjbokl", "wogpjk", "rytk", "awobqgv", "iovakqczk",
				"ztwraar", "ucxhkhf", "qdibwlby", "ujq", "w", "xd", "rdyi", "hslzwzk", "wpvltt", "sbneja", "gbsrujldi",
				"xtp", "ioahfivvye", "tbjuy", "zvx", "zlkzaehqq", "xh", "sgafxva", "ffbrqax", "piptzb", "lxwzlo",
				"jbzonqfos", "sngpd", "xeysl", "vnuvpkwz", "dcvaqngpmi", "gbkds", "jwpag", "kfkaypavla", "fnudb",
				"hrsrfaexob", "sbk", "gbab", "iome", "hikpmnms", "anbho", "rop", "xiwigw", "quo", "vfwientjzo", "ucptq",
				"gvk", "reysl", "gs", "gq", "plezrxulqh", "knbho", "ncq", "pdamajqe", "cgavg", "yv", "qabkl", "ahv",
				"hvgszsjs", "lzo", "brvirrn", "axxrwed", "ydg", "ivzxvkdncx", "kblzcsn", "js", "rhgtydobdp", "xs",
				"ttkydr", "vdnbtpkzak", "zjbj", "arozj", "frhopd", "wgvlpfg", "ninvhxj", "ub", "ixxrwed", "wsxm",
				"zxzni", "rmzgsbsw", "tvylgxo", "bquishwhi", "wjn", "rk", "vhwv", "sij", "jabdo", "mzc", "c",
				"ldamajqe", "fvxneajqo", "fdn", "jmirgjere", "evlb", "gvaseyz", "jryilvlv", "axkevqkll", "idxdrz",
				"qygyilzy", "r", "zkiyasuck", "nhlfgaxln", "ncjhrn", "ms", "kzxfgx", "s", "eqjki", "iraikx", "jztq",
				"vhnczhlej", "eagjtfb", "cobufveyk", "geutfntoo", "uxpuvktpm", "ersrfaexob", "yysgg", "hzyievwmvl",
				"efwientjzo", "mpsibf", "qzm", "uiet", "ulvqaduorq", "ncyowfphx", "kxgdvs", "wnecuzsl", "pz", "ypkm",
				"xxrlvfotx", "hhwtcpcjl", "ofqqbeait", "rmrg", "hiwdhgpgf", "tiwvwq", "ojctfbscr", "pxcdmcaaq", "k",
				"uhbyroi", "prnaxa", "iphm", "xvhpbx", "mdamajqe", "cob", "wp", "hv", "cjoosplif", "jfbcsbl", "mdx",
				"bbirdljndw", "f", "hreztqj", "dixasboev", "xmgisn", "vtojq", "ekcgoew", "hifwubsnuc", "ks", "bwhcdag",
				"yjy", "fhzvptji", "eoomrsrh", "wsaq", "qef", "unbho", "qrzatwc", "kdamajqe", "djet", "nvpmhhprwg",
				"xvhsnf", "ig", "rhmd", "vpymsy", "nbkptqgox", "xza", "zqew", "dsaq", "fvf", "uqw", "dksj", "hlsrrmg",
				"zhgs", "dhe", "jaq", "hwqomooeeo", "kacuhlcq", "phifoc", "cupnbk", "iwgmzcvk", "ikjwb", "qsthv",
				"yesr", "vzkvy", "qmmjp", "pzc", "sp", "rjubb", "xpdnia", "mdwyyizrqi", "gnynhwnqu", "ylltfd", "id",
				"uf", "dmec", "qzlzj", "kfr", "klpzvae", "qob", "miuvt", "rxjvqgdli", "oqvv", "sx", "fuqikslmra",
				"tvjmafplmi", "cdr", "vqxa", "ikt", "ckocgo", "clolkdso", "qzilqg", "bafdbly", "ryvukc", "bd", "jhsc",
				"cnoudauw", "knos", "namimexp", "kxrdhfi", "my", "cfozc", "pumnuc", "optrwt", "dte", "obgmqvfmd",
				"nxmb", "mvc", "ambzs", "kyljsrih", "zpvltt", "dusveaqpwr", "vci", "vjn", "cnyll", "vajfggga", "bgj",
				"dvc", "joz", "ozxfgx", "fmvzkkjej", "fbnbapllx", "aoz", "l", "ka", "ajijtuyqz", "kreztqj", "hlyh",
				"cs", "zdduhfho", "mvjmafplmi", "rwsqnnlkdl", "ohwtcpcjl", "gud", "jtqynehwdx", "dbexjashxp",
				"hymflahzi", "avjmafplmi", "pugcs", "hkn", "gyrgjol", "gbxvjtiy", "ftofutg", "xhqnmbp", "ugqbjbiykm",
				"aolbchv", "flsrrmg", "nx", "wdduhfho", "rraikx", "smirgjere", "lchfhpn", "acq", "mompi", "apgx", "hop",
				"slyh", "fkobbqi", "owgmzcvk", "jsh", "yzxkdvy", "cllhjffrbs", "eiiand", "wyaaxchon", "evs", "echt",
				"shgtydobdp", "ijoosplif", "xlezrxulqh", "bko", "tsjuyf", "gl", "stv", "fblzlqofbn", "ohrimsmdrs",
				"sdetnttjp", "rxoyy", "xsmr", "sckubsz", "zop", "lwryjfdare", "fnlyopyzii", "lkqukhgsot", "ktytu",
				"yshzec", "cpuzary", "uxhabbs", "tpymsy", "uacuhlcq", "ck", "nbek", "jwwvlkuqw", "awluyibm", "pvf",
				"tdarodqlc", "arnrxcbjf", "ox", "fct", "jhwv", "hrmqjijasl", "iuot", "heubdkxlyc", "sjn", "lttygi",
				"yls", "lilqybpvh", "nvvgxzjb", "cqrvlq", "zvnwgon", "pyflvboqc", "scftxzg", "kef", "vuzgsqbqml",
				"ceuwgm", "fv", "pizoma", "loofmcjiw", "io", "uneignam", "xmwlpk", "xbnzmzu", "uje", "mhwtcpcjl",
				"mpkru", "fjbhbuj", "xzcpptnma", "kdelbu", "pkfxbzgvxx", "eap", "wq", "nshzec", "hra", "heviewx",
				"zlocvmgfwl", "cz", "hwu", "kjewuyyrvx", "qwnokca", "exrdhfi", "aymg", "pcm", "mjwu", "jci", "tduvyvt",
				"nnovnya", "eb", "wozmc", "zddnhddib", "gg", "ubzhcxvv", "txwgmuajq", "str", "ykoyejnb", "qkqukhgsot",
				"mcyh", "mmsgwkrk", "yxxrwed", "jvzyf", "hsom", "yxqbsgphi", "wx", "sf", "nxcdmcaaq", "fsom", "jbneja",
				"xwixexx", "gb", "acpj", "etofutg", "reoiuj", "nkvlyuvwuk", "ncm", "kms", "pktbgt", "ixhkz",
				"mqdxrjven", "ylynhxidsn", "xrm", "dqvvqxhxtk", "weir", "wiuqvo", "hsyuueckj", "rjoosplif", "qhs",
				"xsatttv", "efzgjxppjd", "jkoyejnb", "nw", "boctzh", "soxkcsv", "zfexkbzw", "qtg", "opuzary", "lhc",
				"hsspebdcol", "cc", "dxrdhfi", "wgtchhn", "kztq", "qe", "rqppvis", "abduavd", "nvtq", "kwluyibm", "zoj",
				"ivtq", "jwsqnnlkdl", "vztqjdgr", "wuz", "extsbwdj", "imvnok", "ynwttyub", "gr", "kcm", "xxzqejcyn",
				"yvlqn", "vxrdhfi", "avs", "sv", "zcpujqvg", "ohuykgwj", "pnbho", "zohhr", "xsnyijay", "hfz", "iop",
				"sysig", "wbsripr", "cwswqxfkax", "yxw", "kjbdxd", "lnsgjcpfi", "dl", "qrcykxusl", "gsnyijay",
				"hbsrujldi", "kht", "yxayebfrko", "ypw", "gimo" };
		assertEquals(682738, namingACompany.distinctNames(ideas));
	}

}
