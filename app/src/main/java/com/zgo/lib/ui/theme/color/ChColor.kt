package com.zgo.lib.ui.theme.color

import android.content.Context
import android.util.Log
import androidx.compose.ui.graphics.Color
import org.json.JSONArray
import org.json.JSONException


/*
 *
 * 中国色 526
 * @author: zhhli
 * @date: 22/1/21
 */
open class ChColor(
    id: String,
    name: String,
    hex: String,
    color: Color = Color.Transparent,
    val pinyin: String,
    val rgb: List<Int> = listOf(),
    val cmyk: List<Int> = listOf(),
) : ZgoColor(id, name, hex, color) {

    override fun toRGB(): List<Int> {
        return rgb
    }


    companion object {
        val list = listOf(
            rubai_0,
            xingrenhuang_1,
            molihuang_2,
            maiganhuang_3,
            youcaihuahuang_4,
            foshouhuang_5,
            miehuang_6,
            kuishanhuang_7,
            ningmenghuang_8,
            jinguahuang_9,
            tenghuang_10,
            laohuang_11,
            xiangshuimeiguihuang_12,
            danmihuang_13,
            dadouhuang_14,
            suxinhuang_15,
            xiangrikuihuang_16,
            yalihuang_17,
            huanglianhuang_18,
            jinzhanhuang_19,
            dankehuang_20,
            rouse_21,
            ezhanghuang_22,
            jidanhuang_23,
            youhuang_24,
            liuehuang_25,
            danjucheng_26,
            pipahuang_27,
            chengpihuang_28,
            beiguahuang_29,
            xinghuang_30,
            xionghuang_31,
            wanshoujuhuang_32,
            juleibai_33,
            qiukuihuang_34,
            liuhuahuang_35,
            youhuang_36,
            mangguohuang_37,
            haohuang_38,
            jianghuang_39,
            xiangjiaohuang_40,
            caohuang_41,
            xinhelv_42,
            yuehui_43,
            danhuilv_44,
            caohuilv_45,
            tailv_46,
            biluochunlv_47,
            yanyuhui_48,
            xiekehui_49,
            tanshuilv_50,
            ganlanlv_51,
            bangroubai_52,
            douzhihuang_53,
            danjianhuang_54,
            ruyahuang_55,
            liroubai_56,
            xiangyahuang_57,
            chaomihuang_58,
            yingwuguanhuang_59,
            muguahuang_60,
            qianlaohuang_61,
            lianzibai_62,
            guhuang_63,
            zhizihuang_64,
            jiehuang_65,
            yinshuhui_66,
            chenhui_67,
            kulv_68,
            jiaoqing_69,
            zongyelv_70,
            huilv_71,
            hehui_72,
            dansongyan_73,
            anhaishuilv_74,
            zonglvlv_75,
            mise_76,
            danrouse_77,
            maiyatanghuang_78,
            hupohuang_79,
            gancaohuang_80,
            chushuxinghuang_81,
            qiantuose_82,
            shashihuang_83,
            hupihuang_84,
            tuhuang_85,
            bailingniaohui_86,
            shanjihuang_87,
            guibeihuang_88,
            canghuang_89,
            laiyanglihuang_90,
            yililv_91,
            songshuhui_92,
            ganlanhui_93,
            xiekelv_94,
            gutonglv_95,
            jiaochalv_96,
            fenbai_97,
            luoyingdanfen_98,
            guarangfen_99,
            mihuang_100,
            jinyehuang_101,
            jinyinghuang_102,
            lujiaozong_103,
            diaoyezong_104,
            daimaohuang_105,
            ruanmuhuang_106,
            fengfanhuang_107,
            guipidanzong_108,
            houmaohui_109,
            shanjihe_110,
            tuose_111,
            chahe_112,
            gutonghe_113,
            hehuabai_114,
            meiguifen_115,
            jucheng_116,
            meirenjiaocheng_117,
            runhong_118,
            dantaohong_119,
            hailuocheng_120,
            taohong_121,
            jiahong_122,
            danyingsuhong_123,
            chenxihong_124,
            xiekehong_125,
            jinlianhuacheng_126,
            caomeihong_127,
            longjingyuhong_128,
            qingtinghong_129,
            dahong_130,
            shihong_131,
            liuhuahong_132,
            yinzhu_133,
            zhuhong_134,
            guiyuhong_135,
            jinhuang_136,
            lupihe_137,
            zuiguarou_138,
            jizong_139,
            danyinhui_140,
            danzhe_141,
            binglangzong_142,
            yinhui_143,
            haiouhui_144,
            dankafei_145,
            yanshizong_146,
            mangguozong_147,
            shibanhui_148,
            zhumuhui_149,
            dingxiangzong_150,
            kafei_151,
            sunpizong_152,
            yanhanhong_153,
            yufenhong_154,
            jintuo_155,
            tiezong_156,
            zhuwanghui_157,
            dankekezong_158,
            zhonghonghui_159,
            dantuhuang_160,
            dandousha_161,
            yekezong_162,
            dantiehui_163,
            zhonghuituo_164,
            danlizong_165,
            kekezong_166,
            zhayezong_167,
            yeqiangweihong_168,
            boluohong_169,
            ouhe_170,
            taocihong_171,
            xiaohui_172,
            yujinhong_173,
            huozhuanhong_174,
            huonizong_175,
            ganhong_176,
            xiangshuzong_177,
            haibaohui_178,
            meiguihui_179,
            huoshanzong_180,
            dousha_181,
            danmifen_182,
            chutaofenhong_183,
            jieqiaodanfenhong_184,
            dancanghuahong_185,
            guaranghong_186,
            furonghong_187,
            meijianghong_188,
            faluohong_189,
            luoxiahong_190,
            danmeiguihui_191,
            xiemaohong_192,
            huoyanzong_193,
            zheshi_194,
            antuozong_195,
            jiangzong_196,
            lizong_197,
            yangshuixianhong_198,
            guqiaohong_199,
            pingguohong_200,
            tieshuihong_201,
            guihong_202,
            jiguanghong_203,
            fenhong_204,
            shehong_205,
            quhong_206,
            honggonghong_207,
            danfei_208,
            wuhuaguohong_209,
            liuzihong_210,
            yanzhihong_211,
            hehuanhong_212,
            chunmeihong_213,
            xiangyehong_214,
            shanhuhong_215,
            luobohong_216,
            danqianhong_217,
            yanhong_218,
            danshuhong_219,
            yusaihong_220,
            yingtaohong_221,
            danruixianghong_222,
            shizhuhong_223,
            caomolihong_224,
            chahuahong_225,
            goushuhong_226,
            qiuhaitanghong_227,
            lichunhong_228,
            xiyanghong_229,
            hedinghong_230,
            exueshihong_231,
            fupenzihong_232,
            diaozi_233,
            anyuzi_234,
            lizi_235,
            putaojiangzi_236,
            mudanfenhong_237,
            shanchahong_238,
            haitanghong_239,
            yuhong_240,
            gaolianghong_241,
            manjianghong_242,
            zaohong_243,
            putaozi_244,
            jiangzi_245,
            danshuhong_246,
            tangchangpuhong_247,
            eguanhong_248,
            meihong_249,
            fengyehong_250,
            xiancaihong_251,
            yanhong_252,
            anziyuanhong_253,
            yanhong_254,
            zhuganzi_255,
            jinyuzi_256,
            caozhuhong_257,
            danjianghong_258,
            pinhong_259,
            fengxianhuahong_260,
            fentuanhuahong_261,
            jiazhutaohong_262,
            wenpohong_263,
            jianghong_264,
            lianbanhong_265,
            shuihong_266,
            baochunhong_267,
            yuejihong_268,
            jiangdouhong_269,
            xiaguanghong_270,
            songyemudanhong_271,
            xidanhong_272,
            shubihong_273,
            jianjingyuhong_274,
            shanlidouhong_275,
            jinkuihong_276,
            shubeihui_277,
            ganzhezi_278,
            shizhuzi_279,
            cangyinghui_280,
            luanshizi_281,
            lizi_282,
            qiepizi_283,
            diaozhonghuahong_284,
            tuyanhong_285,
            zijinghong_286,
            caitouzi_287,
            yaoguanzi_288,
            putaojiuhong_289,
            moshizi_290,
            tanzi_291,
            huoezi_292,
            mozi_293,
            jinghong_294,
            biandouhuahong_295,
            baijihong_296,
            nenlinghong_297,
            bogenhong_298,
            cujiangcaohong_299,
            yangcongzi_300,
            haixiangzi_301,
            ganzi_302,
            gutongzi_303,
            shiruihong_304,
            shaoyaogenghong_305,
            canghuahong_306,
            chuhehong_307,
            mabiancaozi_308,
            dingxiangdanzi_309,
            danzihong_310,
            meiguihong_311,
            danqianniuzi_312,
            fengxinzi_313,
            luolanzi_314,
            meiguizi_315,
            tengluozi_316,
            jinzi_317,
            xunzi_318,
            jiegengzi_319,
            weizi_320,
            zhilanzi_321,
            lingmenghong_322,
            longxuhong_323,
            jifenhong_324,
            dianqishihong_325,
            yingcaozi_326,
            lusuihui_327,
            yinhonghui_328,
            xiancaizi_329,
            luhui_330,
            muyunhui_331,
            banjiuhui_332,
            dantengluozi_333,
            danqingzi_334,
            qinghakezi_335,
            doukouzi_336,
            biandouzi_337,
            jiehuazi_338,
            qinglian_339,
            zizi_340,
            gejinzi_341,
            qianniuzi_342,
            zihui_343,
            longjingyuzi_344,
            biqizi_345,
            gudinghui_346,
            wumeizi_347,
            shenqianniuzi_348,
            yinbai_349,
            qianshibai_350,
            yuanshanzi_351,
            danlanzi_352,
            shangengzi_353,
            luodianzi_354,
            manaohui_355,
            yejuzi_356,
            mantianxingzi_357,
            xinhui_358,
            yeputaozi_359,
            jianfengzi_360,
            longkuizi_361,
            anlongdanzi_362,
            oulan_410,
            xuebai_516,
            qianhui_519,
        )

    }


    object rubai_0 : ChColor(
        id = "0",
        name = "乳白",
        pinyin = "rubai",
        color = Color(0xFFf9f4dc),
        hex = "#f9f4dc",
        rgb = listOf(249, 244, 220),
        cmyk = listOf(4, 5, 18, 0)
    )

    object xingrenhuang_1 : ChColor(
        id = "1",
        name = "杏仁黄",
        pinyin = "xingrenhuang",
        color = Color(0xFFf7e8aa),
        hex = "#f7e8aa",
        rgb = listOf(249, 236, 195),
        cmyk = listOf(3, 8, 30, 0)
    )

    object molihuang_2 : ChColor(
        id = "2",
        name = "茉莉黄",
        pinyin = "molihuang",
        color = Color(0xFFf8df72),
        hex = "#f8df72",
        rgb = listOf(248, 223, 114),
        cmyk = listOf(4, 13, 67, 0)
    )

    object maiganhuang_3 : ChColor(
        id = "3",
        name = "麦秆黄",
        pinyin = "maiganhuang",
        color = Color(0xFFf8df70),
        hex = "#f8df70",
        rgb = listOf(248, 223, 112),
        cmyk = listOf(5, 14, 68, 1)
    )

    object youcaihuahuang_4 : ChColor(
        id = "4",
        name = "油菜花黄",
        pinyin = "youcaihuahuang",
        color = Color(0xFFfbda41),
        hex = "#fbda41",
        rgb = listOf(251, 218, 65),
        cmyk = listOf(2, 16, 84, 0)
    )

    object foshouhuang_5 : ChColor(
        id = "5",
        name = "佛手黄",
        pinyin = "foshouhuang",
        color = Color(0xFFfed71a),
        hex = "#fed71a",
        rgb = listOf(254, 215, 26),
        cmyk = listOf(1, 18, 94, 0)
    )

    object miehuang_6 : ChColor(
        id = "6",
        name = "篾黄",
        pinyin = "miehuang",
        color = Color(0xFFf7de98),
        hex = "#f7de98",
        rgb = listOf(247, 222, 152),
        cmyk = listOf(3, 16, 50, 0)
    )

    object kuishanhuang_7 : ChColor(
        id = "7",
        name = "葵扇黄",
        pinyin = "kuishanhuang",
        color = Color(0xFFf8d86a),
        hex = "#f8d86a",
        rgb = listOf(248, 216, 106),
        cmyk = listOf(3, 17, 69, 0)
    )

    object ningmenghuang_8 : ChColor(
        id = "8",
        name = "柠檬黄",
        pinyin = "ningmenghuang",
        color = Color(0xFFfcd337),
        hex = "#fcd337",
        rgb = listOf(252, 211, 55),
        cmyk = listOf(0, 20, 87, 0)
    )

    object jinguahuang_9 : ChColor(
        id = "9",
        name = "金瓜黄",
        pinyin = "jinguahuang",
        color = Color(0xFFfcd217),
        hex = "#fcd217",
        rgb = listOf(252, 210, 23),
        cmyk = listOf(0, 20, 95, 0)
    )

    object tenghuang_10 : ChColor(
        id = "10",
        name = "藤黄",
        pinyin = "tenghuang",
        color = Color(0xFFffd111),
        hex = "#ffd111",
        rgb = listOf(254, 209, 16),
        cmyk = listOf(0, 21, 94, 0)
    )

    object laohuang_11 : ChColor(
        id = "11",
        name = "酪黄",
        pinyin = "laohuang",
        color = Color(0xFFf6dead),
        hex = "#f6dead",
        rgb = listOf(246, 222, 173),
        cmyk = listOf(2, 16, 39, 0)
    )

    object xiangshuimeiguihuang_12 : ChColor(
        id = "12",
        name = "香水玫瑰黄",
        pinyin = "xiangshuimeiguihuang",
        color = Color(0xFFf7da94),
        hex = "#f7da94",
        rgb = listOf(247, 218, 148),
        cmyk = listOf(1, 17, 50, 0)
    )

    object danmihuang_13 : ChColor(
        id = "13",
        name = "淡密黄",
        pinyin = "danmihuang",
        color = Color(0xFFf9d367),
        hex = "#f9d367",
        rgb = listOf(249, 211, 103),
        cmyk = listOf(1, 21, 70, 0)
    )

    object dadouhuang_14 : ChColor(
        id = "14",
        name = "大豆黄",
        pinyin = "dadouhuang",
        color = Color(0xFFfbcd31),
        hex = "#fbcd31",
        rgb = listOf(251, 205, 49),
        cmyk = listOf(0, 23, 88, 0)
    )

    object suxinhuang_15 : ChColor(
        id = "15",
        name = "素馨黄",
        pinyin = "suxinhuang",
        color = Color(0xFFfccb16),
        hex = "#fccb16",
        rgb = listOf(252, 203, 22),
        cmyk = listOf(0, 24, 94, 0)
    )

    object xiangrikuihuang_16 : ChColor(
        id = "16",
        name = "向日葵黄",
        pinyin = "xiangrikuihuang",
        color = Color(0xFFfecc11),
        hex = "#fecc11",
        rgb = listOf(254, 204, 17),
        cmyk = listOf(0, 24, 94, 0)
    )

    object yalihuang_17 : ChColor(
        id = "17",
        name = "雅梨黄",
        pinyin = "yalihuang",
        color = Color(0xFFfbc82f),
        hex = "#fbc82f",
        rgb = listOf(251, 200, 47),
        cmyk = listOf(0, 27, 88, 0)
    )

    object huanglianhuang_18 : ChColor(
        id = "18",
        name = "黄连黄",
        pinyin = "huanglianhuang",
        color = Color(0xFFfcc515),
        hex = "#fcc515",
        rgb = listOf(252, 197, 21),
        cmyk = listOf(0, 28, 94, 0)
    )

    object jinzhanhuang_19 : ChColor(
        id = "19",
        name = "金盏黄",
        pinyin = "jinzhanhuang",
        color = Color(0xFFfcc307),
        hex = "#fcc307",
        rgb = listOf(252, 195, 7),
        cmyk = listOf(0, 29, 95, 0)
    )

    object dankehuang_20 : ChColor(
        id = "20",
        name = "蛋壳黄",
        pinyin = "dankehuang",
        color = Color(0xFFf8c387),
        hex = "#f8c387",
        rgb = listOf(248, 195, 135),
        cmyk = listOf(0, 32, 52, 0)
    )

    object rouse_21 : ChColor(
        id = "21",
        name = "肉色",
        pinyin = "rouse",
        color = Color(0xFFf7c173),
        hex = "#f7c173",
        rgb = listOf(247, 193, 115),
        cmyk = listOf(0, 32, 52, 0)
    )

    object ezhanghuang_22 : ChColor(
        id = "22",
        name = "鹅掌黄",
        pinyin = "ezhanghuang",
        color = Color(0xFFfbb929),
        hex = "#fbb929",
        rgb = listOf(251, 185, 41),
        cmyk = listOf(0, 35, 89, 0)
    )

    object jidanhuang_23 : ChColor(
        id = "23",
        name = "鸡蛋黄",
        pinyin = "jidanhuang",
        color = Color(0xFFfbb612),
        hex = "#fbb612",
        rgb = listOf(251, 182, 18),
        cmyk = listOf(0, 36, 93, 0)
    )

    object youhuang_24 : ChColor(
        id = "24",
        name = "鼬黄",
        pinyin = "youhuang",
        color = Color(0xFFfcb70a),
        hex = "#fcb70a",
        rgb = listOf(252, 183, 10),
        cmyk = listOf(0, 35, 94, 0)
    )

    object liuehuang_25 : ChColor(
        id = "25",
        name = "榴萼黄",
        pinyin = "liuehuang",
        color = Color(0xFFf9a633),
        hex = "#f9a633",
        rgb = listOf(249, 166, 51),
        cmyk = listOf(0, 44, 84, 0)
    )

    object danjucheng_26 : ChColor(
        id = "26",
        name = "淡橘橙",
        pinyin = "danjucheng",
        color = Color(0xFFfba414),
        hex = "#fba414",
        rgb = listOf(251, 164, 20),
        cmyk = listOf(0, 45, 92, 0)
    )

    object pipahuang_27 : ChColor(
        id = "27",
        name = "枇杷黄",
        pinyin = "pipahuang",
        color = Color(0xFFfca106),
        hex = "#fca106",
        rgb = listOf(252, 161, 6),
        cmyk = listOf(0, 47, 92, 0)
    )

    object chengpihuang_28 : ChColor(
        id = "28",
        name = "橙皮黄",
        pinyin = "chengpihuang",
        color = Color(0xFFfca104),
        hex = "#fca104",
        rgb = listOf(252, 161, 4),
        cmyk = listOf(0, 47, 92, 0)
    )

    object beiguahuang_29 : ChColor(
        id = "29",
        name = "北瓜黄",
        pinyin = "beiguahuang",
        color = Color(0xFFfc8c23),
        hex = "#fc8c23",
        rgb = listOf(252, 140, 35),
        cmyk = listOf(0, 56, 87, 0)
    )

    object xinghuang_30 : ChColor(
        id = "30",
        name = "杏黄",
        pinyin = "xinghuang",
        color = Color(0xFFf28e16),
        hex = "#f28e16",
        rgb = listOf(250, 142, 22),
        cmyk = listOf(0, 54, 92, 0)
    )

    object xionghuang_31 : ChColor(
        id = "31",
        name = "雄黄",
        pinyin = "xionghuang",
        color = Color(0xFFff9900),
        hex = "#ff9900",
        rgb = listOf(255, 153, 0),
        cmyk = listOf(0, 51, 91, 0)
    )

    object wanshoujuhuang_32 : ChColor(
        id = "32",
        name = "万寿菊黄",
        pinyin = "wanshoujuhuang",
        color = Color(0xFFfb8b05),
        hex = "#fb8b05",
        rgb = listOf(251, 139, 5),
        cmyk = listOf(0, 56, 91, 0)
    )

    object juleibai_33 : ChColor(
        id = "33",
        name = "菊蕾白",
        pinyin = "juleibai",
        color = Color(0xFFe9ddb6),
        hex = "#e9ddb6",
        rgb = listOf(233, 221, 182),
        cmyk = listOf(10, 13, 35, 1)
    )

    object qiukuihuang_34 : ChColor(
        id = "34",
        name = "秋葵黄",
        pinyin = "qiukuihuang",
        color = Color(0xFFeed045),
        hex = "#eed045",
        rgb = listOf(238, 208, 69),
        cmyk = listOf(8, 19, 84, 1)
    )

    object liuhuahuang_35 : ChColor(
        id = "35",
        name = "硫华黄",
        pinyin = "liuhuahuang",
        color = Color(0xFFf2ce2b),
        hex = "#f2ce2b",
        rgb = listOf(242, 206, 43),
        cmyk = listOf(6, 20, 92, 1)
    )

    object youhuang_36 : ChColor(
        id = "36",
        name = "柚黄",
        pinyin = "youhuang",
        color = Color(0xFFf1ca17),
        hex = "#f1ca17",
        rgb = listOf(241, 202, 23),
        cmyk = listOf(6, 22, 92, 0)
    )

    object mangguohuang_37 : ChColor(
        id = "37",
        name = "芒果黄",
        pinyin = "mangguohuang",
        color = Color(0xFFddc871),
        hex = "#ddc871",
        rgb = listOf(221, 200, 113),
        cmyk = listOf(15, 20, 66, 2)
    )

    object haohuang_38 : ChColor(
        id = "38",
        name = "蒿黄",
        pinyin = "haohuang",
        color = Color(0xFFdfc243),
        hex = "#dfc243",
        rgb = listOf(223, 194, 67),
        cmyk = listOf(14, 22, 85, 2)
    )

    object jianghuang_39 : ChColor(
        id = "39",
        name = "姜黄",
        pinyin = "jianghuang",
        color = Color(0xFFe2c027),
        hex = "#e2c027",
        rgb = listOf(226, 192, 39),
        cmyk = listOf(12, 24, 95, 2)
    )

    object xiangjiaohuang_40 : ChColor(
        id = "40",
        name = "香蕉黄",
        pinyin = "xiangjiaohuang",
        color = Color(0xFFe4bf11),
        hex = "#e4bf11",
        rgb = listOf(228, 191, 17),
        cmyk = listOf(11, 25, 99, 1)
    )

    object caohuang_41 : ChColor(
        id = "41",
        name = "草黄",
        pinyin = "caohuang",
        color = Color(0xFFd2b42c),
        hex = "#d2b42c",
        rgb = listOf(210, 180, 44),
        cmyk = listOf(17, 27, 94, 4)
    )

    object xinhelv_42 : ChColor(
        id = "42",
        name = "新禾绿",
        pinyin = "xinhelv",
        color = Color(0xFFd2b116),
        hex = "#d2b116",
        rgb = listOf(210, 177, 22),
        cmyk = listOf(17, 29, 100, 4)
    )

    object yuehui_43 : ChColor(
        id = "43",
        name = "月灰",
        pinyin = "yuehui",
        color = Color(0xFFb7ae8f),
        hex = "#b7ae8f",
        rgb = listOf(183, 174, 143),
        cmyk = listOf(28, 26, 45, 7)
    )

    object danhuilv_44 : ChColor(
        id = "44",
        name = "淡灰绿",
        pinyin = "danhuilv",
        color = Color(0xFFad9e5f),
        hex = "#ad9e5f",
        rgb = listOf(173, 158, 85),
        cmyk = listOf(30, 30, 70, 12)
    )

    object caohuilv_45 : ChColor(
        id = "45",
        name = "草灰绿",
        pinyin = "caohuilv",
        color = Color(0xFF8e804b),
        hex = "#8e804b",
        rgb = listOf(142, 128, 75),
        cmyk = listOf(38, 38, 76, 24)
    )

    object tailv_46 : ChColor(
        id = "46",
        name = "苔绿",
        pinyin = "tailv",
        color = Color(0xFF887322),
        hex = "#887322",
        rgb = listOf(136, 115, 34),
        cmyk = listOf(36, 42, 100, 29)
    )

    object biluochunlv_47 : ChColor(
        id = "47",
        name = "碧螺春绿",
        pinyin = "biluochunlv",
        color = Color(0xFF867018),
        hex = "#867018",
        rgb = listOf(134, 112, 24),
        cmyk = listOf(36, 42, 100, 30)
    )

    object yanyuhui_48 : ChColor(
        id = "48",
        name = "燕羽灰",
        pinyin = "yanyuhui",
        color = Color(0xFF685e48),
        hex = "#685e48",
        rgb = listOf(104, 94, 72),
        cmyk = listOf(47, 47, 65, 42)
    )

    object xiekehui_49 : ChColor(
        id = "49",
        name = "蟹壳灰",
        pinyin = "xiekehui",
        color = Color(0xFF695e45),
        hex = "#695e45",
        rgb = listOf(105, 94, 69),
        cmyk = listOf(46, 47, 69, 42)
    )

    object tanshuilv_50 : ChColor(
        id = "50",
        name = "潭水绿",
        pinyin = "tanshuilv",
        color = Color(0xFF645822),
        hex = "#645822",
        rgb = listOf(100, 88, 34),
        cmyk = listOf(48, 48, 100, 45)
    )

    object ganlanlv_51 : ChColor(
        id = "51",
        name = "橄榄绿",
        pinyin = "ganlanlv",
        color = Color(0xFF5e5314),
        hex = "#5e5314",
        rgb = listOf(94, 83, 20),
        cmyk = listOf(50, 50, 10, 48)
    )

    object bangroubai_52 : ChColor(
        id = "52",
        name = "蚌肉白",
        pinyin = "bangroubai",
        color = Color(0xFFf9f1db),
        hex = "#f9f1db",
        rgb = listOf(249, 241, 219),
        cmyk = listOf(2, 6, 18, 0)
    )

    object douzhihuang_53 : ChColor(
        id = "53",
        name = "豆汁黄",
        pinyin = "douzhihuang",
        color = Color(0xFFf8e8c1),
        hex = "#f8e8c1",
        rgb = listOf(248, 232, 193),
        cmyk = listOf(3, 10, 31, 0)
    )

    object danjianhuang_54 : ChColor(
        id = "54",
        name = "淡茧黄",
        pinyin = "danjianhuang",
        color = Color(0xFFf9d770),
        hex = "#f9d770",
        rgb = listOf(249, 215, 112),
        cmyk = listOf(1, 19, 66, 0)
    )

    object ruyahuang_55 : ChColor(
        id = "55",
        name = "乳鸭黄",
        pinyin = "ruyahuang",
        color = Color(0xFFffc90c),
        hex = "#ffc90c",
        rgb = listOf(255, 201, 12),
        cmyk = listOf(0, 26, 94, 0)
    )

    object liroubai_56 : ChColor(
        id = "56",
        name = "荔肉白",
        pinyin = "liroubai",
        color = Color(0xFFf2e6ce),
        hex = "#f2e6ce",
        rgb = listOf(242, 230, 206),
        cmyk = listOf(5, 11, 22, 0)
    )

    object xiangyahuang_57 : ChColor(
        id = "57",
        name = "象牙黄",
        pinyin = "xiangyahuang",
        color = Color(0xFFf0d695),
        hex = "#f0d695",
        rgb = listOf(240, 214, 149),
        cmyk = listOf(5, 19, 50, 0)
    )

    object chaomihuang_58 : ChColor(
        id = "58",
        name = "炒米黄",
        pinyin = "chaomihuang",
        color = Color(0xFFf4ce69),
        hex = "#f4ce69",
        rgb = listOf(244, 206, 105),
        cmyk = listOf(3, 23, 69, 0)
    )

    object yingwuguanhuang_59 : ChColor(
        id = "59",
        name = "鹦鹉冠黄",
        pinyin = "yingwuguanhuang",
        color = Color(0xFFf6c430),
        hex = "#f6c430",
        rgb = listOf(246, 196, 48),
        cmyk = listOf(1, 28, 89, 0)
    )

    object muguahuang_60 : ChColor(
        id = "60",
        name = "木瓜黄",
        pinyin = "muguahuang",
        color = Color(0xFFf9c116),
        hex = "#f9c116",
        rgb = listOf(249, 193, 22),
        cmyk = listOf(0, 30, 95, 0)
    )

    object qianlaohuang_61 : ChColor(
        id = "61",
        name = "浅烙黄",
        pinyin = "qianlaohuang",
        color = Color(0xFFf9bd10),
        hex = "#f9bd10",
        rgb = listOf(249, 189, 16),
        cmyk = listOf(0, 32, 95, 0)
    )

    object lianzibai_62 : ChColor(
        id = "62",
        name = "莲子白",
        pinyin = "lianzibai",
        color = Color(0xFFe5d3aa),
        hex = "#e5d3aa",
        rgb = listOf(229, 211, 170),
        cmyk = listOf(11, 18, 39, 1)
    )

    object guhuang_63 : ChColor(
        id = "63",
        name = "谷黄",
        pinyin = "guhuang",
        color = Color(0xFFe8b004),
        hex = "#e8b004",
        rgb = listOf(232, 176, 4),
        cmyk = listOf(5, 35, 99, 0)
    )

    object zhizihuang_64 : ChColor(
        id = "64",
        name = "栀子黄",
        pinyin = "zhizihuang",
        color = Color(0xFFebb10d),
        hex = "#ebb10d",
        rgb = listOf(235, 177, 13),
        cmyk = listOf(3, 36, 99, 0)
    )

    object jiehuang_65 : ChColor(
        id = "65",
        name = "芥黄",
        pinyin = "jiehuang",
        color = Color(0xFFd9a40e),
        hex = "#d9a40e",
        rgb = listOf(217, 164, 14),
        cmyk = listOf(11, 39, 100, 2)
    )

    object yinshuhui_66 : ChColor(
        id = "66",
        name = "银鼠灰",
        pinyin = "yinshuhui",
        color = Color(0xFFb5aa90),
        hex = "#b5aa90",
        rgb = listOf(181, 170, 144),
        cmyk = listOf(28, 27, 43, 8)
    )

    object chenhui_67 : ChColor(
        id = "67",
        name = "尘灰",
        pinyin = "chenhui",
        color = Color(0xFFb6a476),
        hex = "#b6a476",
        rgb = listOf(182, 164, 118),
        cmyk = listOf(26, 31, 57, 10)
    )

    object kulv_68 : ChColor(
        id = "68",
        name = "枯绿",
        pinyin = "kulv",
        color = Color(0xFFb78d12),
        hex = "#b78d12",
        rgb = listOf(183, 141, 18),
        cmyk = listOf(21, 43, 100, 11)
    )

    object jiaoqing_69 : ChColor(
        id = "69",
        name = "鲛青",
        pinyin = "jiaoqing",
        color = Color(0xFF87723e),
        hex = "#87723e",
        rgb = listOf(135, 114, 62),
        cmyk = listOf(35, 44, 80, 30)
    )

    object zongyelv_70 : ChColor(
        id = "70",
        name = "粽叶绿",
        pinyin = "zongyelv",
        color = Color(0xFF876818),
        hex = "#876818",
        rgb = listOf(135, 104, 24),
        cmyk = listOf(32, 50, 100, 31)
    )

    object huilv_71 : ChColor(
        id = "71",
        name = "灰绿",
        pinyin = "huilv",
        color = Color(0xFF8a6913),
        hex = "#8a6913",
        rgb = listOf(138, 105, 19),
        cmyk = listOf(31, 51, 100, 30)
    )

    object hehui_72 : ChColor(
        id = "72",
        name = "鹤灰",
        pinyin = "hehui",
        color = Color(0xFF4a4035),
        hex = "#4a4035",
        rgb = listOf(74, 64, 53),
        cmyk = listOf(52, 56, 64, 62)
    )

    object dansongyan_73 : ChColor(
        id = "73",
        name = "淡松烟",
        pinyin = "dansongyan",
        color = Color(0xFF4d4030),
        hex = "#4d4030",
        rgb = listOf(77, 64, 48),
        cmyk = listOf(48, 58, 70, 62)
    )

    object anhaishuilv_74 : ChColor(
        id = "74",
        name = "暗海水绿",
        pinyin = "anhaishuilv",
        color = Color(0xFF584717),
        hex = "#584717",
        rgb = listOf(88, 71, 23),
        cmyk = listOf(45, 56, 100, 56)
    )

    object zonglvlv_75 : ChColor(
        id = "75",
        name = "棕榈绿",
        pinyin = "zonglvlv",
        color = Color(0xFF5b4913),
        hex = "#5b4913",
        rgb = listOf(91, 73, 19),
        cmyk = listOf(45, 55, 100, 54)
    )

    object mise_76 : ChColor(
        id = "76",
        name = "米色",
        pinyin = "mise",
        color = Color(0xFFf9e9cd),
        hex = "#f9e9cd",
        rgb = listOf(249, 223, 205),
        cmyk = listOf(1, 11, 24, 0)
    )

    object danrouse_77 : ChColor(
        id = "77",
        name = "淡肉色",
        pinyin = "danrouse",
        color = Color(0xFFf8e0b0),
        hex = "#f8e0b0",
        rgb = listOf(248, 224, 176),
        cmyk = listOf(1, 15, 38, 0)
    )

    object maiyatanghuang_78 : ChColor(
        id = "78",
        name = "麦芽糖黄",
        pinyin = "maiyatanghuang",
        color = Color(0xFFf9d27d),
        hex = "#f9d27d",
        rgb = listOf(249, 210, 125),
        cmyk = listOf(0, 23, 59, 0)
    )

    object hupohuang_79 : ChColor(
        id = "79",
        name = "琥珀黄",
        pinyin = "hupohuang",
        color = Color(0xFFfeba07),
        hex = "#feba07",
        rgb = listOf(254, 186, 7),
        cmyk = listOf(0, 34, 93, 0)
    )

    object gancaohuang_80 : ChColor(
        id = "80",
        name = "甘草黄",
        pinyin = "gancaohuang",
        color = Color(0xFFf3bf4c),
        hex = "#f3bf4c",
        rgb = listOf(243, 191, 76),
        cmyk = listOf(1, 31, 79, 0)
    )

    object chushuxinghuang_81 : ChColor(
        id = "81",
        name = "初熟杏黄",
        pinyin = "chushuxinghuang",
        color = Color(0xFFf8bc31),
        hex = "#f8bc31",
        rgb = listOf(248, 188, 49),
        cmyk = listOf(0, 33, 83, 0)
    )

    object qiantuose_82 : ChColor(
        id = "82",
        name = "浅驼色",
        pinyin = "qiantuose",
        color = Color(0xFFe2c17c),
        hex = "#e2c17c",
        rgb = listOf(226, 193, 124),
        cmyk = listOf(10, 27, 59, 1)
    )

    object shashihuang_83 : ChColor(
        id = "83",
        name = "沙石黄",
        pinyin = "shashihuang",
        color = Color(0xFFe5b751),
        hex = "#e5b751",
        rgb = listOf(229, 183, 81),
        cmyk = listOf(7, 32, 78, 1)
    )

    object hupihuang_84 : ChColor(
        id = "84",
        name = "虎皮黄",
        pinyin = "hupihuang",
        color = Color(0xFFeaad1a),
        hex = "#eaad1a",
        rgb = listOf(234, 173, 26),
        cmyk = listOf(3, 38, 97, 0)
    )

    object tuhuang_85 : ChColor(
        id = "85",
        name = "土黄",
        pinyin = "tuhuang",
        color = Color(0xFFd6a01d),
        hex = "#d6a01d",
        rgb = listOf(214, 160, 29),
        cmyk = listOf(12, 41, 98, 2)
    )

    object bailingniaohui_86 : ChColor(
        id = "86",
        name = "百灵鸟灰",
        pinyin = "bailingniaohui",
        color = Color(0xFFb4a992),
        hex = "#b4a992",
        rgb = listOf(180, 169, 146),
        cmyk = listOf(28, 28, 41, 9)
    )

    object shanjihuang_87 : ChColor(
        id = "87",
        name = "山鸡黄",
        pinyin = "shanjihuang",
        color = Color(0xFFb78b26),
        hex = "#b78b26",
        rgb = listOf(183, 139, 38),
        cmyk = listOf(21, 44, 97, 11)
    )

    object guibeihuang_88 : ChColor(
        id = "88",
        name = "龟背黄",
        pinyin = "guibeihuang",
        color = Color(0xFF826b48),
        hex = "#826b48",
        rgb = listOf(130, 107, 72),
        cmyk = listOf(35, 47, 71, 33)
    )

    object canghuang_89 : ChColor(
        id = "89",
        name = "苍黄",
        pinyin = "canghuang",
        color = Color(0xFF806332),
        hex = "#806332",
        rgb = listOf(128, 99, 50),
        cmyk = listOf(34, 52, 85, 35)
    )

    object laiyanglihuang_90 : ChColor(
        id = "90",
        name = "莱阳梨黄",
        pinyin = "laiyanglihuang",
        color = Color(0xFF815f25),
        hex = "#815f25",
        rgb = listOf(129, 95, 37),
        cmyk = listOf(32, 56, 96, 34)
    )

    object yililv_91 : ChColor(
        id = "91",
        name = "蜴蜊绿",
        pinyin = "yililv",
        color = Color(0xFF835e1d),
        hex = "#835e1d",
        rgb = listOf(131, 94, 29),
        cmyk = listOf(31, 57, 100, 33)
    )

    object songshuhui_92 : ChColor(
        id = "92",
        name = "松鼠灰",
        pinyin = "songshuhui",
        color = Color(0xFF4f4032),
        hex = "#4f4032",
        rgb = listOf(79, 64, 50),
        cmyk = listOf(46, 59, 68, 61)
    )

    object ganlanhui_93 : ChColor(
        id = "93",
        name = "橄榄灰",
        pinyin = "ganlanhui",
        color = Color(0xFF503e2a),
        hex = "#503e2a",
        rgb = listOf(80, 62, 42),
        cmyk = listOf(44, 61, 76, 62)
    )

    object xiekelv_94 : ChColor(
        id = "94",
        name = "蟹壳绿",
        pinyin = "xiekelv",
        color = Color(0xFF513c20),
        hex = "#513c20",
        rgb = listOf(81, 60, 32),
        cmyk = listOf(43, 63, 88, 61)
    )

    object gutonglv_95 : ChColor(
        id = "95",
        name = "古铜绿",
        pinyin = "gutonglv",
        color = Color(0xFF533c1b),
        hex = "#533c1b",
        rgb = listOf(83, 60, 27),
        cmyk = listOf(42, 64, 94, 60)
    )

    object jiaochalv_96 : ChColor(
        id = "96",
        name = "焦茶绿",
        pinyin = "jiaochalv",
        color = Color(0xFF553b18),
        hex = "#553b18",
        rgb = listOf(85, 59, 24),
        cmyk = listOf(41, 66, 94, 60)
    )

    object fenbai_97 : ChColor(
        id = "97",
        name = "粉白",
        pinyin = "fenbai",
        color = Color(0xFFfbf2e3),
        hex = "#fbf2e3",
        rgb = listOf(251, 242, 227),
        cmyk = listOf(1, 7, 13, 0)
    )

    object luoyingdanfen_98 : ChColor(
        id = "98",
        name = "落英淡粉",
        pinyin = "luoyingdanfen",
        color = Color(0xFFf9e8d0),
        hex = "#f9e8d0",
        rgb = listOf(249, 232, 208),
        cmyk = listOf(1, 12, 22, 0)
    )

    object guarangfen_99 : ChColor(
        id = "99",
        name = "瓜瓤粉",
        pinyin = "guarangfen",
        color = Color(0xFFf9cb8b),
        hex = "#f9cb8b",
        rgb = listOf(249, 203, 139),
        cmyk = listOf(0, 27, 51, 0)
    )

    object mihuang_100 : ChColor(
        id = "100",
        name = "蜜黄",
        pinyin = "mihuang",
        color = Color(0xFFfbb957),
        hex = "#fbb957",
        rgb = listOf(251, 185, 87),
        cmyk = listOf(0, 36, 72, 0)
    )

    object jinyehuang_101 : ChColor(
        id = "101",
        name = "金叶黄",
        pinyin = "jinyehuang",
        color = Color(0xFFffa60f),
        hex = "#ffa60f",
        rgb = listOf(255, 166, 15),
        cmyk = listOf(0, 44, 91, 0)
    )

    object jinyinghuang_102 : ChColor(
        id = "102",
        name = "金莺黄",
        pinyin = "jinyinghuang",
        color = Color(0xFFf4a83a),
        hex = "#f4a83a",
        rgb = listOf(244, 168, 58),
        cmyk = listOf(0, 43, 82, 0)
    )

    object lujiaozong_103 : ChColor(
        id = "103",
        name = "鹿角棕",
        pinyin = "lujiaozong",
        color = Color(0xFFe3bd8d),
        hex = "#e3bd8d",
        rgb = listOf(227, 189, 141),
        cmyk = listOf(8, 31, 50, 1)
    )

    object diaoyezong_104 : ChColor(
        id = "104",
        name = "凋叶棕",
        pinyin = "diaoyezong",
        color = Color(0xFFe7a23f),
        hex = "#e7a23f",
        rgb = listOf(231, 162, 63),
        cmyk = listOf(2, 44, 83, 0)
    )

    object daimaohuang_105 : ChColor(
        id = "105",
        name = "玳瑁黄",
        pinyin = "daimaohuang",
        color = Color(0xFFdaa45a),
        hex = "#daa45a",
        rgb = listOf(218, 164, 90),
        cmyk = listOf(10, 41, 72, 1)
    )

    object ruanmuhuang_106 : ChColor(
        id = "106",
        name = "软木黄",
        pinyin = "ruanmuhuang",
        color = Color(0xFFde9e44),
        hex = "#de9e44",
        rgb = listOf(222, 158, 68),
        cmyk = listOf(7, 45, 82, 1)
    )

    object fengfanhuang_107 : ChColor(
        id = "107",
        name = "风帆黄",
        pinyin = "fengfanhuang",
        color = Color(0xFFdc9123),
        hex = "#dc9123",
        rgb = listOf(220, 145, 35),
        cmyk = listOf(6, 51, 95, 1)
    )

    object guipidanzong_108 : ChColor(
        id = "108",
        name = "桂皮淡棕",
        pinyin = "guipidanzong",
        color = Color(0xFFc09351),
        hex = "#c09351",
        rgb = listOf(192, 147, 81),
        cmyk = listOf(19, 44, 75, 7)
    )

    object houmaohui_109 : ChColor(
        id = "109",
        name = "猴毛灰",
        pinyin = "houmaohui",
        color = Color(0xFF97846c),
        hex = "#97846c",
        rgb = listOf(151, 132, 108),
        cmyk = listOf(32, 40, 53, 22)
    )

    object shanjihe_110 : ChColor(
        id = "110",
        name = "山鸡褐",
        pinyin = "shanjihe",
        color = Color(0xFF986524),
        hex = "#986524",
        rgb = listOf(152, 101, 36),
        cmyk = listOf(27, 60, 97, 21)
    )

    object tuose_111 : ChColor(
        id = "111",
        name = "驼色",
        pinyin = "tuose",
        color = Color(0xFF66462a),
        hex = "#66462a",
        rgb = listOf(102, 70, 42),
        cmyk = listOf(37, 65, 84, 49)
    )

    object chahe_112 : ChColor(
        id = "112",
        name = "茶褐",
        pinyin = "chahe",
        color = Color(0xFF5d3d21),
        hex = "#5d3d21",
        rgb = listOf(93, 61, 33),
        cmyk = listOf(38, 69, 90, 54)
    )

    object gutonghe_113 : ChColor(
        id = "113",
        name = "古铜褐",
        pinyin = "gutonghe",
        color = Color(0xFF5c3719),
        hex = "#5c3719",
        rgb = listOf(92, 55, 25),
        cmyk = listOf(37, 74, 96, 55)
    )

    object hehuabai_114 : ChColor(
        id = "114",
        name = "荷花白",
        pinyin = "hehuabai",
        color = Color(0xFFfbecde),
        hex = "#fbecde",
        rgb = listOf(251, 236, 222),
        cmyk = listOf(0, 10, 14, 0)
    )

    object meiguifen_115 : ChColor(
        id = "115",
        name = "玫瑰粉",
        pinyin = "meiguifen",
        color = Color(0xFFf8b37f),
        hex = "#f8b37f",
        rgb = listOf(248, 179, 127),
        cmyk = listOf(0, 40, 52, 0)
    )

    object jucheng_116 : ChColor(
        id = "116",
        name = "橘橙",
        pinyin = "jucheng",
        color = Color(0xFFf97d1c),
        hex = "#f97d1c",
        rgb = listOf(249, 125, 28),
        cmyk = listOf(0, 62, 88, 0)
    )

    object meirenjiaocheng_117 : ChColor(
        id = "117",
        name = "美人焦橙",
        pinyin = "meirenjiaocheng",
        color = Color(0xFFfa7e23),
        hex = "#fa7e23",
        rgb = listOf(250, 126, 35),
        cmyk = listOf(0, 62, 85, 0)
    )

    object runhong_118 : ChColor(
        id = "118",
        name = "润红",
        pinyin = "runhong",
        color = Color(0xFFf7cdbc),
        hex = "#f7cdbc",
        rgb = listOf(247, 205, 188),
        cmyk = listOf(0, 28, 25, 0)
    )

    object dantaohong_119 : ChColor(
        id = "119",
        name = "淡桃红",
        pinyin = "dantaohong",
        color = Color(0xFFf6cec1),
        hex = "#f6cec1",
        rgb = listOf(246, 206, 193),
        cmyk = listOf(0, 28, 22, 0)
    )

    object hailuocheng_120 : ChColor(
        id = "120",
        name = "海螺橙",
        pinyin = "hailuocheng",
        color = Color(0xFFf0945d),
        hex = "#f0945d",
        rgb = listOf(240, 148, 93),
        cmyk = listOf(0, 53, 65, 0)
    )

    object taohong_121 : ChColor(
        id = "121",
        name = "桃红",
        pinyin = "taohong",
        color = Color(0xFFf0ada0),
        hex = "#f0ada0",
        rgb = listOf(240, 173, 160),
        cmyk = listOf(0, 44, 32, 0)
    )

    object jiahong_122 : ChColor(
        id = "122",
        name = "颊红",
        pinyin = "jiahong",
        color = Color(0xFFeeaa9c),
        hex = "#eeaa9c",
        rgb = listOf(238, 170, 156),
        cmyk = listOf(0, 45, 34, 0)
    )

    object danyingsuhong_123 : ChColor(
        id = "123",
        name = "淡罂粟红",
        pinyin = "danyingsuhong",
        color = Color(0xFFeea08c),
        hex = "#eea08c",
        rgb = listOf(238, 160, 140),
        cmyk = listOf(0, 49, 41, 0)
    )

    object chenxihong_124 : ChColor(
        id = "124",
        name = "晨曦红",
        pinyin = "chenxihong",
        color = Color(0xFFea8958),
        hex = "#ea8958",
        rgb = listOf(234, 137, 88),
        cmyk = listOf(0, 58, 67, 0)
    )

    object xiekehong_125 : ChColor(
        id = "125",
        name = "蟹壳红",
        pinyin = "xiekehong",
        color = Color(0xFFf27635),
        hex = "#f27635",
        rgb = listOf(242, 118, 53),
        cmyk = listOf(0, 65, 80, 0)
    )

    object jinlianhuacheng_126 : ChColor(
        id = "126",
        name = "金莲花橙",
        pinyin = "jinlianhuacheng",
        color = Color(0xFFf86b1d),
        hex = "#f86b1d",
        rgb = listOf(248, 107, 29),
        cmyk = listOf(0, 69, 86, 0)
    )

    object caomeihong_127 : ChColor(
        id = "127",
        name = "草莓红",
        pinyin = "caomeihong",
        color = Color(0xFFef6f48),
        hex = "#ef6f48",
        rgb = listOf(239, 111, 72),
        cmyk = listOf(0, 69, 70, 0)
    )

    object longjingyuhong_128 : ChColor(
        id = "128",
        name = "龙睛鱼红",
        pinyin = "longjingyuhong",
        color = Color(0xFFef632b),
        hex = "#ef632b",
        rgb = listOf(239, 99, 43),
        cmyk = listOf(0, 72, 82, 0)
    )

    object qingtinghong_129 : ChColor(
        id = "129",
        name = "蜻蜓红",
        pinyin = "qingtinghong",
        color = Color(0xFFf1441d),
        hex = "#f1441d",
        rgb = listOf(241, 68, 29),
        cmyk = listOf(0, 81, 84, 0)
    )

    object dahong_130 : ChColor(
        id = "130",
        name = "大红",
        pinyin = "dahong",
        color = Color(0xFFf04b22),
        hex = "#f04b22",
        rgb = listOf(240, 75, 34),
        cmyk = listOf(0, 80, 83, 0)
    )

    object shihong_131 : ChColor(
        id = "131",
        name = "柿红",
        pinyin = "shihong",
        color = Color(0xFFf2481b),
        hex = "#f2481b",
        rgb = listOf(242, 72, 27),
        cmyk = listOf(0, 80, 85, 0)
    )

    object liuhuahong_132 : ChColor(
        id = "132",
        name = "榴花红",
        pinyin = "liuhuahong",
        color = Color(0xFFf34718),
        hex = "#f34718",
        rgb = listOf(243, 71, 24),
        cmyk = listOf(0, 80, 85, 0)
    )

    object yinzhu_133 : ChColor(
        id = "133",
        name = "银朱",
        pinyin = "yinzhu",
        color = Color(0xFFf43e06),
        hex = "#f43e06",
        rgb = listOf(244, 62, 6),
        cmyk = listOf(0, 83, 87, 0)
    )

    object zhuhong_134 : ChColor(
        id = "134",
        name = "朱红",
        pinyin = "zhuhong",
        color = Color(0xFFed5126),
        hex = "#ed5126",
        rgb = listOf(237, 81, 38),
        cmyk = listOf(0, 78, 83, 0)
    )

    object guiyuhong_135 : ChColor(
        id = "135",
        name = "鲑鱼红",
        pinyin = "guiyuhong",
        color = Color(0xFFf09c5a),
        hex = "#f09c5a",
        rgb = listOf(240, 156, 90),
        cmyk = listOf(0, 50, 68, 0)
    )

    object jinhuang_136 : ChColor(
        id = "136",
        name = "金黄",
        pinyin = "jinhuang",
        color = Color(0xFFf26b1f),
        hex = "#f26b1f",
        rgb = listOf(242, 123, 31),
        cmyk = listOf(5, 69, 87, 0)
    )

    object lupihe_137 : ChColor(
        id = "137",
        name = "鹿皮褐",
        pinyin = "lupihe",
        color = Color(0xFFd99156),
        hex = "#d99156",
        rgb = listOf(217, 145, 86),
        cmyk = listOf(7, 52, 71, 1)
    )

    object zuiguarou_138 : ChColor(
        id = "138",
        name = "醉瓜肉",
        pinyin = "zuiguarou",
        color = Color(0xFFdb8540),
        hex = "#db8540",
        rgb = listOf(219, 133, 64),
        cmyk = listOf(4, 57, 82, 1)
    )

    object jizong_139 : ChColor(
        id = "139",
        name = "麂棕",
        pinyin = "jizong",
        color = Color(0xFFde7622),
        hex = "#de7622",
        rgb = listOf(222, 118, 34),
        cmyk = listOf(0, 64, 93, 0)
    )

    object danyinhui_140 : ChColor(
        id = "140",
        name = "淡银灰",
        pinyin = "danyinhui",
        color = Color(0xFFc1b2a3),
        hex = "#c1b2a3",
        rgb = listOf(193, 178, 163),
        cmyk = listOf(22, 28, 34, 6)
    )

    object danzhe_141 : ChColor(
        id = "141",
        name = "淡赭",
        pinyin = "danzhe",
        color = Color(0xFFbe7e4a),
        hex = "#be7e4a",
        rgb = listOf(190, 126, 74),
        cmyk = listOf(18, 57, 76, 6)
    )

    object binglangzong_142 : ChColor(
        id = "142",
        name = "槟榔综",
        pinyin = "binglangzong",
        color = Color(0xFFc1651a),
        hex = "#c1651a",
        rgb = listOf(193, 101, 26),
        cmyk = listOf(14, 69, 100, 4)
    )

    object yinhui_143 : ChColor(
        id = "143",
        name = "银灰",
        pinyin = "yinhui",
        color = Color(0xFF918072),
        hex = "#918072",
        rgb = listOf(145, 128, 114),
        cmyk = listOf(34, 42, 46, 23)
    )

    object haiouhui_144 : ChColor(
        id = "144",
        name = "海鸥灰",
        pinyin = "haiouhui",
        color = Color(0xFF9a8878),
        hex = "#9a8878",
        rgb = listOf(154, 136, 120),
        cmyk = listOf(42, 40, 46, 20)
    )

    object dankafei_145 : ChColor(
        id = "145",
        name = "淡咖啡",
        pinyin = "dankafei",
        color = Color(0xFF945833),
        hex = "#945833",
        rgb = listOf(148, 88, 51),
        cmyk = listOf(27, 69, 85, 22)
    )

    object yanshizong_146 : ChColor(
        id = "146",
        name = "岩石棕",
        pinyin = "yanshizong",
        color = Color(0xFF964d22),
        hex = "#964d22",
        rgb = listOf(150, 77, 34),
        cmyk = listOf(26, 76, 97, 20)
    )

    object mangguozong_147 : ChColor(
        id = "147",
        name = "芒果棕",
        pinyin = "mangguozong",
        color = Color(0xFF954416),
        hex = "#954416",
        rgb = listOf(149, 68, 22),
        cmyk = listOf(25, 80, 100, 20)
    )

    object shibanhui_148 : ChColor(
        id = "148",
        name = "石板灰",
        pinyin = "shibanhui",
        color = Color(0xFF624941),
        hex = "#624941",
        rgb = listOf(98, 73, 65),
        cmyk = listOf(39, 60, 58, 51)
    )

    object zhumuhui_149 : ChColor(
        id = "149",
        name = "珠母灰",
        pinyin = "zhumuhui",
        color = Color(0xFF64483d),
        hex = "#64483d",
        rgb = listOf(100, 72, 61),
        cmyk = listOf(38, 63, 63, 50)
    )

    object dingxiangzong_150 : ChColor(
        id = "150",
        name = "丁香棕",
        pinyin = "dingxiangzong",
        color = Color(0xFF71361d),
        hex = "#71361d",
        rgb = listOf(113, 54, 29),
        cmyk = listOf(32, 83, 96, 41)
    )

    object kafei_151 : ChColor(
        id = "151",
        name = "咖啡",
        pinyin = "kafei",
        color = Color(0xFF753117),
        hex = "#753117",
        rgb = listOf(117, 49, 23),
        cmyk = listOf(30, 87, 100, 38)
    )

    object sunpizong_152 : ChColor(
        id = "152",
        name = "筍皮棕",
        pinyin = "sunpizong",
        color = Color(0xFF732e12),
        hex = "#732e12",
        rgb = listOf(115, 46, 18),
        cmyk = listOf(30, 89, 100, 39)
    )

    object yanhanhong_153 : ChColor(
        id = "153",
        name = "燕颔红",
        pinyin = "yanhanhong",
        color = Color(0xFFfc6315),
        hex = "#fc6315",
        rgb = listOf(252, 99, 21),
        cmyk = listOf(0, 72, 86, 0)
    )

    object yufenhong_154 : ChColor(
        id = "154",
        name = "玉粉红",
        pinyin = "yufenhong",
        color = Color(0xFFe8b49a),
        hex = "#e8b49a",
        rgb = listOf(232, 180, 154),
        cmyk = listOf(3, 38, 39, 0)
    )

    object jintuo_155 : ChColor(
        id = "155",
        name = "金驼",
        pinyin = "jintuo",
        color = Color(0xFFe46828),
        hex = "#e46828",
        rgb = listOf(228, 104, 40),
        cmyk = listOf(0, 70, 87, 0)
    )

    object tiezong_156 : ChColor(
        id = "156",
        name = "铁棕",
        pinyin = "tiezong",
        color = Color(0xFFd85916),
        hex = "#d85916",
        rgb = listOf(216, 89, 22),
        cmyk = listOf(0, 76, 97, 0)
    )

    object zhuwanghui_157 : ChColor(
        id = "157",
        name = "蛛网灰",
        pinyin = "zhuwanghui",
        color = Color(0xFFb7a091),
        hex = "#b7a091",
        rgb = listOf(183, 160, 145),
        cmyk = listOf(23, 35, 38, 10)
    )

    object dankekezong_158 : ChColor(
        id = "158",
        name = "淡可可棕",
        pinyin = "dankekezong",
        color = Color(0xFFb7511d),
        hex = "#b7511d",
        rgb = listOf(183, 81, 29),
        cmyk = listOf(16, 77, 100, 6)
    )

    object zhonghonghui_159 : ChColor(
        id = "159",
        name = "中红灰",
        pinyin = "zhonghonghui",
        color = Color(0xFF8b614d),
        hex = "#8b614d",
        rgb = listOf(139, 97, 77),
        cmyk = listOf(31, 63, 66, 31)
    )

    object dantuhuang_160 : ChColor(
        id = "160",
        name = "淡土黄",
        pinyin = "dantuhuang",
        color = Color(0xFF8c4b31),
        hex = "#8c4b31",
        rgb = listOf(140, 75, 49),
        cmyk = listOf(28, 76, 82, 26)
    )

    object dandousha_161 : ChColor(
        id = "161",
        name = "淡豆沙",
        pinyin = "dandousha",
        color = Color(0xFF873d24),
        hex = "#873d24",
        rgb = listOf(135, 61, 36),
        cmyk = listOf(28, 83, 92, 28)
    )

    object yekezong_162 : ChColor(
        id = "162",
        name = "椰壳棕",
        pinyin = "yekezong",
        color = Color(0xFF883a1e),
        hex = "#883a1e",
        rgb = listOf(136, 58, 30),
        cmyk = listOf(27, 85, 98, 27)
    )

    object dantiehui_163 : ChColor(
        id = "163",
        name = "淡铁灰",
        pinyin = "dantiehui",
        color = Color(0xFF5b423a),
        hex = "#5b423a",
        rgb = listOf(91, 66, 58),
        cmyk = listOf(40, 64, 61, 56)
    )

    object zhonghuituo_164 : ChColor(
        id = "164",
        name = "中灰驼",
        pinyin = "zhonghuituo",
        color = Color(0xFF603d30),
        hex = "#603d30",
        rgb = listOf(96, 61, 48),
        cmyk = listOf(37, 72, 72, 52)
    )

    object danlizong_165 : ChColor(
        id = "165",
        name = "淡栗棕",
        pinyin = "danlizong",
        color = Color(0xFF673424),
        hex = "#673424",
        rgb = listOf(103, 52, 36),
        cmyk = listOf(34, 82, 85, 47)
    )

    object kekezong_166 : ChColor(
        id = "166",
        name = "可可棕",
        pinyin = "kekezong",
        color = Color(0xFF652b1c),
        hex = "#652b1c",
        rgb = listOf(101, 43, 28),
        cmyk = listOf(33, 89, 92, 48)
    )

    object zhayezong_167 : ChColor(
        id = "167",
        name = "柞叶棕",
        pinyin = "zhayezong",
        color = Color(0xFF692a1b),
        hex = "#692a1b",
        rgb = listOf(105, 42, 27),
        cmyk = listOf(32, 90, 95, 45)
    )

    object yeqiangweihong_168 : ChColor(
        id = "168",
        name = "野蔷薇红",
        pinyin = "yeqiangweihong",
        color = Color(0xFFfb9968),
        hex = "#fb9968",
        rgb = listOf(251, 153, 104),
        cmyk = listOf(0, 53, 59, 0)
    )

    object boluohong_169 : ChColor(
        id = "169",
        name = "菠萝红",
        pinyin = "boluohong",
        color = Color(0xFFfc7930),
        hex = "#fc7930",
        rgb = listOf(252, 121, 48),
        cmyk = listOf(0, 65, 79, 0)
    )

    object ouhe_170 : ChColor(
        id = "170",
        name = "藕荷",
        pinyin = "ouhe",
        color = Color(0xFFedc3ae),
        hex = "#edc3ae",
        rgb = listOf(237, 195, 174),
        cmyk = listOf(2, 31, 31, 0)
    )

    object taocihong_171 : ChColor(
        id = "171",
        name = "陶瓷红",
        pinyin = "taocihong",
        color = Color(0xFFe16723),
        hex = "#e16723",
        rgb = listOf(225, 103, 35),
        cmyk = listOf(0, 70, 91, 0)
    )

    object xiaohui_172 : ChColor(
        id = "172",
        name = "晓灰",
        pinyin = "xiaohui",
        color = Color(0xFFd4c4b7),
        hex = "#d4c4b7",
        rgb = listOf(212, 196, 183),
        cmyk = listOf(16, 23, 27, 2)
    )

    object yujinhong_173 : ChColor(
        id = "173",
        name = "余烬红",
        pinyin = "yujinhong",
        color = Color(0xFFcf7543),
        hex = "#cf7543",
        rgb = listOf(207, 117, 67),
        cmyk = listOf(9, 64, 78, 1)
    )

    object huozhuanhong_174 : ChColor(
        id = "174",
        name = "火砖红",
        pinyin = "huozhuanhong",
        color = Color(0xFFcd6227),
        hex = "#cd6227",
        rgb = listOf(205, 98, 39),
        cmyk = listOf(8, 72, 93, 1)
    )

    object huonizong_175 : ChColor(
        id = "175",
        name = "火泥棕",
        pinyin = "huonizong",
        color = Color(0xFFaa6a4c),
        hex = "#aa6a4c",
        rgb = listOf(170, 106, 76),
        cmyk = listOf(22, 64, 71, 12)
    )

    object ganhong_176 : ChColor(
        id = "176",
        name = "绀红",
        pinyin = "ganhong",
        color = Color(0xFFa6522c),
        hex = "#a6522c",
        rgb = listOf(166, 82, 44),
        cmyk = listOf(20, 76, 92, 9)
    )

    object xiangshuzong_177 : ChColor(
        id = "177",
        name = "橡树棕",
        pinyin = "xiangshuzong",
        color = Color(0xFF773d31),
        hex = "#773d31",
        rgb = listOf(119, 61, 49),
        cmyk = listOf(31, 79, 77, 37)
    )

    object haibaohui_178 : ChColor(
        id = "178",
        name = "海报灰",
        pinyin = "haibaohui",
        color = Color(0xFF483332),
        hex = "#483332",
        rgb = listOf(72, 51, 50),
        cmyk = listOf(45, 68, 57, 66)
    )

    object meiguihui_179 : ChColor(
        id = "179",
        name = "玫瑰灰",
        pinyin = "meiguihui",
        color = Color(0xFF4b2e2b),
        hex = "#4b2e2b",
        rgb = listOf(175, 46, 43),
        cmyk = listOf(41, 76, 64, 65)
    )

    object huoshanzong_180 : ChColor(
        id = "180",
        name = "火山棕",
        pinyin = "huoshanzong",
        color = Color(0xFF482522),
        hex = "#482522",
        rgb = listOf(72, 37, 34),
        cmyk = listOf(41, 84, 71, 67)
    )

    object dousha_181 : ChColor(
        id = "181",
        name = "豆沙",
        pinyin = "dousha",
        color = Color(0xFF481e1c),
        hex = "#481e1c",
        rgb = listOf(72, 30, 28),
        cmyk = listOf(40, 92, 78, 66)
    )

    object danmifen_182 : ChColor(
        id = "182",
        name = "淡米粉",
        pinyin = "danmifen",
        color = Color(0xFFfbeee2),
        hex = "#fbeee2",
        rgb = listOf(251, 238, 226),
        cmyk = listOf(0, 9, 12, 0)
    )

    object chutaofenhong_183 : ChColor(
        id = "183",
        name = "初桃粉红",
        pinyin = "chutaofenhong",
        color = Color(0xFFf6dcce),
        hex = "#f6dcce",
        rgb = listOf(246, 220, 206),
        cmyk = listOf(0, 19, 19, 0)
    )

    object jieqiaodanfenhong_184 : ChColor(
        id = "184",
        name = "介壳淡粉红",
        pinyin = "jieqiaodanfenhong",
        color = Color(0xFFf7cfba),
        hex = "#f7cfba",
        rgb = listOf(247, 207, 186),
        cmyk = listOf(0, 27, 27, 0)
    )

    object dancanghuahong_185 : ChColor(
        id = "185",
        name = "淡藏花红",
        pinyin = "dancanghuahong",
        color = Color(0xFFf6ad8f),
        hex = "#f6ad8f",
        rgb = listOf(246, 173, 143),
        cmyk = listOf(0, 43, 43, 0)
    )

    object guaranghong_186 : ChColor(
        id = "186",
        name = "瓜瓤红",
        pinyin = "guaranghong",
        color = Color(0xFFf68c60),
        hex = "#f68c60",
        rgb = listOf(246, 140, 96),
        cmyk = listOf(0, 58, 61, 0)
    )

    object furonghong_187 : ChColor(
        id = "187",
        name = "芙蓉红",
        pinyin = "furonghong",
        color = Color(0xFFf9723d),
        hex = "#f9723d",
        rgb = listOf(249, 114, 61),
        cmyk = listOf(0, 67, 74, 0)
    )

    object meijianghong_188 : ChColor(
        id = "188",
        name = "莓酱红",
        pinyin = "meijianghong",
        color = Color(0xFFfa5d19),
        hex = "#fa5d19",
        rgb = listOf(250, 93, 25),
        cmyk = listOf(0, 74, 85, 0)
    )

    object faluohong_189 : ChColor(
        id = "189",
        name = "法螺红",
        pinyin = "faluohong",
        color = Color(0xFFee8055),
        hex = "#ee8055",
        rgb = listOf(238, 128, 85),
        cmyk = listOf(0, 62, 66, 0)
    )

    object luoxiahong_190 : ChColor(
        id = "190",
        name = "落霞红",
        pinyin = "luoxiahong",
        color = Color(0xFFcf4813),
        hex = "#cf4813",
        rgb = listOf(207, 72, 19),
        cmyk = listOf(4, 82, 99, 0)
    )

    object danmeiguihui_191 : ChColor(
        id = "191",
        name = "淡玫瑰灰",
        pinyin = "danmeiguihui",
        color = Color(0xFFb89485),
        hex = "#b89485",
        rgb = listOf(184, 148, 133),
        cmyk = listOf(21, 43, 43, 9)
    )

    object xiemaohong_192 : ChColor(
        id = "192",
        name = "蟹蝥红",
        pinyin = "xiemaohong",
        color = Color(0xFFb14b28),
        hex = "#b14b28",
        rgb = listOf(177, 75, 40),
        cmyk = listOf(18, 80, 92, 7)
    )

    object huoyanzong_193 : ChColor(
        id = "193",
        name = "火岩棕",
        pinyin = "huoyanzong",
        color = Color(0xFF863020),
        hex = "#863020",
        rgb = listOf(134, 48, 32),
        cmyk = listOf(27, 91, 95, 28)
    )

    object zheshi_194 : ChColor(
        id = "194",
        name = "赭石",
        pinyin = "zheshi",
        color = Color(0xFF862617),
        hex = "#862617",
        rgb = listOf(134, 38, 23),
        cmyk = listOf(27, 96, 100, 27)
    )

    object antuozong_195 : ChColor(
        id = "195",
        name = "暗驼棕",
        pinyin = "antuozong",
        color = Color(0xFF592620),
        hex = "#592620",
        rgb = listOf(89, 38, 32),
        cmyk = listOf(36, 90, 82, 56)
    )

    object jiangzong_196 : ChColor(
        id = "196",
        name = "酱棕",
        pinyin = "jiangzong",
        color = Color(0xFF5a1f1b),
        hex = "#5a1f1b",
        rgb = listOf(90, 31, 27),
        cmyk = listOf(35, 96, 88, 55)
    )

    object lizong_197 : ChColor(
        id = "197",
        name = "栗棕",
        pinyin = "lizong",
        color = Color(0xFF5c1e19),
        hex = "#5c1e19",
        rgb = listOf(92, 30, 25),
        cmyk = listOf(34, 98, 91, 53)
    )

    object yangshuixianhong_198 : ChColor(
        id = "198",
        name = "洋水仙红",
        pinyin = "yangshuixianhong",
        color = Color(0xFFf4c7ba),
        hex = "#f4c7ba",
        rgb = listOf(244, 199, 186),
        cmyk = listOf(0, 31, 24, 0)
    )

    object guqiaohong_199 : ChColor(
        id = "199",
        name = "谷鞘红",
        pinyin = "guqiaohong",
        color = Color(0xFFf17666),
        hex = "#f17666",
        rgb = listOf(241, 118, 102),
        cmyk = listOf(0, 67, 55, 0)
    )

    object pingguohong_200 : ChColor(
        id = "200",
        name = "苹果红",
        pinyin = "pingguohong",
        color = Color(0xFFf15642),
        hex = "#f15642",
        rgb = listOf(241, 86, 66),
        cmyk = listOf(0, 77, 69, 0)
    )

    object tieshuihong_201 : ChColor(
        id = "201",
        name = "铁水红",
        pinyin = "tieshuihong",
        color = Color(0xFFf5391c),
        hex = "#f5391c",
        rgb = listOf(245, 57, 28),
        cmyk = listOf(0, 84, 82, 0)
    )

    object guihong_202 : ChColor(
        id = "202",
        name = "桂红",
        pinyin = "guihong",
        color = Color(0xFFf25a47),
        hex = "#f25a47",
        rgb = listOf(242, 90, 71),
        cmyk = listOf(0, 76, 67, 0)
    )

    object jiguanghong_203 : ChColor(
        id = "203",
        name = "极光红",
        pinyin = "jiguanghong",
        color = Color(0xFFf33b1f),
        hex = "#f33b1f",
        rgb = listOf(243, 59, 31),
        cmyk = listOf(0, 84, 82, 0)
    )

    object fenhong_204 : ChColor(
        id = "204",
        name = "粉红",
        pinyin = "fenhong",
        color = Color(0xFFf2b9b2),
        hex = "#f2b9b2",
        rgb = listOf(242, 185, 178),
        cmyk = listOf(0, 38, 25, 0)
    )

    object shehong_205 : ChColor(
        id = "205",
        name = "舌红",
        pinyin = "shehong",
        color = Color(0xFFf19790),
        hex = "#f19790",
        rgb = listOf(241, 151, 144),
        cmyk = listOf(0, 53, 36, 0)
    )

    object quhong_206 : ChColor(
        id = "206",
        name = "曲红",
        pinyin = "quhong",
        color = Color(0xFFf05a46),
        hex = "#f05a46",
        rgb = listOf(240, 90, 70),
        cmyk = listOf(0, 76, 68, 0)
    )

    object honggonghong_207 : ChColor(
        id = "207",
        name = "红汞红",
        pinyin = "honggonghong",
        color = Color(0xFFf23e23),
        hex = "#f23e23",
        rgb = listOf(242, 62, 35),
        cmyk = listOf(0, 83, 81, 0)
    )

    object danfei_208 : ChColor(
        id = "208",
        name = "淡绯",
        pinyin = "danfei",
        color = Color(0xFFf2cac9),
        hex = "#f2cac9",
        rgb = listOf(242, 202, 201),
        cmyk = listOf(0, 29, 16, 0)
    )

    object wuhuaguohong_209 : ChColor(
        id = "209",
        name = "无花果红",
        pinyin = "wuhuaguohong",
        color = Color(0xFFefafad),
        hex = "#efafad",
        rgb = listOf(239, 175, 173),
        cmyk = listOf(0, 43, 24, 0)
    )

    object liuzihong_210 : ChColor(
        id = "210",
        name = "榴子红",
        pinyin = "liuzihong",
        color = Color(0xFFf1908c),
        hex = "#f1908c",
        rgb = listOf(241, 144, 140),
        cmyk = listOf(0, 57, 36, 0)
    )

    object yanzhihong_211 : ChColor(
        id = "211",
        name = "胭脂红",
        pinyin = "yanzhihong",
        color = Color(0xFFf03f24),
        hex = "#f03f24",
        rgb = listOf(240, 63, 36),
        cmyk = listOf(0, 83, 81, 0)
    )

    object hehuanhong_212 : ChColor(
        id = "212",
        name = "合欢红",
        pinyin = "hehuanhong",
        color = Color(0xFFf0a1a8),
        hex = "#f0a1a8",
        rgb = listOf(240, 161, 168),
        cmyk = listOf(0, 50, 23, 0)
    )

    object chunmeihong_213 : ChColor(
        id = "213",
        name = "春梅红",
        pinyin = "chunmeihong",
        color = Color(0xFFf1939c),
        hex = "#f1939c",
        rgb = listOf(241, 147, 156),
        cmyk = listOf(0, 56, 27, 0)
    )

    object xiangyehong_214 : ChColor(
        id = "214",
        name = "香叶红",
        pinyin = "xiangyehong",
        color = Color(0xFFf07c82),
        hex = "#f07c82",
        rgb = listOf(240, 124, 130),
        cmyk = listOf(0, 65, 38, 0)
    )

    object shanhuhong_215 : ChColor(
        id = "215",
        name = "珊瑚红",
        pinyin = "shanhuhong",
        color = Color(0xFFf04a3a),
        hex = "#f04a3a",
        rgb = listOf(240, 74, 58),
        cmyk = listOf(0, 80, 72, 0)
    )

    object luobohong_216 : ChColor(
        id = "216",
        name = "萝卜红",
        pinyin = "luobohong",
        color = Color(0xFFf13c22),
        hex = "#f13c22",
        rgb = listOf(241, 60, 34),
        cmyk = listOf(0, 84, 82, 0)
    )

    object danqianhong_217 : ChColor(
        id = "217",
        name = "淡茜红",
        pinyin = "danqianhong",
        color = Color(0xFFe77c8e),
        hex = "#e77c8e",
        rgb = listOf(231, 124, 142),
        cmyk = listOf(0, 65, 29, 0)
    )

    object yanhong_218 : ChColor(
        id = "218",
        name = "艳红",
        pinyin = "yanhong",
        color = Color(0xFFed5a65),
        hex = "#ed5a65",
        rgb = listOf(237, 90, 101),
        cmyk = listOf(0, 77, 49, 0)
    )

    object danshuhong_219 : ChColor(
        id = "219",
        name = "淡菽红",
        pinyin = "danshuhong",
        color = Color(0xFFed4845),
        hex = "#ed4845",
        rgb = listOf(237, 72, 69),
        cmyk = listOf(0, 81, 66, 0)
    )

    object yusaihong_220 : ChColor(
        id = "220",
        name = "鱼鳃红",
        pinyin = "yusaihong",
        color = Color(0xFFed3b2f),
        hex = "#ed3b2f",
        rgb = listOf(237, 59, 47),
        cmyk = listOf(0, 84, 76, 0)
    )

    object yingtaohong_221 : ChColor(
        id = "221",
        name = "樱桃红",
        pinyin = "yingtaohong",
        color = Color(0xFFed3321),
        hex = "#ed3321",
        rgb = listOf(237, 51, 33),
        cmyk = listOf(0, 86, 82, 0)
    )

    object danruixianghong_222 : ChColor(
        id = "222",
        name = "淡蕊香红",
        pinyin = "danruixianghong",
        color = Color(0xFFee4866),
        hex = "#ee4866",
        rgb = listOf(238, 72, 102),
        cmyk = listOf(0, 82, 44, 0)
    )

    object shizhuhong_223 : ChColor(
        id = "223",
        name = "石竹红",
        pinyin = "shizhuhong",
        color = Color(0xFFee4863),
        hex = "#ee4863",
        rgb = listOf(238, 72, 99),
        cmyk = listOf(0, 82, 46, 0)
    )

    object caomolihong_224 : ChColor(
        id = "224",
        name = "草茉莉红",
        pinyin = "caomolihong",
        color = Color(0xFFef475d),
        hex = "#ef475d",
        rgb = listOf(239, 71, 93),
        cmyk = listOf(0, 82, 50, 0)
    )

    object chahuahong_225 : ChColor(
        id = "225",
        name = "茶花红",
        pinyin = "chahuahong",
        color = Color(0xFFee3f4d),
        hex = "#ee3f4d",
        rgb = listOf(238, 63, 77),
        cmyk = listOf(0, 84, 60, 0)
    )

    object goushuhong_226 : ChColor(
        id = "226",
        name = "枸枢红",
        pinyin = "goushuhong",
        color = Color(0xFFed3333),
        hex = "#ed3333",
        rgb = listOf(237, 51, 51),
        cmyk = listOf(0, 86, 74, 0)
    )

    object qiuhaitanghong_227 : ChColor(
        id = "227",
        name = "秋海棠红",
        pinyin = "qiuhaitanghong",
        color = Color(0xFFec2b24),
        hex = "#ec2b24",
        rgb = listOf(236, 43, 36),
        cmyk = listOf(0, 88, 81, 0)
    )

    object lichunhong_228 : ChColor(
        id = "228",
        name = "丽春红",
        pinyin = "lichunhong",
        color = Color(0xFFeb261a),
        hex = "#eb261a",
        rgb = listOf(235, 38, 26),
        cmyk = listOf(0, 89, 84, 0)
    )

    object xiyanghong_229 : ChColor(
        id = "229",
        name = "夕阳红",
        pinyin = "xiyanghong",
        color = Color(0xFFde2a18),
        hex = "#de2a18",
        rgb = listOf(222, 42, 24),
        cmyk = listOf(0, 90, 90, 0)
    )

    object hedinghong_230 : ChColor(
        id = "230",
        name = "鹤顶红",
        pinyin = "hedinghong",
        color = Color(0xFFd42517),
        hex = "#d42517",
        rgb = listOf(212, 37, 23),
        cmyk = listOf(0, 92, 95, 0)
    )

    object exueshihong_231 : ChColor(
        id = "231",
        name = "鹅血石红",
        pinyin = "exueshihong",
        color = Color(0xFFab372f),
        hex = "#ab372f",
        rgb = listOf(171, 55, 47),
        cmyk = listOf(19, 89, 85, 9)
    )

    object fupenzihong_232 : ChColor(
        id = "232",
        name = "覆盆子红",
        pinyin = "fupenzihong",
        color = Color(0xFFac1f18),
        hex = "#ac1f18",
        rgb = listOf(172, 31, 24),
        cmyk = listOf(17, 98, 100, 8)
    )

    object diaozi_233 : ChColor(
        id = "233",
        name = "貂紫",
        pinyin = "diaozi",
        color = Color(0xFF5d3131),
        hex = "#5d3131",
        rgb = listOf(93, 49, 49),
        cmyk = listOf(36, 81, 64, 54)
    )

    object anyuzi_234 : ChColor(
        id = "234",
        name = "暗玉紫",
        pinyin = "anyuzi",
        color = Color(0xFF5c2223),
        hex = "#5c2223",
        rgb = listOf(92, 34, 35),
        cmyk = listOf(35, 94, 77, 53)
    )

    object lizi_235 : ChColor(
        id = "235",
        name = "栗紫",
        pinyin = "lizi",
        color = Color(0xFF5a191b),
        hex = "#5a191b",
        rgb = listOf(90, 25, 27),
        cmyk = listOf(35, 100, 85, 54)
    )

    object putaojiangzi_236 : ChColor(
        id = "236",
        name = "葡萄酱紫",
        pinyin = "putaojiangzi",
        color = Color(0xFF5a1216),
        hex = "#5a1216",
        rgb = listOf(90, 18, 22),
        cmyk = listOf(35, 100, 80, 54)
    )

    object mudanfenhong_237 : ChColor(
        id = "237",
        name = "牡丹粉红",
        pinyin = "mudanfenhong",
        color = Color(0xFFeea2a4),
        hex = "#eea2a4",
        rgb = listOf(238, 162, 164),
        cmyk = listOf(0, 49, 27, 0)
    )

    object shanchahong_238 : ChColor(
        id = "238",
        name = "山茶红",
        pinyin = "shanchahong",
        color = Color(0xFFed556a),
        hex = "#ed556a",
        rgb = listOf(237, 85, 106),
        cmyk = listOf(0, 78, 44, 0)
    )

    object haitanghong_239 : ChColor(
        id = "239",
        name = "海棠红",
        pinyin = "haitanghong",
        color = Color(0xFFf03752),
        hex = "#f03752",
        rgb = listOf(240, 55, 82),
        cmyk = listOf(0, 86, 55, 0)
    )

    object yuhong_240 : ChColor(
        id = "240",
        name = "玉红",
        pinyin = "yuhong",
        color = Color(0xFFc04851),
        hex = "#c04851",
        rgb = listOf(192, 72, 81),
        cmyk = listOf(13, 83, 62, 3)
    )

    object gaolianghong_241 : ChColor(
        id = "241",
        name = "高粱红",
        pinyin = "gaolianghong",
        color = Color(0xFFc02c38),
        hex = "#c02c38",
        rgb = listOf(192, 44, 56),
        cmyk = listOf(11, 93, 77, 2)
    )

    object manjianghong_242 : ChColor(
        id = "242",
        name = "满江红",
        pinyin = "manjianghong",
        color = Color(0xFFa7535a),
        hex = "#a7535a",
        rgb = listOf(167, 83, 90),
        cmyk = listOf(22, 76, 54, 12)
    )

    object zaohong_243 : ChColor(
        id = "243",
        name = "枣红",
        pinyin = "zaohong",
        color = Color(0xFF7c1823),
        hex = "#7c1823",
        rgb = listOf(124, 24, 35),
        cmyk = listOf(28, 100, 86, 33)
    )

    object putaozi_244 : ChColor(
        id = "244",
        name = "葡萄紫",
        pinyin = "putaozi",
        color = Color(0xFF4c1f24),
        hex = "#4c1f24",
        rgb = listOf(76, 31, 36),
        cmyk = listOf(39, 92, 67, 64)
    )

    object jiangzi_245 : ChColor(
        id = "245",
        name = "酱紫",
        pinyin = "jiangzi",
        color = Color(0xFF4d1018),
        hex = "#4d1018",
        rgb = listOf(77, 16, 24),
        cmyk = listOf(39, 100, 79, 63)
    )

    object danshuhong_246 : ChColor(
        id = "246",
        name = "淡曙红",
        pinyin = "danshuhong",
        color = Color(0xFFee2746),
        hex = "#ee2746",
        rgb = listOf(238, 39, 70),
        cmyk = listOf(0, 89, 62, 0)
    )

    object tangchangpuhong_247 : ChColor(
        id = "247",
        name = "唐菖蒲红",
        pinyin = "tangchangpuhong",
        color = Color(0xFFde1c31),
        hex = "#de1c31",
        rgb = listOf(222, 28, 49),
        cmyk = listOf(0, 93, 76, 0)
    )

    object eguanhong_248 : ChColor(
        id = "248",
        name = "鹅冠红",
        pinyin = "eguanhong",
        color = Color(0xFFd11a2d),
        hex = "#d11a2d",
        rgb = listOf(209, 26, 45),
        cmyk = listOf(1, 95, 82, 0)
    )

    object meihong_249 : ChColor(
        id = "249",
        name = "莓红",
        pinyin = "meihong",
        color = Color(0xFFc45a65),
        hex = "#c45a65",
        rgb = listOf(196, 90, 101),
        cmyk = listOf(13, 76, 50, 2)
    )

    object fengyehong_250 : ChColor(
        id = "250",
        name = "枫叶红",
        pinyin = "fengyehong",
        color = Color(0xFFc21f30),
        hex = "#c21f30",
        rgb = listOf(194, 31, 48),
        cmyk = listOf(10, 96, 82, 2)
    )

    object xiancaihong_251 : ChColor(
        id = "251",
        name = "苋菜红",
        pinyin = "xiancaihong",
        color = Color(0xFFa61b29),
        hex = "#a61b29",
        rgb = listOf(166, 27, 41),
        cmyk = listOf(19, 99, 86, 11)
    )

    object yanhong_252 : ChColor(
        id = "252",
        name = "烟红",
        pinyin = "yanhong",
        color = Color(0xFF894e54),
        hex = "#894e54",
        rgb = listOf(137, 78, 84),
        cmyk = listOf(29, 73, 51, 28)
    )

    object anziyuanhong_253 : ChColor(
        id = "253",
        name = "暗紫苑红",
        pinyin = "anziyuanhong",
        color = Color(0xFF82202b),
        hex = "#82202b",
        rgb = listOf(130, 32, 43),
        cmyk = listOf(27, 98, 79, 30)
    )

    object yanhong_254 : ChColor(
        id = "254",
        name = "殷红",
        pinyin = "yanhong",
        color = Color(0xFF82111f),
        hex = "#82111f",
        rgb = listOf(130, 17, 31),
        cmyk = listOf(27, 100, 90, 29)
    )

    object zhuganzi_255 : ChColor(
        id = "255",
        name = "猪肝紫",
        pinyin = "zhuganzi",
        color = Color(0xFF541e24),
        hex = "#541e24",
        rgb = listOf(84, 30, 36),
        cmyk = listOf(36, 95, 71, 59)
    )

    object jinyuzi_256 : ChColor(
        id = "256",
        name = "金鱼紫",
        pinyin = "jinyuzi",
        color = Color(0xFF500a16),
        hex = "#500a16",
        rgb = listOf(80, 10, 22),
        cmyk = listOf(38, 100, 81, 61)
    )

    object caozhuhong_257 : ChColor(
        id = "257",
        name = "草珠红",
        pinyin = "caozhuhong",
        color = Color(0xFFf8ebe6),
        hex = "#f8ebe6",
        rgb = listOf(248, 235, 230),
        cmyk = listOf(1, 11, 9, 0)
    )

    object danjianghong_258 : ChColor(
        id = "258",
        name = "淡绛红",
        pinyin = "danjianghong",
        color = Color(0xFFec7696),
        hex = "#ec7696",
        rgb = listOf(236, 118, 150),
        cmyk = listOf(0, 68, 21, 0)
    )

    object pinhong_259 : ChColor(
        id = "259",
        name = "品红",
        pinyin = "pinhong",
        color = Color(0xFFef3473),
        hex = "#ef3473",
        rgb = listOf(239, 52, 115),
        cmyk = listOf(0, 86, 30, 0)
    )

    object fengxianhuahong_260 : ChColor(
        id = "260",
        name = "凤仙花红",
        pinyin = "fengxianhuahong",
        color = Color(0xFFea7293),
        hex = "#ea7293",
        rgb = listOf(234, 114, 147),
        cmyk = listOf(0, 69, 22, 0)
    )

    object fentuanhuahong_261 : ChColor(
        id = "261",
        name = "粉团花红",
        pinyin = "fentuanhuahong",
        color = Color(0xFFec9bad),
        hex = "#ec9bad",
        rgb = listOf(236, 155, 173),
        cmyk = listOf(0, 52, 18, 0)
    )

    object jiazhutaohong_262 : ChColor(
        id = "262",
        name = "夹竹桃红",
        pinyin = "jiazhutaohong",
        color = Color(0xFFeb507e),
        hex = "#eb507e",
        rgb = listOf(235, 80, 126),
        cmyk = listOf(0, 80, 28, 0)
    )

    object wenpohong_263 : ChColor(
        id = "263",
        name = "榲桲红",
        pinyin = "wenpohong",
        color = Color(0xFFed2f6a),
        hex = "#ed2f6a",
        rgb = listOf(237, 47, 106),
        cmyk = listOf(0, 88, 36, 0)
    )

    object jianghong_264 : ChColor(
        id = "264",
        name = "姜红",
        pinyin = "jianghong",
        color = Color(0xFFeeb8c3),
        hex = "#eeb8c3",
        rgb = listOf(238, 184, 195),
        cmyk = listOf(0, 39, 14, 0)
    )

    object lianbanhong_265 : ChColor(
        id = "265",
        name = "莲瓣红",
        pinyin = "lianbanhong",
        color = Color(0xFFea517f),
        hex = "#ea517f",
        rgb = listOf(234, 81, 127),
        cmyk = listOf(0, 80, 27, 0)
    )

    object shuihong_266 : ChColor(
        id = "266",
        name = "水红",
        pinyin = "shuihong",
        color = Color(0xFFf1c4cd),
        hex = "#f1c4cd",
        rgb = listOf(241, 196, 205),
        cmyk = listOf(0, 33, 11, 0)
    )

    object baochunhong_267 : ChColor(
        id = "267",
        name = "报春红",
        pinyin = "baochunhong",
        color = Color(0xFFec8aa4),
        hex = "#ec8aa4",
        rgb = listOf(236, 138, 164),
        cmyk = listOf(0, 60, 18, 0)
    )

    object yuejihong_268 : ChColor(
        id = "268",
        name = "月季红",
        pinyin = "yuejihong",
        color = Color(0xFFce5777),
        hex = "#ce5777",
        rgb = listOf(206, 87, 109),
        cmyk = listOf(8, 78, 35, 1)
    )

    object jiangdouhong_269 : ChColor(
        id = "269",
        name = "豇豆红",
        pinyin = "jiangdouhong",
        color = Color(0xFFed9db2),
        hex = "#ed9db2",
        rgb = listOf(237, 157, 178),
        cmyk = listOf(0, 52, 15, 0)
    )

    object xiaguanghong_270 : ChColor(
        id = "270",
        name = "霞光红",
        pinyin = "xiaguanghong",
        color = Color(0xFFef82a0),
        hex = "#ef82a0",
        rgb = listOf(239, 130, 160),
        cmyk = listOf(0, 63, 18, 0)
    )

    object songyemudanhong_271 : ChColor(
        id = "271",
        name = "松叶牡丹红",
        pinyin = "songyemudanhong",
        color = Color(0xFFeb3c70),
        hex = "#eb3c70",
        rgb = listOf(235, 60, 112),
        cmyk = listOf(0, 85, 33, 0)
    )

    object xidanhong_272 : ChColor(
        id = "272",
        name = "喜蛋红",
        pinyin = "xidanhong",
        color = Color(0xFFec2c64),
        hex = "#ec2c64",
        rgb = listOf(236, 44, 100),
        cmyk = listOf(0, 88, 40, 0)
    )

    object shubihong_273 : ChColor(
        id = "273",
        name = "鼠鼻红",
        pinyin = "shubihong",
        color = Color(0xFFe3b4b8),
        hex = "#e3b4b8",
        rgb = listOf(227, 180, 184),
        cmyk = listOf(5, 38, 20, 0)
    )

    object jianjingyuhong_274 : ChColor(
        id = "274",
        name = "尖晶玉红",
        pinyin = "jianjingyuhong",
        color = Color(0xFFcc163a),
        hex = "#cc163a",
        rgb = listOf(204, 22, 58),
        cmyk = listOf(5, 96, 73, 1)
    )

    object shanlidouhong_275 : ChColor(
        id = "275",
        name = "山黎豆红",
        pinyin = "shanlidouhong",
        color = Color(0xFFc27c88),
        hex = "#c27c88",
        rgb = listOf(194, 124, 136),
        cmyk = listOf(16, 61, 34, 4)
    )

    object jinkuihong_276 : ChColor(
        id = "276",
        name = "锦葵红",
        pinyin = "jinkuihong",
        color = Color(0xFFbf3553),
        hex = "#bf3553",
        rgb = listOf(191, 53, 83),
        cmyk = listOf(13, 90, 56, 3)
    )

    object shubeihui_277 : ChColor(
        id = "277",
        name = "鼠背灰",
        pinyin = "shubeihui",
        color = Color(0xFF73575c),
        hex = "#73575c",
        rgb = listOf(115, 87, 92),
        cmyk = listOf(41, 64, 44, 36)
    )

    object ganzhezi_278 : ChColor(
        id = "278",
        name = "甘蔗紫",
        pinyin = "ganzhezi",
        color = Color(0xFF621624),
        hex = "#621624",
        rgb = listOf(98, 22, 36),
        cmyk = listOf(33, 100, 75, 49)
    )

    object shizhuzi_279 : ChColor(
        id = "279",
        name = "石竹紫",
        pinyin = "shizhuzi",
        color = Color(0xFF63071c),
        hex = "#63071c",
        rgb = listOf(99, 7, 28),
        cmyk = listOf(32, 100, 84, 49)
    )

    object cangyinghui_280 : ChColor(
        id = "280",
        name = "苍蝇灰",
        pinyin = "cangyinghui",
        color = Color(0xFF36282b),
        hex = "#36282b",
        rgb = listOf(54, 40, 43),
        cmyk = listOf(57, 72, 54, 74)
    )

    object luanshizi_281 : ChColor(
        id = "281",
        name = "卵石紫",
        pinyin = "luanshizi",
        color = Color(0xFF30161c),
        hex = "#30161c",
        rgb = listOf(48, 22, 28),
        cmyk = listOf(52, 88, 58, 81)
    )

    object lizi_282 : ChColor(
        id = "282",
        name = "李紫",
        pinyin = "lizi",
        color = Color(0xFF2b1216),
        hex = "#2b1216",
        rgb = listOf(43, 18, 22),
        cmyk = listOf(56, 88, 62, 84)
    )

    object qiepizi_283 : ChColor(
        id = "283",
        name = "茄皮紫",
        pinyin = "qiepizi",
        color = Color(0xFF2d0c13),
        hex = "#2d0c13",
        rgb = listOf(45, 12, 19),
        cmyk = listOf(58, 90, 63, 83)
    )

    object diaozhonghuahong_284 : ChColor(
        id = "284",
        name = "吊钟花红",
        pinyin = "diaozhonghuahong",
        color = Color(0xFFce5e8a),
        hex = "#ce5e8a",
        rgb = listOf(206, 94, 138),
        cmyk = listOf(0, 76, 16, 0)
    )

    object tuyanhong_285 : ChColor(
        id = "285",
        name = "兔眼红",
        pinyin = "tuyanhong",
        color = Color(0xFFec4e8a),
        hex = "#ec4e8a",
        rgb = listOf(236, 78, 138),
        cmyk = listOf(0, 81, 18, 0)
    )

    object zijinghong_286 : ChColor(
        id = "286",
        name = "紫荆红",
        pinyin = "zijinghong",
        color = Color(0xFFee2c79),
        hex = "#ee2c79",
        rgb = listOf(238, 44, 121),
        cmyk = listOf(0, 87, 24, 0)
    )

    object caitouzi_287 : ChColor(
        id = "287",
        name = "菜头紫",
        pinyin = "caitouzi",
        color = Color(0xFF951c48),
        hex = "#951c48",
        rgb = listOf(149, 28, 72),
        cmyk = listOf(24, 99, 52, 19)
    )

    object yaoguanzi_288 : ChColor(
        id = "288",
        name = "鹞冠紫",
        pinyin = "yaoguanzi",
        color = Color(0xFF621d34),
        hex = "#621d34",
        rgb = listOf(98, 29, 52),
        cmyk = listOf(34, 97, 54, 50)
    )

    object putaojiuhong_289 : ChColor(
        id = "289",
        name = "葡萄酒红",
        pinyin = "putaojiuhong",
        color = Color(0xFF62102e),
        hex = "#62102e",
        rgb = listOf(98, 16, 46),
        cmyk = listOf(33, 100, 58, 60)
    )

    object moshizi_290 : ChColor(
        id = "290",
        name = "磨石紫",
        pinyin = "moshizi",
        color = Color(0xFF382129),
        hex = "#382129",
        rgb = listOf(56, 33, 41),
        cmyk = listOf(53, 81, 50, 74)
    )

    object tanzi_291 : ChColor(
        id = "291",
        name = "檀紫",
        pinyin = "tanzi",
        color = Color(0xFF381924),
        hex = "#381924",
        rgb = listOf(56, 25, 36),
        cmyk = listOf(48, 90, 50, 76)
    )

    object huoezi_292 : ChColor(
        id = "292",
        name = "火鹅紫",
        pinyin = "huoezi",
        color = Color(0xFF33141e),
        hex = "#33141e",
        rgb = listOf(51, 20, 30),
        cmyk = listOf(50, 91, 54, 79)
    )

    object mozi_293 : ChColor(
        id = "293",
        name = "墨紫",
        pinyin = "mozi",
        color = Color(0xFF310f1b),
        hex = "#310f1b",
        rgb = listOf(49, 15, 27),
        cmyk = listOf(53, 92, 55, 81)
    )

    object jinghong_294 : ChColor(
        id = "294",
        name = "晶红",
        pinyin = "jinghong",
        color = Color(0xFFeea6b7),
        hex = "#eea6b7",
        rgb = listOf(238, 166, 183),
        cmyk = listOf(0, 48, 15, 0)
    )

    object biandouhuahong_295 : ChColor(
        id = "295",
        name = "扁豆花红",
        pinyin = "biandouhuahong",
        color = Color(0xFFef498b),
        hex = "#ef498b",
        rgb = listOf(239, 73, 139),
        cmyk = listOf(0, 82, 16, 0)
    )

    object baijihong_296 : ChColor(
        id = "296",
        name = "白芨红",
        pinyin = "baijihong",
        color = Color(0xFFde7897),
        hex = "#de7897",
        rgb = listOf(222, 120, 151),
        cmyk = listOf(2, 66, 22, 0)
    )

    object nenlinghong_297 : ChColor(
        id = "297",
        name = "嫩菱红",
        pinyin = "nenlinghong",
        color = Color(0xFFde3f7c),
        hex = "#de3f7c",
        rgb = listOf(222, 63, 124),
        cmyk = listOf(0, 85, 24, 0)
    )

    object bogenhong_298 : ChColor(
        id = "298",
        name = "菠根红",
        pinyin = "bogenhong",
        color = Color(0xFFd13c74),
        hex = "#d13c74",
        rgb = listOf(209, 60, 116),
        cmyk = listOf(5, 87, 30, 1)
    )

    object cujiangcaohong_299 : ChColor(
        id = "299",
        name = "酢酱草红",
        pinyin = "cujiangcaohong",
        color = Color(0xFFc5708b),
        hex = "#c5708b",
        rgb = listOf(197, 112, 139),
        cmyk = listOf(15, 68, 28, 2)
    )

    object yangcongzi_300 : ChColor(
        id = "300",
        name = "洋葱紫",
        pinyin = "yangcongzi",
        color = Color(0xFFa8456b),
        hex = "#a8456b",
        rgb = listOf(168, 69, 107),
        cmyk = listOf(22, 83, 34, 11)
    )

    object haixiangzi_301 : ChColor(
        id = "301",
        name = "海象紫",
        pinyin = "haixiangzi",
        color = Color(0xFF4b1e2f),
        hex = "#4b1e2f",
        rgb = listOf(75, 30, 47),
        cmyk = listOf(40, 92, 47, 64)
    )

    object ganzi_302 : ChColor(
        id = "302",
        name = "绀紫",
        pinyin = "ganzi",
        color = Color(0xFF461629),
        hex = "#461629",
        rgb = listOf(70, 22, 41),
        cmyk = listOf(41, 97, 49, 68)
    )

    object gutongzi_303 : ChColor(
        id = "303",
        name = "古铜紫",
        pinyin = "gutongzi",
        color = Color(0xFF440e25),
        hex = "#440e25",
        rgb = listOf(68, 14, 37),
        cmyk = listOf(42, 99, 51, 69)
    )

    object shiruihong_304 : ChColor(
        id = "304",
        name = "石蕊红",
        pinyin = "shiruihong",
        color = Color(0xFFf0c9cf),
        hex = "#f0c9cf",
        rgb = listOf(240, 201, 207),
        cmyk = listOf(0, 30, 12, 0)
    )

    object shaoyaogenghong_305 : ChColor(
        id = "305",
        name = "芍药耕红",
        pinyin = "shaoyaogenghong",
        color = Color(0xFFeba0b3),
        hex = "#eba0b3",
        rgb = listOf(235, 160, 179),
        cmyk = listOf(0, 50, 16, 0)
    )

    object canghuahong_306 : ChColor(
        id = "306",
        name = "藏花红",
        pinyin = "canghuahong",
        color = Color(0xFFec2d7a),
        hex = "#ec2d7a",
        rgb = listOf(236, 45, 122),
        cmyk = listOf(0, 88, 23, 0)
    )

    object chuhehong_307 : ChColor(
        id = "307",
        name = "初荷红",
        pinyin = "chuhehong",
        color = Color(0xFFe16c96),
        hex = "#e16c96",
        rgb = listOf(225, 108, 150),
        cmyk = listOf(0, 71, 18, 0)
    )

    object mabiancaozi_308 : ChColor(
        id = "308",
        name = "马鞭草紫",
        pinyin = "mabiancaozi",
        color = Color(0xFFede3e7),
        hex = "#ede3e7",
        rgb = listOf(237, 227, 231),
        cmyk = listOf(6, 13, 7, 0)
    )

    object dingxiangdanzi_309 : ChColor(
        id = "309",
        name = "丁香淡紫",
        pinyin = "dingxiangdanzi",
        color = Color(0xFFe9d7df),
        hex = "#e9d7df",
        rgb = listOf(233, 215, 223),
        cmyk = listOf(7, 20, 8, 0)
    )

    object danzihong_310 : ChColor(
        id = "310",
        name = "丹紫红",
        pinyin = "danzihong",
        color = Color(0xFFd2568c),
        hex = "#d2568c",
        rgb = listOf(210, 86, 140),
        cmyk = listOf(7, 79, 18, 0)
    )

    object meiguihong_311 : ChColor(
        id = "311",
        name = "玫瑰红",
        pinyin = "meiguihong",
        color = Color(0xFFd2357d),
        hex = "#d2357d",
        rgb = listOf(210, 53, 125),
        cmyk = listOf(4, 89, 21, 0)
    )

    object danqianniuzi_312 : ChColor(
        id = "312",
        name = "淡牵牛紫",
        pinyin = "danqianniuzi",
        color = Color(0xFFd1c2d3),
        hex = "#d1c2d3",
        rgb = listOf(209, 194, 211),
        cmyk = listOf(19, 27, 9, 0)
    )

    object fengxinzi_313 : ChColor(
        id = "313",
        name = "凤信紫",
        pinyin = "fengxinzi",
        color = Color(0xFFc8adc4),
        hex = "#c8adc4",
        rgb = listOf(200, 173, 196),
        cmyk = listOf(21, 37, 12, 0)
    )

    object luolanzi_314 : ChColor(
        id = "314",
        name = "萝兰紫",
        pinyin = "luolanzi",
        color = Color(0xFFc08eaf),
        hex = "#c08eaf",
        rgb = listOf(192, 142, 175),
        cmyk = listOf(23, 53, 14, 1)
    )

    object meiguizi_315 : ChColor(
        id = "315",
        name = "玫瑰紫",
        pinyin = "meiguizi",
        color = Color(0xFFba2f7b),
        hex = "#ba2f7b",
        rgb = listOf(186, 47, 123),
        cmyk = listOf(18, 91, 18, 2)
    )

    object tengluozi_316 : ChColor(
        id = "316",
        name = "藤萝紫",
        pinyin = "tengluozi",
        color = Color(0xFF8076a3),
        hex = "#8076a3",
        rgb = listOf(128, 118, 163),
        cmyk = listOf(58, 56, 17, 2)
    )

    object jinzi_317 : ChColor(
        id = "317",
        name = "槿紫",
        pinyin = "jinzi",
        color = Color(0xFF806d9e),
        hex = "#806d9e",
        rgb = listOf(128, 109, 158),
        cmyk = listOf(57, 62, 16, 2)
    )

    object xunzi_318 : ChColor(
        id = "318",
        name = "蕈紫",
        pinyin = "xunzi",
        color = Color(0xFF815c94),
        hex = "#815c94",
        rgb = listOf(129, 92, 148),
        cmyk = listOf(56, 72, 15, 1)
    )

    object jiegengzi_319 : ChColor(
        id = "319",
        name = "桔梗紫",
        pinyin = "jiegengzi",
        color = Color(0xFF813c85),
        hex = "#813c85",
        rgb = listOf(129, 60, 133),
        cmyk = listOf(54, 89, 12, 1)
    )

    object weizi_320 : ChColor(
        id = "320",
        name = "魏紫",
        pinyin = "weizi",
        color = Color(0xFF7e1671),
        hex = "#7e1671",
        rgb = listOf(126, 22, 113),
        cmyk = listOf(52, 100, 17, 7)
    )

    object zhilanzi_321 : ChColor(
        id = "321",
        name = "芝兰紫",
        pinyin = "zhilanzi",
        color = Color(0xFFe9ccd3),
        hex = "#e9ccd3",
        rgb = listOf(233, 204, 211),
        cmyk = listOf(3, 26, 10, 0)
    )

    object lingmenghong_322 : ChColor(
        id = "322",
        name = "菱锰红",
        pinyin = "lingmenghong",
        color = Color(0xFFd276a3),
        hex = "#d276a3",
        rgb = listOf(210, 118, 163),
        cmyk = listOf(10, 67, 12, 0)
    )

    object longxuhong_323 : ChColor(
        id = "323",
        name = "龙须红",
        pinyin = "longxuhong",
        color = Color(0xFFcc5595),
        hex = "#cc5595",
        rgb = listOf(204, 85, 149),
        cmyk = listOf(11, 97, 10, 0)
    )

    object jifenhong_324 : ChColor(
        id = "324",
        name = "蓟粉红",
        pinyin = "jifenhong",
        color = Color(0xFFe6d2d5),
        hex = "#e6d2d5",
        rgb = listOf(230, 210, 213),
        cmyk = listOf(8, 22, 12, 0)
    )

    object dianqishihong_325 : ChColor(
        id = "325",
        name = "电气石红",
        pinyin = "dianqishihong",
        color = Color(0xFFc35691),
        hex = "#c35691",
        rgb = listOf(195, 86, 145),
        cmyk = listOf(16, 79, 14, 1)
    )

    object yingcaozi_326 : ChColor(
        id = "326",
        name = "樱草紫",
        pinyin = "yingcaozi",
        color = Color(0xFFc06f98),
        hex = "#c06f98",
        rgb = listOf(192, 111, 152),
        cmyk = listOf(19, 68, 18, 1)
    )

    object lusuihui_327 : ChColor(
        id = "327",
        name = "芦穗灰",
        pinyin = "lusuihui",
        color = Color(0xFFbdaead),
        hex = "#bdaead",
        rgb = listOf(189, 174, 173),
        cmyk = listOf(25, 31, 26, 5)
    )

    object yinhonghui_328 : ChColor(
        id = "328",
        name = "隐红灰",
        pinyin = "yinhonghui",
        color = Color(0xFFb598a1),
        hex = "#b598a1",
        rgb = listOf(181, 152, 161),
        cmyk = listOf(26, 43, 26, 6)
    )

    object xiancaizi_329 : ChColor(
        id = "329",
        name = "苋菜紫",
        pinyin = "xiancaizi",
        color = Color(0xFF9b1e64),
        hex = "#9b1e64",
        rgb = listOf(155, 30, 100),
        cmyk = listOf(27, 97, 27, 14)
    )

    object luhui_330 : ChColor(
        id = "330",
        name = "芦灰",
        pinyin = "luhui",
        color = Color(0xFF856d72),
        hex = "#856d72",
        rgb = listOf(133, 109, 114),
        cmyk = listOf(39, 53, 38, 25)
    )

    object muyunhui_331 : ChColor(
        id = "331",
        name = "暮云灰",
        pinyin = "muyunhui",
        color = Color(0xFF4f383e),
        hex = "#4f383e",
        rgb = listOf(79, 56, 62),
        cmyk = listOf(49, 71, 49, 58)
    )

    object banjiuhui_332 : ChColor(
        id = "332",
        name = "斑鸠灰",
        pinyin = "banjiuhui",
        color = Color(0xFF482936),
        hex = "#482936",
        rgb = listOf(72, 41, 54),
        cmyk = listOf(49, 82, 46, 63)
    )

    object dantengluozi_333 : ChColor(
        id = "333",
        name = "淡藤萝紫",
        pinyin = "dantengluozi",
        color = Color(0xFFf2e7e5),
        hex = "#f2e7e5",
        rgb = listOf(242, 231, 229),
        cmyk = listOf(4, 11, 9, 0)
    )

    object danqingzi_334 : ChColor(
        id = "334",
        name = "淡青紫",
        pinyin = "danqingzi",
        color = Color(0xFFe0c8d1),
        hex = "#e0c8d1",
        rgb = listOf(224, 200, 209),
        cmyk = listOf(10, 27, 11, 0)
    )

    object qinghakezi_335 : ChColor(
        id = "335",
        name = "青蛤壳紫",
        pinyin = "qinghakezi",
        color = Color(0xFFbc84a8),
        hex = "#bc84a8",
        rgb = listOf(188, 132, 168),
        cmyk = listOf(24, 58, 15, 1)
    )

    object doukouzi_336 : ChColor(
        id = "336",
        name = "豆蔻紫",
        pinyin = "doukouzi",
        color = Color(0xFFad6598),
        hex = "#ad6598",
        rgb = listOf(173, 101, 152),
        cmyk = listOf(31, 71, 15, 1)
    )

    object biandouzi_337 : ChColor(
        id = "337",
        name = "扁豆紫",
        pinyin = "biandouzi",
        color = Color(0xFFa35c8f),
        hex = "#a35c8f",
        rgb = listOf(163, 92, 143),
        cmyk = listOf(35, 75, 18, 2)
    )

    object jiehuazi_338 : ChColor(
        id = "338",
        name = "芥花紫",
        pinyin = "jiehuazi",
        color = Color(0xFF983680),
        hex = "#983680",
        rgb = listOf(152, 54, 128),
        cmyk = listOf(39, 91, 15, 3)
    )

    object qinglian_339 : ChColor(
        id = "339",
        name = "青莲",
        pinyin = "qinglian",
        color = Color(0xFF8b2671),
        hex = "#8b2671",
        rgb = listOf(139, 38, 113),
        cmyk = listOf(43, 97, 19, 8)
    )

    object zizi_340 : ChColor(
        id = "340",
        name = "芓紫",
        pinyin = "zizi",
        color = Color(0xFF894276),
        hex = "#894276",
        rgb = listOf(137, 66, 118),
        cmyk = listOf(44, 85, 24, 10)
    )

    object gejinzi_341 : ChColor(
        id = "341",
        name = "葛巾紫",
        pinyin = "gejinzi",
        color = Color(0xFF7e2065),
        hex = "#7e2065",
        rgb = listOf(126, 32, 101),
        cmyk = listOf(45, 99, 24, 16)
    )

    object qianniuzi_342 : ChColor(
        id = "342",
        name = "牵牛紫",
        pinyin = "qianniuzi",
        color = Color(0xFF681752),
        hex = "#681752",
        rgb = listOf(104, 23, 82),
        cmyk = listOf(49, 100, 29, 32)
    )

    object zihui_343 : ChColor(
        id = "343",
        name = "紫灰",
        pinyin = "zihui",
        color = Color(0xFF5d3f51),
        hex = "#5d3f51",
        rgb = listOf(93, 63, 81),
        cmyk = listOf(53, 75, 41, 41)
    )

    object longjingyuzi_344 : ChColor(
        id = "344",
        name = "龙睛鱼紫",
        pinyin = "longjingyuzi",
        color = Color(0xFF4e2a40),
        hex = "#4e2a40",
        rgb = listOf(78, 42, 64),
        cmyk = listOf(55, 87, 41, 52)
    )

    object biqizi_345 : ChColor(
        id = "345",
        name = "荸荠紫",
        pinyin = "biqizi",
        color = Color(0xFF411c35),
        hex = "#411c35",
        rgb = listOf(65, 28, 53),
        cmyk = listOf(58, 96, 40, 61)
    )

    object gudinghui_346 : ChColor(
        id = "346",
        name = "古鼎灰",
        pinyin = "gudinghui",
        color = Color(0xFF36292f),
        hex = "#36292f",
        rgb = listOf(54, 41, 47),
        cmyk = listOf(63, 74, 52, 70)
    )

    object wumeizi_347 : ChColor(
        id = "347",
        name = "乌梅紫",
        pinyin = "wumeizi",
        color = Color(0xFF1e131d),
        hex = "#1e131d",
        rgb = listOf(30, 19, 29),
        cmyk = listOf(81, 87, 54, 84)
    )

    object shenqianniuzi_348 : ChColor(
        id = "348",
        name = "深牵牛紫",
        pinyin = "shenqianniuzi",
        color = Color(0xFF1c0d1a),
        hex = "#1c0d1a",
        rgb = listOf(28, 13, 26),
        cmyk = listOf(83, 87, 55, 86)
    )

    object yinbai_349 : ChColor(
        id = "349",
        name = "银白",
        pinyin = "yinbai",
        color = Color(0xFFf1f0ed),
        hex = "#f1f0ed",
        rgb = listOf(241, 240, 237),
        cmyk = listOf(7, 5, 7, 0)
    )

    object qianshibai_350 : ChColor(
        id = "350",
        name = "芡食白",
        pinyin = "qianshibai",
        color = Color(0xFFe2e1e4),
        hex = "#e2e1e4",
        rgb = listOf(226, 225, 228),
        cmyk = listOf(13, 10, 9, 0)
    )

    object yuanshanzi_351 : ChColor(
        id = "351",
        name = "远山紫",
        pinyin = "yuanshanzi",
        color = Color(0xFFccccd6),
        hex = "#ccccd6",
        rgb = listOf(204, 204, 214),
        cmyk = listOf(23, 18, 12, 1)
    )

    object danlanzi_352 : ChColor(
        id = "352",
        name = "淡蓝紫",
        pinyin = "danlanzi",
        color = Color(0xFFa7a8bd),
        hex = "#a7a8bd",
        rgb = listOf(167, 168, 189),
        cmyk = listOf(39, 31, 17, 2)
    )

    object shangengzi_353 : ChColor(
        id = "353",
        name = "山梗紫",
        pinyin = "shangengzi",
        color = Color(0xFF61649f),
        hex = "#61649f",
        rgb = listOf(97, 100, 159),
        cmyk = listOf(74, 64, 14, 1)
    )

    object luodianzi_354 : ChColor(
        id = "354",
        name = "螺甸紫",
        pinyin = "luodianzi",
        color = Color(0xFF74759b),
        hex = "#74759b",
        rgb = listOf(116, 117, 155),
        cmyk = listOf(63, 53, 22, 5)
    )

    object manaohui_355 : ChColor(
        id = "355",
        name = "玛瑙灰",
        pinyin = "manaohui",
        color = Color(0xFFcfccc9),
        hex = "#cfccc9",
        rgb = listOf(207, 204, 201),
        cmyk = listOf(21, 17, 19, 1)
    )

    object yejuzi_356 : ChColor(
        id = "356",
        name = "野菊紫",
        pinyin = "yejuzi",
        color = Color(0xFF525288),
        hex = "#525288",
        rgb = listOf(82, 82, 136),
        cmyk = listOf(80, 73, 21, 6)
    )

    object mantianxingzi_357 : ChColor(
        id = "357",
        name = "满天星紫",
        pinyin = "mantianxingzi",
        color = Color(0xFF2e317c),
        hex = "#2e317c",
        rgb = listOf(46, 49, 124),
        cmyk = listOf(100, 93, 21, 5)
    )

    object xinhui_358 : ChColor(
        id = "358",
        name = "锌灰",
        pinyin = "xinhui",
        color = Color(0xFF7a7374),
        hex = "#7a7374",
        rgb = listOf(122, 115, 116),
        cmyk = listOf(48, 45, 40, 26)
    )

    object yeputaozi_359 : ChColor(
        id = "359",
        name = "野葡萄紫",
        pinyin = "yeputaozi",
        color = Color(0xFF302f4b),
        hex = "#302f4b",
        rgb = listOf(48, 47, 75),
        cmyk = listOf(91, 84, 40, 43)
    )

    object jianfengzi_360 : ChColor(
        id = "360",
        name = "剑锋紫",
        pinyin = "jianfengzi",
        color = Color(0xFF3e3841),
        hex = "#3e3841",
        rgb = listOf(62, 56, 65),
        cmyk = listOf(70, 69, 49, 56)
    )

    object longkuizi_361 : ChColor(
        id = "361",
        name = "龙葵紫",
        pinyin = "longkuizi",
        color = Color(0xFF322f3b),
        hex = "#322f3b",
        rgb = listOf(50, 47, 59),
        cmyk = listOf(79, 74, 49, 60)
    )

    object anlongdanzi_362 : ChColor(
        id = "362",
        name = "暗龙胆紫",
        pinyin = "anlongdanzi",
        color = Color(0xFF22202e),
        hex = "#22202e",
        rgb = listOf(34, 32, 46),
        cmyk = listOf(90, 84, 50, 69)
    )

    object jingshizi_363 : ChColor(
        id = "363",
        name = "晶石紫",
        pinyin = "jingshizi",
        color = Color(0xFF1f2040),
        hex = "#1f2040",
        rgb = listOf(31, 32, 64),
        cmyk = listOf(98, 93, 48, 73)
    )

    object anlanzi_364 : ChColor(
        id = "364",
        name = "暗蓝紫",
        pinyin = "anlanzi",
        color = Color(0xFF131124),
        hex = "#131124",
        rgb = listOf(19, 17, 36),
        cmyk = listOf(100, 94, 52, 77)
    )

    object jingtailan_365 : ChColor(
        id = "365",
        name = "景泰蓝",
        pinyin = "jingtailan",
        color = Color(0xFF2775b6),
        hex = "#2775b6",
        rgb = listOf(39, 117, 182),
        cmyk = listOf(95, 46, 10, 1)
    )

    object niluolan_366 : ChColor(
        id = "366",
        name = "尼罗蓝",
        pinyin = "niluolan",
        color = Color(0xFF2474b5),
        hex = "#2474b5",
        rgb = listOf(36, 116, 181),
        cmyk = listOf(96, 47, 11, 1)
    )

    object yuantianlan_367 : ChColor(
        id = "367",
        name = "远天蓝",
        pinyin = "yuantianlan",
        color = Color(0xFFd0dfe6),
        hex = "#d0dfe6",
        rgb = listOf(208, 223, 230),
        cmyk = listOf(25, 6, 10, 0)
    )

    object xinglan_368 : ChColor(
        id = "368",
        name = "星蓝",
        pinyin = "xinglan",
        color = Color(0xFF93b5cf),
        hex = "#93b5cf",
        rgb = listOf(147, 181, 207),
        cmyk = listOf(53, 19, 15, 1)
    )

    object yushandoulan_369 : ChColor(
        id = "369",
        name = "羽扇豆蓝",
        pinyin = "yushandoulan",
        color = Color(0xFF619ac3),
        hex = "#619ac3",
        rgb = listOf(97, 154, 195),
        cmyk = listOf(74, 27, 16, 2)
    )

    object huaqing_370 : ChColor(
        id = "370",
        name = "花青",
        pinyin = "huaqing",
        color = Color(0xFF2376b7),
        hex = "#2376b7",
        rgb = listOf(35, 118, 183),
        cmyk = listOf(95, 45, 10, 1)
    )

    object jinglan_371 : ChColor(
        id = "371",
        name = "睛蓝",
        pinyin = "jinglan",
        color = Color(0xFF5698c3),
        hex = "#5698c3",
        rgb = listOf(86, 152, 195),
        cmyk = listOf(78, 27, 17, 2)
    )

    object honglan_372 : ChColor(
        id = "372",
        name = "虹蓝",
        pinyin = "honglan",
        color = Color(0xFF2177b8),
        hex = "#2177b8",
        rgb = listOf(33, 119, 184),
        cmyk = listOf(99, 44, 10, 1)
    )

    object hushuilan_373 : ChColor(
        id = "373",
        name = "湖水蓝",
        pinyin = "hushuilan",
        color = Color(0xFFb0d5df),
        hex = "#b0d5df",
        rgb = listOf(176, 213, 223),
        cmyk = listOf(43, 4, 16, 0)
    )

    object qiubolan_374 : ChColor(
        id = "374",
        name = "秋波蓝",
        pinyin = "qiubolan",
        color = Color(0xFF8abcd1),
        hex = "#8abcd1",
        rgb = listOf(138, 188, 209),
        cmyk = listOf(59, 12, 19, 0)
    )

    object jianshilan_375 : ChColor(
        id = "375",
        name = "涧石蓝",
        pinyin = "jianshilan",
        color = Color(0xFF66a9c9),
        hex = "#66a9c9",
        rgb = listOf(102, 169, 201),
        cmyk = listOf(73, 17, 20, 1)
    )

    object chaolan_376 : ChColor(
        id = "376",
        name = "潮蓝",
        pinyin = "chaolan",
        color = Color(0xFF2983bb),
        hex = "#2983bb",
        rgb = listOf(41, 131, 187),
        cmyk = listOf(93, 36, 15, 2)
    )

    object qunqing_377 : ChColor(
        id = "377",
        name = "群青",
        pinyin = "qunqing",
        color = Color(0xFF1772b4),
        hex = "#1772b4",
        rgb = listOf(23, 114, 180),
        cmyk = listOf(99, 48, 11, 1)
    )

    object jiqing_378 : ChColor(
        id = "378",
        name = "霁青",
        pinyin = "jiqing",
        color = Color(0xFF63bbd0),
        hex = "#63bbd0",
        rgb = listOf(99, 187, 208),
        cmyk = listOf(74, 2, 24, 0)
    )

    object biqing_379 : ChColor(
        id = "379",
        name = "碧青",
        pinyin = "biqing",
        color = Color(0xFF5cb3cc),
        hex = "#5cb3cc",
        rgb = listOf(92, 179, 204),
        cmyk = listOf(77, 7, 24, 0)
    )

    object baoshilan_380 : ChColor(
        id = "380",
        name = "宝石蓝",
        pinyin = "baoshilan",
        color = Color(0xFF2486b9),
        hex = "#2486b9",
        rgb = listOf(36, 134, 185),
        cmyk = listOf(94, 32, 17, 3)
    )

    object tianlan_381 : ChColor(
        id = "381",
        name = "天蓝",
        pinyin = "tianlan",
        color = Color(0xFF1677b3),
        hex = "#1677b3",
        rgb = listOf(22, 119, 179),
        cmyk = listOf(98, 43, 14, 2)
    )

    object bolinlan_382 : ChColor(
        id = "382",
        name = "柏林蓝",
        pinyin = "bolinlan",
        color = Color(0xFF126bae),
        hex = "#126bae",
        rgb = listOf(18, 107, 174),
        cmyk = listOf(100, 52, 11, 1)
    )

    object haiqing_383 : ChColor(
        id = "383",
        name = "海青",
        pinyin = "haiqing",
        color = Color(0xFF22a2c3),
        hex = "#22a2c3",
        rgb = listOf(34, 162, 195),
        cmyk = listOf(92, 10, 25, 1)
    )

    object gulan_384 : ChColor(
        id = "384",
        name = "钴蓝",
        pinyin = "gulan",
        color = Color(0xFF1a94bc),
        hex = "#1a94bc",
        rgb = listOf(26, 148, 188),
        cmyk = listOf(94, 16, 23, 3)
    )

    object yuanweilan_385 : ChColor(
        id = "385",
        name = "鸢尾蓝",
        pinyin = "yuanweilan",
        color = Color(0xFF158bb8),
        hex = "#158bb8",
        rgb = listOf(21, 139, 184),
        cmyk = listOf(95, 25, 20, 4)
    )

    object qianniuhualan_386 : ChColor(
        id = "386",
        name = "牵牛花蓝",
        pinyin = "qianniuhualan",
        color = Color(0xFF1177b0),
        hex = "#1177b0",
        rgb = listOf(17, 119, 176),
        cmyk = listOf(98, 42, 16, 3)
    )

    object feiyancaolan_387 : ChColor(
        id = "387",
        name = "飞燕草蓝",
        pinyin = "feiyancaolan",
        color = Color(0xFF0f59a4),
        hex = "#0f59a4",
        rgb = listOf(15, 89, 164),
        cmyk = listOf(100, 65, 11, 1)
    )

    object pinlan_388 : ChColor(
        id = "388",
        name = "品蓝",
        pinyin = "pinlan",
        color = Color(0xFF2b73af),
        hex = "#2b73af",
        rgb = listOf(43, 115, 175),
        cmyk = listOf(95, 47, 14, 2)
    )

    object yinyubai_389 : ChColor(
        id = "389",
        name = "银鱼白",
        pinyin = "yinyubai",
        color = Color(0xFFcdd1d3),
        hex = "#cdd1d3",
        rgb = listOf(205, 209, 211),
        cmyk = listOf(24, 14, 16, 1)
    )

    object ananlan_390 : ChColor(
        id = "390",
        name = "安安蓝",
        pinyin = "ananlan",
        color = Color(0xFF3170a7),
        hex = "#3170a7",
        rgb = listOf(49, 112, 167),
        cmyk = listOf(93, 49, 17, 3)
    )

    object yuweihui_391 : ChColor(
        id = "391",
        name = "鱼尾灰",
        pinyin = "yuweihui",
        color = Color(0xFF5e616d),
        hex = "#5e616d",
        rgb = listOf(94, 97, 109),
        cmyk = listOf(64, 52, 39, 28)
    )

    object jingyuhui_392 : ChColor(
        id = "392",
        name = "鲸鱼灰",
        pinyin = "jingyuhui",
        color = Color(0xFF475164),
        hex = "#475164",
        rgb = listOf(71, 81, 100),
        cmyk = listOf(78, 60, 40, 31)
    )

    object haishenhui_393 : ChColor(
        id = "393",
        name = "海参灰",
        pinyin = "haishenhui",
        color = Color(0xFFfffefa),
        hex = "#fffefa",
        rgb = listOf(255, 254, 250),
        cmyk = listOf(69, 64, 52, 59)
    )

    object shayuhui_394 : ChColor(
        id = "394",
        name = "沙鱼灰",
        pinyin = "shayuhui",
        color = Color(0xFF35333c),
        hex = "#35333c",
        rgb = listOf(53, 51, 60),
        cmyk = listOf(76, 70, 51, 60)
    )

    object ganglan_395 : ChColor(
        id = "395",
        name = "钢蓝",
        pinyin = "ganglan",
        color = Color(0xFF0f1423),
        hex = "#0f1423",
        rgb = listOf(15, 20, 35),
        cmyk = listOf(100, 89, 54, 79)
    )

    object yunshuilan_396 : ChColor(
        id = "396",
        name = "云水蓝",
        pinyin = "yunshuilan",
        color = Color(0xFFbaccd9),
        hex = "#baccd9",
        rgb = listOf(186, 204, 217),
        cmyk = listOf(35, 13, 13, 0)
    )

    object qingshanlan_397 : ChColor(
        id = "397",
        name = "晴山蓝",
        pinyin = "qingshanlan",
        color = Color(0xFF8fb2c9),
        hex = "#8fb2c9",
        rgb = listOf(143, 178, 201),
        cmyk = listOf(55, 20, 18, 1)
    )

    object dianqing_398 : ChColor(
        id = "398",
        name = "靛青",
        pinyin = "dianqing",
        color = Color(0xFF1661ab),
        hex = "#1661ab",
        rgb = listOf(22, 97, 171),
        cmyk = listOf(100, 60, 8, 1)
    )

    object dalishihui_399 : ChColor(
        id = "399",
        name = "大理石灰",
        pinyin = "dalishihui",
        color = Color(0xFFc4cbcf),
        hex = "#c4cbcf",
        rgb = listOf(196, 203, 207),
        cmyk = listOf(29, 16, 17, 1)
    )

    object haitaolan_400 : ChColor(
        id = "400",
        name = "海涛蓝",
        pinyin = "haitaolan",
        color = Color(0xFF15559a),
        hex = "#15559a",
        rgb = listOf(21, 85, 154),
        cmyk = listOf(100, 67, 16, 3)
    )

    object diechilan_401 : ChColor(
        id = "401",
        name = "蝶翅蓝",
        pinyin = "diechilan",
        color = Color(0xFF4e7ca1),
        hex = "#4e7ca1",
        rgb = listOf(78, 124, 161),
        cmyk = listOf(81, 41, 24, 8)
    )

    object haijunlan_402 : ChColor(
        id = "402",
        name = "海军蓝",
        pinyin = "haijunlan",
        color = Color(0xFF346c9c),
        hex = "#346c9c",
        rgb = listOf(52, 108, 156),
        cmyk = listOf(93, 50, 21, 6)
    )

    object shuiniuhui_403 : ChColor(
        id = "403",
        name = "水牛灰",
        pinyin = "shuiniuhui",
        color = Color(0xFF2f2f35),
        hex = "#2f2f35",
        rgb = listOf(47, 47, 53),
        cmyk = listOf(77, 68, 54, 66)
    )

    object niujiaohui_404 : ChColor(
        id = "404",
        name = "牛角灰",
        pinyin = "niujiaohui",
        color = Color(0xFF2d2e36),
        hex = "#2d2e36",
        rgb = listOf(45, 46, 54),
        cmyk = listOf(80, 70, 53, 65)
    )

    object yanhanlan_405 : ChColor(
        id = "405",
        name = "燕颔蓝",
        pinyin = "yanhanlan",
        color = Color(0xFF131824),
        hex = "#131824",
        rgb = listOf(19, 24, 36),
        cmyk = listOf(100, 86, 54, 78)
    )

    object yunfengbai_406 : ChColor(
        id = "406",
        name = "云峰白",
        pinyin = "yunfengbai",
        color = Color(0xFFd8e3e7),
        hex = "#d8e3e7",
        rgb = listOf(216, 227, 231),
        cmyk = listOf(21, 6, 10, 0)
    )

    object jingtianlan_407 : ChColor(
        id = "407",
        name = "井天蓝",
        pinyin = "jingtianlan",
        color = Color(0xFFc3d7df),
        hex = "#c3d7df",
        rgb = listOf(195, 215, 223),
        cmyk = listOf(32, 8, 13, 0)
    )

    object yunshanlan_408 : ChColor(
        id = "408",
        name = "云山蓝",
        pinyin = "yunshanlan",
        color = Color(0xFF2f90b9),
        hex = "#2f90b9",
        rgb = listOf(47, 144, 185),
        cmyk = listOf(91, 24, 22, 4)
    )

    object youlan_409 : ChColor(
        id = "409",
        name = "釉蓝",
        pinyin = "youlan",
        color = Color(0xFF1781b5),
        hex = "#1781b5",
        rgb = listOf(23, 129, 181),
        cmyk = listOf(96, 34, 18, 4)
    )

    object oulan_410 : ChColor(
        id = "410",
        name = "鸥蓝",
        pinyin = "oulan",
        color = Color(0xFFc7d2d4),
        hex = "#c7d2d4",
        rgb = listOf(199, 210, 212),
        cmyk = listOf(28, 12, 17, 0)
    )

    object tangcilan_411 : ChColor(
        id = "411",
        name = "搪磁蓝",
        pinyin = "tangcilan",
        color = Color(0xFF11659a),
        hex = "#11659a",
        rgb = listOf(17, 101, 154),
        cmyk = listOf(100, 53, 21, 6)
    )

    object yueyingbai_412 : ChColor(
        id = "412",
        name = "月影白",
        pinyin = "yueyingbai",
        color = Color(0xFFc0c4c3),
        hex = "#c0c4c3",
        rgb = listOf(192, 196, 195),
        cmyk = listOf(29, 18, 21, 2)
    )

    object xinghui_413 : ChColor(
        id = "413",
        name = "星灰",
        pinyin = "xinghui",
        color = Color(0xFFb2bbbe),
        hex = "#b2bbbe",
        rgb = listOf(178, 187, 190),
        cmyk = listOf(36, 20, 23, 2)
    )

    object danlanhui_414 : ChColor(
        id = "414",
        name = "淡蓝灰",
        pinyin = "danlanhui",
        color = Color(0xFF5e7987),
        hex = "#5e7987",
        rgb = listOf(94, 121, 135),
        cmyk = listOf(70, 38, 36, 18)
    )

    object yanlan_415 : ChColor(
        id = "415",
        name = "鷃蓝",
        pinyin = "yanlan",
        color = Color(0xFF144a74),
        hex = "#144a74",
        rgb = listOf(20, 74, 116),
        cmyk = listOf(100, 68, 32, 20)
    )

    object nenhui_416 : ChColor(
        id = "416",
        name = "嫩灰",
        pinyin = "nenhui",
        color = Color(0xFF74787a),
        hex = "#74787a",
        rgb = listOf(116, 120, 122),
        cmyk = listOf(55, 40, 40, 23)
    )

    object zhanjianhui_417 : ChColor(
        id = "417",
        name = "战舰灰",
        pinyin = "zhanjianhui",
        color = Color(0xFF495c69),
        hex = "#495c69",
        rgb = listOf(73, 92, 105),
        cmyk = listOf(77, 50, 41, 31)
    )

    object waguanhui_418 : ChColor(
        id = "418",
        name = "瓦罐灰",
        pinyin = "waguanhui",
        color = Color(0xFF47484c),
        hex = "#47484c",
        rgb = listOf(71, 72, 76),
        cmyk = listOf(67, 57, 49, 49)
    )

    object qinghui_419 : ChColor(
        id = "419",
        name = "青灰",
        pinyin = "qinghui",
        color = Color(0xFF2b333e),
        hex = "#2b333e",
        rgb = listOf(43, 51, 62),
        cmyk = listOf(87, 69, 51, 58)
    )

    object gelan_420 : ChColor(
        id = "420",
        name = "鸽蓝",
        pinyin = "gelan",
        color = Color(0xFF1c2938),
        hex = "#1c2938",
        rgb = listOf(28, 41, 56),
        cmyk = listOf(100, 77, 50, 62)
    )

    object gangqing_421 : ChColor(
        id = "421",
        name = "钢青",
        pinyin = "gangqing",
        color = Color(0xFF142334),
        hex = "#142334",
        rgb = listOf(20, 35, 52),
        cmyk = listOf(100, 82, 51, 64)
    )

    object anlan_422 : ChColor(
        id = "422",
        name = "暗蓝",
        pinyin = "anlan",
        color = Color(0xFF101f30),
        hex = "#101f30",
        rgb = listOf(16, 31, 48),
        cmyk = listOf(100, 84, 51, 68)
    )

    object yuebai_423 : ChColor(
        id = "423",
        name = "月白",
        pinyin = "yuebai",
        color = Color(0xFFeef7f2),
        hex = "#eef7f2",
        rgb = listOf(238, 247, 242),
        cmyk = listOf(11, 0, 8, 0)
    )

    object haitianlan_424 : ChColor(
        id = "424",
        name = "海天蓝",
        pinyin = "haitianlan",
        color = Color(0xFFc6e6e8),
        hex = "#c6e6e8",
        rgb = listOf(198, 230, 232),
        cmyk = listOf(33, 0, 14, 0)
    )

    object qingshuilan_425 : ChColor(
        id = "425",
        name = "清水蓝",
        pinyin = "qingshuilan",
        color = Color(0xFF93d5dc),
        hex = "#93d5dc",
        rgb = listOf(147, 213, 220),
        cmyk = listOf(57, 0, 22, 0)
    )

    object pubulan_426 : ChColor(
        id = "426",
        name = "瀑布蓝",
        pinyin = "pubulan",
        color = Color(0xFF51c4d3),
        hex = "#51c4d3",
        rgb = listOf(81, 196, 211),
        cmyk = listOf(79, 0, 27, 0)
    )

    object weilan_427 : ChColor(
        id = "427",
        name = "蔚蓝",
        pinyin = "weilan",
        color = Color(0xFF29b7cb),
        hex = "#29b7cb",
        rgb = listOf(41, 183, 203),
        cmyk = listOf(89, 0, 29, 0)
    )

    object kongquelan_428 : ChColor(
        id = "428",
        name = "孔雀蓝",
        pinyin = "kongquelan",
        color = Color(0xFF0eb0c9),
        hex = "#0eb0c9",
        rgb = listOf(14, 176, 201),
        cmyk = listOf(92, 0, 28, 0)
    )

    object dianzilan_429 : ChColor(
        id = "429",
        name = "甸子蓝",
        pinyin = "dianzilan",
        color = Color(0xFF10aec2),
        hex = "#10aec2",
        rgb = listOf(16, 174, 194),
        cmyk = listOf(93, 0, 31, 0)
    )

    object shilv_430 : ChColor(
        id = "430",
        name = "石绿",
        pinyin = "shilv",
        color = Color(0xFF57c3c2),
        hex = "#57c3c2",
        rgb = listOf(87, 195, 194),
        cmyk = listOf(78, 36, 0, 0)
    )

    object zhuhuanglv_431 : ChColor(
        id = "431",
        name = "竹篁绿",
        pinyin = "zhuhuanglv",
        color = Color(0xFFb9dec9),
        hex = "#b9dec9",
        rgb = listOf(185, 222, 201),
        cmyk = listOf(40, 0, 30, 0)
    )

    object fenlv_432 : ChColor(
        id = "432",
        name = "粉绿",
        pinyin = "fenlv",
        color = Color(0xFF83cbac),
        hex = "#83cbac",
        rgb = listOf(131, 203, 172),
        cmyk = listOf(64, 0, 46, 0)
    )

    object meidielv_433 : ChColor(
        id = "433",
        name = "美蝶绿",
        pinyin = "meidielv",
        color = Color(0xFF12aa9c),
        hex = "#12aa9c",
        rgb = listOf(18, 170, 156),
        cmyk = listOf(95, 0, 52, 0)
    )

    object maolv_434 : ChColor(
        id = "434",
        name = "毛绿",
        pinyin = "maolv",
        color = Color(0xFF66c18c),
        hex = "#66c18c",
        rgb = listOf(102, 193, 140),
        cmyk = listOf(75, 0, 61, 0)
    )

    object koushaolv_435 : ChColor(
        id = "435",
        name = "蔻梢绿",
        pinyin = "koushaolv",
        color = Color(0xFF5dbe8a),
        hex = "#5dbe8a",
        rgb = listOf(93, 190, 138),
        cmyk = listOf(78, 0, 62, 0)
    )

    object maimiaolv_436 : ChColor(
        id = "436",
        name = "麦苗绿",
        pinyin = "maimiaolv",
        color = Color(0xFF55bb8a),
        hex = "#55bb8a",
        rgb = listOf(85, 187, 138),
        cmyk = listOf(81, 0, 62, 0)
    )

    object walv_437 : ChColor(
        id = "437",
        name = "蛙绿",
        pinyin = "walv",
        color = Color(0xFF45b787),
        hex = "#45b787",
        rgb = listOf(69, 183, 135),
        cmyk = listOf(86, 0, 63, 0)
    )

    object tonglv_438 : ChColor(
        id = "438",
        name = "铜绿",
        pinyin = "tonglv",
        color = Color(0xFF2bae85),
        hex = "#2bae85",
        rgb = listOf(43, 174, 133),
        cmyk = listOf(92, 0, 64, 0)
    )

    object zhulv_439 : ChColor(
        id = "439",
        name = "竹绿",
        pinyin = "zhulv",
        color = Color(0xFF1ba784),
        hex = "#1ba784",
        rgb = listOf(27, 167, 132),
        cmyk = listOf(96, 0, 64, 0)
    )

    object lanlv_440 : ChColor(
        id = "440",
        name = "蓝绿",
        pinyin = "lanlv",
        color = Color(0xFF12a182),
        hex = "#12a182",
        rgb = listOf(18, 161, 130),
        cmyk = listOf(98, 2, 64, 0)
    )

    object qionghui_441 : ChColor(
        id = "441",
        name = "穹灰",
        pinyin = "qionghui",
        color = Color(0xFFc4d7d6),
        hex = "#c4d7d6",
        rgb = listOf(196, 215, 214),
        cmyk = listOf(32, 7, 18, 0)
    )

    object cuilan_442 : ChColor(
        id = "442",
        name = "翠蓝",
        pinyin = "cuilan",
        color = Color(0xFF1e9eb3),
        hex = "#1e9eb3",
        rgb = listOf(30, 158, 179),
        cmyk = listOf(94, 11, 33, 1)
    )

    object danfanlan_443 : ChColor(
        id = "443",
        name = "胆矾蓝",
        pinyin = "danfanlan",
        color = Color(0xFF0f95b0),
        hex = "#0f95b0",
        rgb = listOf(15, 149, 176),
        cmyk = listOf(96, 16, 31, 3)
    )

    object jianniaolan_444 : ChColor(
        id = "444",
        name = "樫鸟蓝",
        pinyin = "jianniaolan",
        color = Color(0xFF1491a8),
        hex = "#1491a8",
        rgb = listOf(20, 145, 168),
        cmyk = listOf(96, 18, 34, 4)
    )

    object shanlan_445 : ChColor(
        id = "445",
        name = "闪蓝",
        pinyin = "shanlan",
        color = Color(0xFF7cabb1),
        hex = "#7cabb1",
        rgb = listOf(124, 171, 177),
        cmyk = listOf(64, 18, 32, 2)
    )

    object bingshanlan_446 : ChColor(
        id = "446",
        name = "冰山蓝",
        pinyin = "bingshanlan",
        color = Color(0xFFa4aca7),
        hex = "#a4aca7",
        rgb = listOf(164, 172, 167),
        cmyk = listOf(40, 24, 32, 6)
    )

    object xiakeqing_447 : ChColor(
        id = "447",
        name = "虾壳青",
        pinyin = "xiakeqing",
        color = Color(0xFF869d9d),
        hex = "#869d9d",
        rgb = listOf(134, 157, 157),
        cmyk = listOf(56, 26, 36, 7)
    )

    object wanbolan_448 : ChColor(
        id = "448",
        name = "晚波蓝",
        pinyin = "wanbolan",
        color = Color(0xFF648e93),
        hex = "#648e93",
        rgb = listOf(100, 142, 147),
        cmyk = listOf(71, 28, 39, 10)
    )

    object qingtinglan_449 : ChColor(
        id = "449",
        name = "蜻蜓蓝",
        pinyin = "qingtinglan",
        color = Color(0xFF3b818c),
        hex = "#3b818c",
        rgb = listOf(59, 129, 140),
        cmyk = listOf(89, 27, 41, 13)
    )

    object yuqinlan_450 : ChColor(
        id = "450",
        name = "玉鈫蓝",
        pinyin = "yuqinlan",
        color = Color(0xFF126e82),
        hex = "#126e82",
        rgb = listOf(18, 110, 130),
        cmyk = listOf(99, 33, 38, 21)
    )

    object ehui_451 : ChColor(
        id = "451",
        name = "垩灰",
        pinyin = "ehui",
        color = Color(0xFF737c7b),
        hex = "#737c7b",
        rgb = listOf(115, 124, 123),
        cmyk = listOf(57, 37, 42, 21)
    )

    object xiayunhui_452 : ChColor(
        id = "452",
        name = "夏云灰",
        pinyin = "xiayunhui",
        color = Color(0xFF617172),
        hex = "#617172",
        rgb = listOf(97, 113, 114),
        cmyk = listOf(65, 40, 44, 26)
    )

    object canglan_453 : ChColor(
        id = "453",
        name = "苍蓝",
        pinyin = "canglan",
        color = Color(0xFF134857),
        hex = "#134857",
        rgb = listOf(19, 72, 87),
        cmyk = listOf(100, 52, 46, 43)
    )

    object huanghunhui_454 : ChColor(
        id = "454",
        name = "黄昏灰",
        pinyin = "huanghunhui",
        color = Color(0xFF474b4c),
        hex = "#474b4c",
        rgb = listOf(71, 75, 76),
        cmyk = listOf(67, 53, 51, 50)
    )

    object huilan_455 : ChColor(
        id = "455",
        name = "灰蓝",
        pinyin = "huilan",
        color = Color(0xFF21373d),
        hex = "#21373d",
        rgb = listOf(33, 55, 61),
        cmyk = listOf(94, 58, 54, 60)
    )

    object shenhuilan_456 : ChColor(
        id = "456",
        name = "深灰蓝",
        pinyin = "shenhuilan",
        color = Color(0xFF132c33),
        hex = "#132c33",
        rgb = listOf(19, 44, 51),
        cmyk = listOf(100, 64, 56, 68)
    )

    object yuzanlv_457 : ChColor(
        id = "457",
        name = "玉簪绿",
        pinyin = "yuzanlv",
        color = Color(0xFFa4cab6),
        hex = "#a4cab6",
        rgb = listOf(164, 202, 182),
        cmyk = listOf(49, 5, 37, 0)
    )

    object qingfanlv_458 : ChColor(
        id = "458",
        name = "青矾绿",
        pinyin = "qingfanlv",
        color = Color(0xFF2c9678),
        hex = "#2c9678",
        rgb = listOf(44, 150, 120),
        cmyk = listOf(96, 12, 66, 2)
    )

    object caoyuanyuanlv_459 : ChColor(
        id = "459",
        name = "草原远绿",
        pinyin = "caoyuanyuanlv",
        color = Color(0xFF9abeaf),
        hex = "#9abeaf",
        rgb = listOf(154, 190, 175),
        cmyk = listOf(52, 11, 37, 0)
    )

    object wuzhilv_460 : ChColor(
        id = "460",
        name = "梧枝绿",
        pinyin = "wuzhilv",
        color = Color(0xFF69a794),
        hex = "#69a794",
        rgb = listOf(105, 167, 148),
        cmyk = listOf(74, 14, 51, 1)
    )

    object langhualv_461 : ChColor(
        id = "461",
        name = "浪花绿",
        pinyin = "langhualv",
        color = Color(0xFF92b3a5),
        hex = "#92b3a5",
        rgb = listOf(146, 179, 165),
        cmyk = listOf(55, 16, 40, 1)
    )

    object haiwanglv_462 : ChColor(
        id = "462",
        name = "海王绿",
        pinyin = "haiwanglv",
        color = Color(0xFF248067),
        hex = "#248067",
        rgb = listOf(36, 128, 103),
        cmyk = listOf(99, 23, 70, 10)
    )

    object yadinglv_463 : ChColor(
        id = "463",
        name = "亚丁绿",
        pinyin = "yadinglv",
        color = Color(0xFF428675),
        hex = "#428675",
        rgb = listOf(66, 134, 117),
        cmyk = listOf(88, 24, 61, 9)
    )

    object niehui_464 : ChColor(
        id = "464",
        name = "镍灰",
        pinyin = "niehui",
        color = Color(0xFF9fa39a),
        hex = "#9fa39a",
        rgb = listOf(159, 163, 154),
        cmyk = listOf(40, 27, 36, 8)
    )

    object minghui_465 : ChColor(
        id = "465",
        name = "明灰",
        pinyin = "minghui",
        color = Color(0xFF8a988e),
        hex = "#8a988e",
        rgb = listOf(138, 152, 142),
        cmyk = listOf(52, 28, 42, 10)
    )

    object danlvhui_466 : ChColor(
        id = "466",
        name = "淡绿灰",
        pinyin = "danlvhui",
        color = Color(0xFF70887d),
        hex = "#70887d",
        rgb = listOf(112, 136, 125),
        cmyk = listOf(63, 31, 50, 14)
    )

    object feiquanlv_467 : ChColor(
        id = "467",
        name = "飞泉绿",
        pinyin = "feiquanlv",
        color = Color(0xFF497568),
        hex = "#497568",
        rgb = listOf(73, 117, 104),
        cmyk = listOf(82, 32, 60, 20)
    )

    object langyanhui_468 : ChColor(
        id = "468",
        name = "狼烟灰",
        pinyin = "langyanhui",
        color = Color(0xFF5d655f),
        hex = "#5d655f",
        rgb = listOf(93, 101, 95),
        cmyk = listOf(62, 43, 52, 34)
    )

    object lvhui_469 : ChColor(
        id = "469",
        name = "绿灰",
        pinyin = "lvhui",
        color = Color(0xFF314a43),
        hex = "#314a43",
        rgb = listOf(49, 74, 67),
        cmyk = listOf(85, 44, 64, 52)
    )

    object canglv_470 : ChColor(
        id = "470",
        name = "苍绿",
        pinyin = "canglv",
        color = Color(0xFF223e36),
        hex = "#223e36",
        rgb = listOf(34, 62, 54),
        cmyk = listOf(93, 46, 70, 61)
    )

    object shenhailv_471 : ChColor(
        id = "471",
        name = "深海绿",
        pinyin = "shenhailv",
        color = Color(0xFF1a3b32),
        hex = "#1a3b32",
        rgb = listOf(26, 59, 50),
        cmyk = listOf(98, 46, 73, 63)
    )

    object changshihui_472 : ChColor(
        id = "472",
        name = "长石灰",
        pinyin = "changshihui",
        color = Color(0xFF363433),
        hex = "#363433",
        rgb = listOf(54, 52, 51),
        cmyk = listOf(67, 60, 57, 68)
    )

    object ganlanlv_473 : ChColor(
        id = "473",
        name = "苷蓝绿",
        pinyin = "ganlanlv",
        color = Color(0xFF1f2623),
        hex = "#1f2623",
        rgb = listOf(31, 38, 35),
        cmyk = listOf(82, 60, 65, 80)
    )

    object mangconglv_474 : ChColor(
        id = "474",
        name = "莽丛绿",
        pinyin = "mangconglv",
        color = Color(0xFF141e1b),
        hex = "#141e1b",
        rgb = listOf(20, 30, 27),
        cmyk = listOf(90, 62, 67, 86)
    )

    object dancuilv_475 : ChColor(
        id = "475",
        name = "淡翠绿",
        pinyin = "dancuilv",
        color = Color(0xFFc6dfc8),
        hex = "#c6dfc8",
        rgb = listOf(198, 223, 200),
        cmyk = listOf(33, 1, 29, 0)
    )

    object minglv_476 : ChColor(
        id = "476",
        name = "明绿",
        pinyin = "minglv",
        color = Color(0xFF9eccab),
        hex = "#9eccab",
        rgb = listOf(158, 204, 171),
        cmyk = listOf(53, 1, 44, 0)
    )

    object tianyuanlv_477 : ChColor(
        id = "477",
        name = "田园绿",
        pinyin = "tianyuanlv",
        color = Color(0xFF68b88e),
        hex = "#68b88e",
        rgb = listOf(104, 184, 142),
        cmyk = listOf(75, 0, 59, 0)
    )

    object cuilv_478 : ChColor(
        id = "478",
        name = "翠绿",
        pinyin = "cuilv",
        color = Color(0xFF20a162),
        hex = "#20a162",
        rgb = listOf(32, 161, 98),
        cmyk = listOf(98, 0, 82, 0)
    )

    object danlv_479 : ChColor(
        id = "479",
        name = "淡绿",
        pinyin = "danlv",
        color = Color(0xFF61ac85),
        hex = "#61ac85",
        rgb = listOf(97, 172, 133),
        cmyk = listOf(78, 6, 62, 0)
    )

    object conglv_480 : ChColor(
        id = "480",
        name = "葱绿",
        pinyin = "conglv",
        color = Color(0xFF40a070),
        hex = "#40a070",
        rgb = listOf(64, 160, 112),
        cmyk = listOf(90, 7, 73, 0)
    )

    object kongquelv_481 : ChColor(
        id = "481",
        name = "孔雀绿",
        pinyin = "kongquelv",
        color = Color(0xFF229453),
        hex = "#229453",
        rgb = listOf(34, 148, 83),
        cmyk = listOf(99, 10, 91, 2)
    )

    object ailv_482 : ChColor(
        id = "482",
        name = "艾绿",
        pinyin = "ailv",
        color = Color(0xFFcad3c3),
        hex = "#cad3c3",
        rgb = listOf(202, 211, 195),
        cmyk = listOf(27, 11, 27, 1)
    )

    object chanlv_483 : ChColor(
        id = "483",
        name = "蟾绿",
        pinyin = "chanlv",
        color = Color(0xFF3c9566),
        hex = "#3c9566",
        rgb = listOf(60, 149, 102),
        cmyk = listOf(92, 14, 76, 2)
    )

    object gongdianlv_484 : ChColor(
        id = "484",
        name = "宫殿绿",
        pinyin = "gongdianlv",
        color = Color(0xFF20894d),
        hex = "#20894d",
        rgb = listOf(32, 137, 77),
        cmyk = listOf(100, 17, 92, 5)
    )

    object songshuanglv_485 : ChColor(
        id = "485",
        name = "松霜绿",
        pinyin = "songshuanglv",
        color = Color(0xFF83a78d),
        hex = "#83a78d",
        rgb = listOf(131, 167, 141),
        cmyk = listOf(61, 19, 52, 3)
    )

    object danbaishilv_486 : ChColor(
        id = "486",
        name = "蛋白石绿",
        pinyin = "danbaishilv",
        color = Color(0xFF579572),
        hex = "#579572",
        rgb = listOf(87, 149, 114),
        cmyk = listOf(81, 19, 67, 4)
    )

    object bohelv_487 : ChColor(
        id = "487",
        name = "薄荷绿",
        pinyin = "bohelv",
        color = Color(0xFF207f4c),
        hex = "#207f4c",
        rgb = listOf(32, 127, 76),
        cmyk = listOf(100, 22, 90, 10)
    )

    object wasonglv_488 : ChColor(
        id = "488",
        name = "瓦松绿",
        pinyin = "wasonglv",
        color = Color(0xFF6e8b74),
        hex = "#6e8b74",
        rgb = listOf(110, 139, 116),
        cmyk = listOf(66, 29, 58, 12)
    )

    object heyelv_489 : ChColor(
        id = "489",
        name = "荷叶绿",
        pinyin = "heyelv",
        color = Color(0xFF1a6840),
        hex = "#1a6840",
        rgb = listOf(26, 104, 64),
        cmyk = listOf(100, 31, 91, 25)
    )

    object tianluolv_490 : ChColor(
        id = "490",
        name = "田螺绿",
        pinyin = "tianluolv",
        color = Color(0xFF5e665b),
        hex = "#5e665b",
        rgb = listOf(94, 102, 91),
        cmyk = listOf(62, 42, 56, 34)
    )

    object baiqucailv_491 : ChColor(
        id = "491",
        name = "白屈菜绿",
        pinyin = "baiqucailv",
        color = Color(0xFF485b4d),
        hex = "#485b4d",
        rgb = listOf(72, 91, 77),
        cmyk = listOf(74, 42, 65, 40)
    )

    object hetunhui_492 : ChColor(
        id = "492",
        name = "河豚灰",
        pinyin = "hetunhui",
        color = Color(0xFF393733),
        hex = "#393733",
        rgb = listOf(57, 55, 51),
        cmyk = listOf(64, 57, 60, 67)
    )

    object enyoulv_493 : ChColor(
        id = "493",
        name = "蒽油绿",
        pinyin = "enyoulv",
        color = Color(0xFF373834),
        hex = "#373834",
        rgb = listOf(55, 56, 52),
        cmyk = listOf(68, 56, 60, 66)
    )

    object hujishenglv_494 : ChColor(
        id = "494",
        name = "槲寄生绿",
        pinyin = "hujishenglv",
        color = Color(0xFF2b312c),
        hex = "#2b312c",
        rgb = listOf(43, 49, 44),
        cmyk = listOf(76, 56, 75, 72)
    )

    object yunshanlv_495 : ChColor(
        id = "495",
        name = "云杉绿",
        pinyin = "yunshanlv",
        color = Color(0xFF15231b),
        hex = "#15231b",
        rgb = listOf(21, 35, 27),
        cmyk = listOf(91, 60, 76, 83)
    )

    object nenjulv_496 : ChColor(
        id = "496",
        name = "嫩菊绿",
        pinyin = "nenjulv",
        color = Color(0xFFf0f5e5),
        hex = "#f0f5e5",
        rgb = listOf(240, 245, 229),
        cmyk = listOf(9, 1, 14, 0)
    )

    object aibeilv_497 : ChColor(
        id = "497",
        name = "艾背绿",
        pinyin = "aibeilv",
        color = Color(0xFFdfecd5),
        hex = "#dfecd5",
        rgb = listOf(223, 236, 213),
        cmyk = listOf(20, 1, 23, 0)
    )

    object jialingshuilv_498 : ChColor(
        id = "498",
        name = "嘉陵水绿",
        pinyin = "jialingshuilv",
        color = Color(0xFFadd5a2),
        hex = "#add5a2",
        rgb = listOf(173, 213, 162),
        cmyk = listOf(47, 0, 49, 0)
    )

    object yusuilv_499 : ChColor(
        id = "499",
        name = "玉髓绿",
        pinyin = "yusuilv",
        color = Color(0xFF41b349),
        hex = "#41b349",
        rgb = listOf(65, 179, 73),
        cmyk = listOf(89, 0, 96, 0)
    )

    object xianlv_500 : ChColor(
        id = "500",
        name = "鲜绿",
        pinyin = "xianlv",
        color = Color(0xFF43b244),
        hex = "#43b244",
        rgb = listOf(67, 178, 68),
        cmyk = listOf(88, 0, 99, 0)
    )

    object baoshilv_501 : ChColor(
        id = "501",
        name = "宝石绿",
        pinyin = "baoshilv",
        color = Color(0xFF41ae3c),
        hex = "#41ae3c",
        rgb = listOf(65, 174, 60),
        cmyk = listOf(90, 0, 100, 0)
    )

    object haimeilv_502 : ChColor(
        id = "502",
        name = "海沬绿",
        pinyin = "haimeilv",
        color = Color(0xFFe2e7bf),
        hex = "#e2e7bf",
        rgb = listOf(226, 231, 191),
        cmyk = listOf(18, 4, 33, 0)
    )

    object yaohuang_503 : ChColor(
        id = "503",
        name = "姚黄",
        pinyin = "yaohuang",
        color = Color(0xFFd0deaa),
        hex = "#d0deaa",
        rgb = listOf(208, 222, 170),
        cmyk = listOf(28, 4, 44, 0)
    )

    object ganlanshilv_504 : ChColor(
        id = "504",
        name = "橄榄石绿",
        pinyin = "ganlanshilv",
        color = Color(0xFFb2cf87),
        hex = "#b2cf87",
        rgb = listOf(178, 207, 135),
        cmyk = listOf(44, 3, 61, 0)
    )

    object shuilv_505 : ChColor(
        id = "505",
        name = "水绿",
        pinyin = "shuilv",
        color = Color(0xFF8cc269),
        hex = "#8cc269",
        rgb = listOf(140, 194, 105),
        cmyk = listOf(62, 0, 76, 0)
    )

    object luweilv_506 : ChColor(
        id = "506",
        name = "芦苇绿",
        pinyin = "luweilv",
        color = Color(0xFFb7d07a),
        hex = "#b7d07a",
        rgb = listOf(183, 208, 122),
        cmyk = listOf(42, 3, 67, 0)
    )

    object huaihuahuanglv_507 : ChColor(
        id = "507",
        name = "槐花黄绿",
        pinyin = "huaihuahuanglv",
        color = Color(0xFFd2d97a),
        hex = "#d2d97a",
        rgb = listOf(210, 217, 122),
        cmyk = listOf(28, 6, 66, 0)
    )

    object pingguolv_508 : ChColor(
        id = "508",
        name = "苹果绿",
        pinyin = "pingguolv",
        color = Color(0xFFbacf65),
        hex = "#bacf65",
        rgb = listOf(186, 207, 101),
        cmyk = listOf(41, 4, 76, 0)
    )

    object yalv_509 : ChColor(
        id = "509",
        name = "芽绿",
        pinyin = "yalv",
        color = Color(0xFF96c24e),
        hex = "#96c24e",
        rgb = listOf(150, 194, 78),
        cmyk = listOf(58, 1, 88, 0)
    )

    object diehuang_510 : ChColor(
        id = "510",
        name = "蝶黄",
        pinyin = "diehuang",
        color = Color(0xFFe2d849),
        hex = "#e2d849",
        rgb = listOf(226, 216, 73),
        cmyk = listOf(19, 9, 84, 1)
    )

    object ganlanhuanglv_511 : ChColor(
        id = "511",
        name = "橄榄黄绿",
        pinyin = "ganlanhuanglv",
        color = Color(0xFFbec936),
        hex = "#bec936",
        rgb = listOf(190, 201, 54),
        cmyk = listOf(38, 8, 94, 1)
    )

    object yingwulv_512 : ChColor(
        id = "512",
        name = "鹦鹉绿",
        pinyin = "yingwulv",
        color = Color(0xFF5bae23),
        hex = "#5bae23",
        rgb = listOf(91, 174, 35),
        cmyk = listOf(81, 0, 100, 0)
    )

    object youlv_513 : ChColor(
        id = "513",
        name = "油绿",
        pinyin = "youlv",
        color = Color(0xFF253d24),
        hex = "#253d24",
        rgb = listOf(37, 61, 36),
        cmyk = listOf(84, 64, 94, 45)
    )

    object xiangyabai_514 : ChColor(
        id = "514",
        name = "象牙白",
        pinyin = "xiangyabai",
        color = Color(0xFFfffef8),
        hex = "#fffef8",
        rgb = listOf(255, 254, 248),
        cmyk = listOf(0, 1, 4, 0)
    )

    object hanbaiyu_515 : ChColor(
        id = "515",
        name = "汉白玉",
        pinyin = "hanbaiyu",
        color = Color(0xFFf8f4ed),
        hex = "#f8f4ed",
        rgb = listOf(248, 244, 237),
        cmyk = listOf(3, 5, 8, 0)
    )

    object xuebai_516 : ChColor(
        id = "516",
        name = "雪白",
        pinyin = "xuebai",
        color = Color(0xFFfffef9),
        hex = "#fffef9",
        rgb = listOf(255, 254, 249),
        cmyk = listOf(0, 1, 3, 0)
    )

    object yudubai_517 : ChColor(
        id = "517",
        name = "鱼肚白",
        pinyin = "yudubai",
        color = Color(0xFFf7f4ed),
        hex = "#f7f4ed",
        rgb = listOf(247, 244, 237),
        cmyk = listOf(4, 4, 8, 0)
    )

    object zhenzhuhui_518 : ChColor(
        id = "518",
        name = "珍珠灰",
        pinyin = "zhenzhuhui",
        color = Color(0xFFe4dfd7),
        hex = "#e4dfd7",
        rgb = listOf(228, 223, 215),
        cmyk = listOf(12, 12, 16, 0)
    )

    object qianhui_519 : ChColor(
        id = "519",
        name = "浅灰",
        pinyin = "qianhui",
        color = Color(0xFFdad4cb),
        hex = "#dad4cb",
        rgb = listOf(218, 212, 203),
        cmyk = listOf(16, 15, 20, 1)
    )

    object qianhui_520 : ChColor(
        id = "520",
        name = "铅灰",
        pinyin = "qianhui",
        color = Color(0xFFbbb5ac),
        hex = "#bbb5ac",
        rgb = listOf(187, 181, 172),
        cmyk = listOf(28, 5, 30, 5)
    )

    object zhonghui_521 : ChColor(
        id = "521",
        name = "中灰",
        pinyin = "zhonghui",
        color = Color(0xFFbbb5ac),
        hex = "#bbb5ac",
        rgb = listOf(187, 181, 172),
        cmyk = listOf(28, 25, 30, 5)
    )

    object wahui_522 : ChColor(
        id = "522",
        name = "瓦灰",
        pinyin = "wahui",
        color = Color(0xFF867e76),
        hex = "#867e76",
        rgb = listOf(134, 126, 118),
        cmyk = listOf(42, 40, 43, 23)
    )

    object yehui_523 : ChColor(
        id = "523",
        name = "夜灰",
        pinyin = "yehui",
        color = Color(0xFF847c74),
        hex = "#847c74",
        rgb = listOf(132, 124, 116),
        cmyk = listOf(43, 40, 44, 42)
    )

    object yanhui_524 : ChColor(
        id = "524",
        name = "雁灰",
        pinyin = "yanhui",
        color = Color(0xFF80766e),
        hex = "#80766e",
        rgb = listOf(128, 118, 110),
        cmyk = listOf(42, 42, 45, 27)
    )

    object shenhui_525 : ChColor(
        id = "525",
        name = "深灰",
        pinyin = "shenhui",
        color = Color(0xFF81776e),
        hex = "#81776e",
        rgb = listOf(129, 119, 110),
        cmyk = listOf(42, 42, 46, 27)
    )


// object rubai_0 : ChColor(0, "乳白", "rubai", Color(0xFFf9f4dc),listOf(249,244,220),listOf(4,5,18,0))

    override fun toString(): String {


//  object rubai_0 : ChColor("0", "乳白", "rubai", Color(0xFFf9f4dc),listOf(rgb[0],rgb[1],rgb[2]),[] )
        return """object ${pinyin}_$id : ChColor(id = "$id", name = "$name", pinyin = "$pinyin",color = Color(0xFF${
            hex.replace(
                "#",
                ""
            )
        }),hex = "$hex",rgb = listOf(${rgb[0]},${rgb[1]},${rgb[2]}), cmyk =listOf(${cmyk[0]},${cmyk[1]},${cmyk[2]},${cmyk[3]}))"""


    }

    private fun color(): Color {
        return "#$hex".color
    }

    val String.color
        get() = Color(android.graphics.Color.parseColor(this))

}


class ChColorReader : IColorReader {


    override val json: String
        get() = "zhongguose.json"

    override fun getColorList(context: Context): List<ZgoColor> {

        val colors = ArrayList<ChColor>()

        //{
        //    "CMYK": [
        //        4,
        //        5,
        //        18,
        //        0
        //    ],
        //    "RGB": [
        //        249,
        //        244,
        //        220
        //    ],
        //    "hex": "#f9f4dc",
        //    "name": "乳白",
        //    "pinyin": "rubai"
        //}

        val jsonStr = getJsonString(context)
        try {
            val jsonArray = JSONArray(jsonStr)
            val colorCount = jsonArray.length()
            for (i in 0 until colorCount) {
                val jsonObject = jsonArray.getJSONObject(i)
                val id = i.toString()
                val pinyin = jsonObject.getString("pinyin")
                val name = jsonObject.getString("name")
                val hex = jsonObject.getString("hex")

                val rgbArray = jsonObject.getJSONArray("RGB")
                val rgbCount = rgbArray.length()
                val rgbList = ArrayList<Int>(3)
                for (r in 0 until rgbCount) {
                    rgbList.add(rgbArray.getInt(r))
                }

                val cmykArray = jsonObject.getJSONArray("CMYK")
                val cmykCount = cmykArray.length()
                val cmykList = ArrayList<Int>(4)
                for (c in 0 until cmykCount) {
                    cmykList.add(cmykArray.getInt(c))
                }

//    val chColorTemp = ChColor(id, name, pinyin, hex, rgbList, cmykList)
                val chColorTemp = ChColor(
                    id = id,
                    name = name,
                    hex = hex,
                    pinyin = pinyin,
                    rgb = rgbList,
                    cmyk = cmykList
                )
                colors.add(chColorTemp)
            }
        } catch (e: JSONException) {
            e.printStackTrace()
        }

        colors.forEach {
//            Log.e("zzz", it.toString())
            Log.e("zzz", "${it.pinyin}_${it.id},")

        }

        return colors


    }


}






