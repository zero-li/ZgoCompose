package com.zgo.lib.ui.theme.color

import android.content.Context
import android.util.Log
import androidx.compose.ui.graphics.Color
import org.json.JSONArray
import org.json.JSONException


/*
 * 
 * https://github.com/gjiazhe/NipponColors
 *
 * @author: zhhli
 * @date: 22/1/21
 */
open class NipponColor(
    id: String,
    name: String,
    hex: String = "",
    color: Color = Color.Transparent,
    val nameJp: String,
) : ZgoColor(id, name, hex, color) {

    object nadeshiko_1 : NipponColor(
        id = "1",
        nameJp = "撫子",
        name = "nadeshiko",
        hex = "#DC9F84",
        color = Color(0xFFDC9F84)
    )

    object kohbai_2 : NipponColor(
        id = "2",
        nameJp = "紅梅",
        name = "kohbai",
        hex = "#E16B8C",
        color = Color(0xFFE16B8C)
    )

    object suoh_3 : NipponColor(
        id = "3",
        nameJp = "蘇芳",
        name = "suoh",
        hex = "#8E354A",
        color = Color(0xFF8E354A)
    )

    object taikoh_4 : NipponColor(
        id = "4",
        nameJp = "退紅",
        name = "taikoh",
        hex = "#F8C3CD",
        color = Color(0xFFF8C3CD)
    )

    object ikkonzome_5 : NipponColor(
        id = "5",
        nameJp = "一斥染",
        name = "ikkonzome",
        hex = "#F4A7B9",
        color = Color(0xFFF4A7B9)
    )

    object kuwazome_6 : NipponColor(
        id = "6",
        nameJp = "桑染",
        name = "kuwazome",
        hex = "#64363c",
        color = Color(0xFF64363c)
    )

    object momo_7 : NipponColor(
        id = "7",
        nameJp = "桃",
        name = "momo",
        hex = "#F596AA",
        color = Color(0xFFF596AA)
    )

    object ichigo_8 : NipponColor(
        id = "8",
        nameJp = "莓",
        name = "ichigo",
        hex = "#B5495B",
        color = Color(0xFFB5495B)
    )

    object usubeni_9 : NipponColor(
        id = "9",
        nameJp = "薄紅",
        name = "usubeni",
        hex = "#E87A90",
        color = Color(0xFFE87A90)
    )

    object imayoh_10 : NipponColor(
        id = "10",
        nameJp = "今様",
        name = "imayoh",
        hex = "#D05A6E",
        color = Color(0xFFD05A6E)
    )

    object nakabeni_11 : NipponColor(
        id = "11",
        nameJp = "中紅",
        name = "nakabeni",
        hex = "#DB4D6D",
        color = Color(0xFFDB4D6D)
    )

    object sakura_12 : NipponColor(
        id = "12",
        nameJp = "桜",
        name = "sakura",
        hex = "#FEDFE1",
        color = Color(0xFFFEDFE1)
    )

    object umenezumi_13 : NipponColor(
        id = "13",
        nameJp = "梅鼠",
        name = "umenezumi",
        hex = "#9E7A7A",
        color = Color(0xFF9E7A7A)
    )

    object karakurenai_14 : NipponColor(
        id = "14",
        nameJp = "韓紅花",
        name = "karakurenai",
        hex = "#D0104C",
        color = Color(0xFFD0104C)
    )

    object enji_15 : NipponColor(
        id = "15",
        nameJp = "燕脂",
        name = "enji",
        hex = "#9F353A",
        color = Color(0xFF9F353A)
    )

    object kurenai_16 : NipponColor(
        id = "16",
        nameJp = "紅",
        name = "kurenai",
        hex = "#CB1B45",
        color = Color(0xFFCB1B45)
    )

    object toki_17 : NipponColor(
        id = "17",
        nameJp = "鴇",
        name = "toki",
        hex = "#EEA9A9",
        color = Color(0xFFEEA9A9)
    )

    object cyohsyun_18 : NipponColor(
        id = "18",
        nameJp = "長春",
        name = "cyohsyun",
        hex = "#BF6766",
        color = Color(0xFFBF6766)
    )

    object kokiake_19 : NipponColor(
        id = "19",
        nameJp = "深緋",
        name = "kokiake",
        hex = "#86473F",
        color = Color(0xFF86473F)
    )

    object sakuranezumi_20 : NipponColor(
        id = "20",
        nameJp = "桜鼠",
        name = "sakuranezumi",
        hex = "#B19693",
        color = Color(0xFFB19693)
    )

    object jinzamomi_21 : NipponColor(
        id = "21",
        nameJp = "甚三紅",
        name = "jinzamomi",
        hex = "#EB7A77",
        color = Color(0xFFEB7A77)
    )

    object azuki_22 : NipponColor(
        id = "22",
        nameJp = "小豆",
        name = "azuki",
        hex = "#954A45",
        color = Color(0xFF954A45)
    )

    object suohkoh_23 : NipponColor(
        id = "23",
        nameJp = "蘇芳香",
        name = "suohkoh",
        hex = "#A96360",
        color = Color(0xFFA96360)
    )

    object akabeni_24 : NipponColor(
        id = "24",
        nameJp = "赤紅",
        name = "akabeni",
        hex = "#CB4042",
        color = Color(0xFFCB4042)
    )

    object shinsyu_25 : NipponColor(
        id = "25",
        nameJp = "真朱",
        name = "shinsyu",
        hex = "#AB3B3A",
        color = Color(0xFFAB3B3A)
    )

    object haizakura_26 : NipponColor(
        id = "26",
        nameJp = "灰桜",
        name = "haizakura",
        hex = "#D7C4BB",
        color = Color(0xFFD7C4BB)
    )

    object kuriume_27 : NipponColor(
        id = "27",
        nameJp = "栗梅",
        name = "kuriume",
        hex = "#904840",
        color = Color(0xFF904840)
    )

    object ebicha_28 : NipponColor(
        id = "28",
        nameJp = "海老茶",
        name = "ebicha",
        hex = "#734338",
        color = Color(0xFF734338)
    )

    object ginsyu_29 : NipponColor(
        id = "29",
        nameJp = "銀朱",
        name = "ginsyu",
        hex = "#C73E3A",
        color = Color(0xFFC73E3A)
    )

    object kurotobi_30 : NipponColor(
        id = "30",
        nameJp = "黒鳶",
        name = "kurotobi",
        hex = "#554236",
        color = Color(0xFF554236)
    )

    object benitobi_31 : NipponColor(
        id = "31",
        nameJp = "紅鳶",
        name = "benitobi",
        hex = "#994639",
        color = Color(0xFF994639)
    )

    object akebono_32 : NipponColor(
        id = "32",
        nameJp = "曙",
        name = "akebono",
        hex = "#F19483",
        color = Color(0xFFF19483)
    )

    object benikaba_33 : NipponColor(
        id = "33",
        nameJp = "紅樺",
        name = "benikaba",
        hex = "#B54434",
        color = Color(0xFFB54434)
    )

    object mizugaki_34 : NipponColor(
        id = "34",
        nameJp = "水がき",
        name = "mizugaki",
        hex = "#B9887D",
        color = Color(0xFFB9887D)
    )

    object sangosyu_35 : NipponColor(
        id = "35",
        nameJp = "珊瑚朱",
        name = "sangosyu",
        hex = "#F17C67",
        color = Color(0xFFF17C67)
    )

    object benihiwada_36 : NipponColor(
        id = "36",
        nameJp = "紅檜皮",
        name = "benihiwada",
        hex = "#884C3A",
        color = Color(0xFF884C3A)
    )

    object syojyohi_37 : NipponColor(
        id = "37",
        nameJp = "猩猩緋",
        name = "syojyohi",
        hex = "#E83015",
        color = Color(0xFFE83015)
    )

    object entan_38 : NipponColor(
        id = "38",
        nameJp = "鉛丹",
        name = "entan",
        hex = "#D75455",
        color = Color(0xFFD75455)
    )

    object shikancha_39 : NipponColor(
        id = "39",
        nameJp = "芝翫茶",
        name = "shikancha",
        hex = "#B55D4C",
        color = Color(0xFFB55D4C)
    )

    object hiwada_40 : NipponColor(
        id = "40",
        nameJp = "檜皮",
        name = "hiwada",
        hex = "#854836",
        color = Color(0xFF854836)
    )

    object kakishibu_41 : NipponColor(
        id = "41",
        nameJp = "柿渋",
        name = "kakishibu",
        hex = "#A35E47",
        color = Color(0xFFA35E47)
    )

    object ake_42 : NipponColor(
        id = "42",
        nameJp = "緋",
        name = "ake",
        hex = "#CC543A",
        color = Color(0xFFCC543A)
    )

    object tobi_43 : NipponColor(
        id = "43",
        nameJp = "鳶",
        name = "tobi",
        hex = "#724832",
        color = Color(0xFF724832)
    )

    object benihi_44 : NipponColor(
        id = "44",
        nameJp = "紅緋",
        name = "benihi",
        hex = "#F75C2F",
        color = Color(0xFFF75C2F)
    )

    object kurikawacha_45 : NipponColor(
        id = "45",
        nameJp = "栗皮茶",
        name = "kurikawacha",
        hex = "#6A4028",
        color = Color(0xFF6A4028)
    )

    object bengara_46 : NipponColor(
        id = "46",
        nameJp = "弁柄",
        name = "bengara",
        hex = "#9A5034",
        color = Color(0xFF9A5034)
    )

    object terigaki_47 : NipponColor(
        id = "47",
        nameJp = "照柿",
        name = "terigaki",
        hex = "#C46243",
        color = Color(0xFFC46243)
    )

    object edocha_48 : NipponColor(
        id = "48",
        nameJp = "江戸茶",
        name = "edocha",
        hex = "#AF5F3C",
        color = Color(0xFFAF5F3C)
    )

    object araisyu_49 : NipponColor(
        id = "49",
        nameJp = "洗朱",
        name = "araisyu",
        hex = "#FB966E",
        color = Color(0xFFFB966E)
    )

    object momoshiocha_50 : NipponColor(
        id = "50",
        nameJp = "百塩茶",
        name = "momoshiocha",
        hex = "#724938",
        color = Color(0xFF724938)
    )

    object karacha_51 : NipponColor(
        id = "51",
        nameJp = "唐茶",
        name = "karacha",
        hex = "#B47157",
        color = Color(0xFFB47157)
    )

    object tokigaracha_52 : NipponColor(
        id = "52",
        nameJp = "ときがら茶",
        name = "tokigaracha",
        hex = "#DB8E71",
        color = Color(0xFFDB8E71)
    )

    object ohni_53 : NipponColor(
        id = "53",
        nameJp = "黄丹",
        name = "ohni",
        hex = "#F05E1C",
        color = Color(0xFFF05E1C)
    )

    object sohi_54 : NipponColor(
        id = "54",
        nameJp = "纁",
        name = "sohi",
        hex = "#ED784A",
        color = Color(0xFFED784A)
    )

    object ensyucha_55 : NipponColor(
        id = "55",
        nameJp = "遠州茶",
        name = "ensyucha",
        hex = "#CA7853",
        color = Color(0xFFCA7853)
    )

    object kabacha_56 : NipponColor(
        id = "56",
        nameJp = "樺茶",
        name = "kabacha",
        hex = "#B35C37",
        color = Color(0xFFB35C37)
    )

    object kogecha_57 : NipponColor(
        id = "57",
        nameJp = "焦茶",
        name = "kogecha",
        hex = "#563F2E",
        color = Color(0xFF563F2E)
    )

    object akakoh_58 : NipponColor(
        id = "58",
        nameJp = "赤香",
        name = "akakoh",
        hex = "#E3916E",
        color = Color(0xFFE3916E)
    )

    object suzumecha_59 : NipponColor(
        id = "59",
        nameJp = "雀茶",
        name = "suzumecha",
        hex = "#8F5A3C",
        color = Color(0xFF8F5A3C)
    )

    object shishi_60 : NipponColor(
        id = "60",
        nameJp = "宍",
        name = "shishi",
        hex = "#F0A986",
        color = Color(0xFFF0A986)
    )

    object sodenkaracha_61 : NipponColor(
        id = "61",
        nameJp = "宗伝唐茶",
        name = "sodenkaracha",
        hex = "#A0674B",
        color = Color(0xFFA0674B)
    )

    object kaba_62 : NipponColor(
        id = "62",
        nameJp = "樺",
        name = "kaba",
        hex = "#c1693c",
        color = Color(0xFFc1693c)
    )

    object kokikuchinashi_63 : NipponColor(
        id = "63",
        nameJp = "深支子",
        name = "kokikuchinashi",
        hex = "#FB9966",
        color = Color(0xFFFB9966)
    )

    object kurumi_64 : NipponColor(
        id = "64",
        nameJp = "胡桃",
        name = "kurumi",
        hex = "#947A6D",
        color = Color(0xFF947A6D)
    )

    object taisya_65 : NipponColor(
        id = "65",
        nameJp = "代赭",
        name = "taisya",
        hex = "#A36336",
        color = Color(0xFFA36336)
    )

    object araigaki_66 : NipponColor(
        id = "66",
        nameJp = "洗柿",
        name = "araigaki",
        hex = "#E79460",
        color = Color(0xFFE79460)
    )

    object kohrozen_67 : NipponColor(
        id = "67",
        nameJp = "黄櫨染",
        name = "kohrozen",
        hex = "#7D532C",
        color = Color(0xFF7D532C)
    )

    object akakuchiba_68 : NipponColor(
        id = "68",
        nameJp = "赤朽葉",
        name = "akakuchiba",
        hex = "#C78550",
        color = Color(0xFFC78550)
    )

    object tonocha_69 : NipponColor(
        id = "69",
        nameJp = "礪茶",
        name = "tonocha",
        hex = "#985F2A",
        color = Color(0xFF985F2A)
    )

    object akashiritsurubami_70 : NipponColor(
        id = "70",
        nameJp = "赤白橡",
        name = "akashiritsurubami",
        hex = "#E1A679",
        color = Color(0xFFE1A679)
    )

    object sencha_71 : NipponColor(
        id = "71",
        nameJp = "煎茶",
        name = "sencha",
        hex = "#855B32",
        color = Color(0xFF855B32)
    )

    object kanzo_72 : NipponColor(
        id = "72",
        nameJp = "萱草",
        name = "kanzo",
        hex = "#FC9F4D",
        color = Color(0xFFFC9F4D)
    )

    object sharegaki_73 : NipponColor(
        id = "73",
        nameJp = "洒落柿",
        name = "sharegaki",
        hex = "#FFBA84",
        color = Color(0xFFFFBA84)
    )

    object beniukon_74 : NipponColor(
        id = "74",
        nameJp = "紅鬱金",
        name = "beniukon",
        hex = "#E98B2A",
        color = Color(0xFFE98B2A)
    )

    object umezome_75 : NipponColor(
        id = "75",
        nameJp = "梅染",
        name = "umezome",
        hex = "#E9A368",
        color = Color(0xFFE9A368)
    )

    object biwacha_76 : NipponColor(
        id = "76",
        nameJp = "枇杷茶",
        name = "biwacha",
        hex = "#B17844",
        color = Color(0xFFB17844)
    )

    object chojicha_77 : NipponColor(
        id = "77",
        nameJp = "丁子茶",
        name = "chojicha",
        hex = "#96632E",
        color = Color(0xFF96632E)
    )

    object kenpohzome_78 : NipponColor(
        id = "78",
        nameJp = "憲法染",
        name = "kenpohzome",
        hex = "#43341B",
        color = Color(0xFF43341B)
    )

    object kohaku_79 : NipponColor(
        id = "79",
        nameJp = "琥珀",
        name = "kohaku",
        hex = "#CA7A2C",
        color = Color(0xFFCA7A2C)
    )

    object usugaki_80 : NipponColor(
        id = "80",
        nameJp = "薄柿",
        name = "usugaki",
        hex = "#ECB88A",
        color = Color(0xFFECB88A)
    )

    object kyara_81 : NipponColor(
        id = "81",
        nameJp = "伽羅",
        name = "kyara",
        hex = "#78552B",
        color = Color(0xFF78552B)
    )

    object chojizome_82 : NipponColor(
        id = "82",
        nameJp = "丁子染",
        name = "chojizome",
        hex = "#B07736",
        color = Color(0xFFB07736)
    )

    object FUSHIZOME_83 : NipponColor(
        id = "83",
        nameJp = "柴染",
        name = "FUSHIZOME",
        hex = "#967249",
        color = Color(0xFF967249)
    )

    object KUCHIBA_84 : NipponColor(
        id = "84",
        nameJp = "朽葉",
        name = "KUCHIBA",
        hex = "#E2943B",
        color = Color(0xFFE2943B)
    )

    object KINCHA_85 : NipponColor(
        id = "85",
        nameJp = "金茶",
        name = "KINCHA",
        hex = "#C7802D",
        color = Color(0xFFC7802D)
    )

    object KITSUNE_86 : NipponColor(
        id = "86",
        nameJp = "狐",
        name = "KITSUNE",
        hex = "#9B6E23",
        color = Color(0xFF9B6E23)
    )

    object SUSUTAKE_87 : NipponColor(
        id = "87",
        nameJp = "煤竹",
        name = "SUSUTAKE",
        hex = "#6E552F",
        color = Color(0xFF6E552F)
    )

    object USUKOH_88 : NipponColor(
        id = "88",
        nameJp = "薄香",
        name = "USUKOH",
        hex = "#EBB471",
        color = Color(0xFFEBB471)
    )

    object TONOKO_89 : NipponColor(
        id = "89",
        nameJp = "砥粉",
        name = "TONOKO",
        hex = "#D7B98E",
        color = Color(0xFFD7B98E)
    )

    object GINSUSUTAKE_90 : NipponColor(
        id = "90",
        nameJp = "銀煤竹",
        name = "GINSUSUTAKE",
        hex = "#82663A",
        color = Color(0xFF82663A)
    )

    object OHDO_91 : NipponColor(
        id = "91",
        nameJp = "黄土",
        name = "OHDO",
        hex = "#B68E55",
        color = Color(0xFFB68E55)
    )

    object SHIRACHA_92 : NipponColor(
        id = "92",
        nameJp = "白茶",
        name = "SHIRACHA",
        hex = "#BC9F77",
        color = Color(0xFFBC9F77)
    )

    object KOBICHA_93 : NipponColor(
        id = "93",
        nameJp = "媚茶",
        name = "KOBICHA",
        hex = "#876633",
        color = Color(0xFF876633)
    )

    object KIGARACHA_94 : NipponColor(
        id = "94",
        nameJp = "黄唐茶",
        name = "KIGARACHA",
        hex = "#C18A26",
        color = Color(0xFFC18A26)
    )

    object YAMABUKI_95 : NipponColor(
        id = "95",
        nameJp = "山吹",
        name = "YAMABUKI",
        hex = "#FFB11B",
        color = Color(0xFFFFB11B)
    )

    object YAMABUKICHA_96 : NipponColor(
        id = "96",
        nameJp = "山吹茶",
        name = "YAMABUKICHA",
        hex = "#D19826",
        color = Color(0xFFD19826)
    )

    object HAJIZOME_97 : NipponColor(
        id = "97",
        nameJp = "櫨染",
        name = "HAJIZOME",
        hex = "#DDA52D",
        color = Color(0xFFDDA52D)
    )

    object KUWACHA_98 : NipponColor(
        id = "98",
        nameJp = "桑茶",
        name = "KUWACHA",
        hex = "#C99833",
        color = Color(0xFFC99833)
    )

    object TAMAGO_99 : NipponColor(
        id = "99",
        nameJp = "玉子",
        name = "TAMAGO",
        hex = "#F9BF45",
        color = Color(0xFFF9BF45)
    )

    object SHIROTSURUBAMI_100 : NipponColor(
        id = "100",
        nameJp = "白橡",
        name = "SHIROTSURUBAMI",
        hex = "#DCB879",
        color = Color(0xFFDCB879)
    )

    object KITSURUBAMI_101 : NipponColor(
        id = "101",
        nameJp = "黄橡",
        name = "KITSURUBAMI",
        hex = "#BA9132",
        color = Color(0xFFBA9132)
    )

    object TAMAMOROKOSHI_102 : NipponColor(
        id = "102",
        nameJp = "玉蜀黍",
        name = "TAMAMOROKOSHI",
        hex = "#E8B647",
        color = Color(0xFFE8B647)
    )

    object HANABA_103 : NipponColor(
        id = "103",
        nameJp = "花葉",
        name = "HANABA",
        hex = "#F7C242",
        color = Color(0xFFF7C242)
    )

    object NAMAKABE_104 : NipponColor(
        id = "104",
        nameJp = "生壁",
        name = "NAMAKABE",
        hex = "#7D6C46",
        color = Color(0xFF7D6C46)
    )

    object TORINOKO_105 : NipponColor(
        id = "105",
        nameJp = "鳥の子",
        name = "TORINOKO",
        hex = "#DAC9A6",
        color = Color(0xFFDAC9A6)
    )

    object USUKI_106 : NipponColor(
        id = "106",
        nameJp = "浅黄",
        name = "USUKI",
        hex = "#FAD689",
        color = Color(0xFFFAD689)
    )

    object KIKUCHIBA_107 : NipponColor(
        id = "107",
        nameJp = "黄朽葉",
        name = "KIKUCHIBA",
        hex = "#D9AB42",
        color = Color(0xFFD9AB42)
    )

    object KUCHINASHI_108 : NipponColor(
        id = "108",
        nameJp = "梔子",
        name = "KUCHINASHI",
        hex = "#F6C555",
        color = Color(0xFFF6C555)
    )

    object TOHOH_109 : NipponColor(
        id = "109",
        nameJp = "籐黄",
        name = "TOHOH",
        hex = "#FFC408",
        color = Color(0xFFFFC408)
    )

    object UKON_110 : NipponColor(
        id = "110",
        nameJp = "鬱金",
        name = "UKON",
        hex = "#EFBB24",
        color = Color(0xFFEFBB24)
    )

    object KARASHI_111 : NipponColor(
        id = "111",
        nameJp = "芥子",
        name = "KARASHI",
        hex = "#CAAD5F",
        color = Color(0xFFCAAD5F)
    )

    object HIGOSUSUTAKE_112 : NipponColor(
        id = "112",
        nameJp = "肥後煤竹",
        name = "HIGOSUSUTAKE",
        hex = "#8D742A",
        color = Color(0xFF8D742A)
    )

    object RIKYUSHIRACHA_113 : NipponColor(
        id = "113",
        nameJp = "利休白茶",
        name = "RIKYUSHIRACHA",
        hex = "#B4A582",
        color = Color(0xFFB4A582)
    )

    object AKU_114 : NipponColor(
        id = "114",
        nameJp = "灰汁",
        name = "AKU",
        hex = "#877F6C",
        color = Color(0xFF877F6C)
    )

    object RIKYUCHA_115 : NipponColor(
        id = "115",
        nameJp = "利休茶",
        name = "RIKYUCHA",
        hex = "#897D55",
        color = Color(0xFF897D55)
    )

    object ROKOHCHA_116 : NipponColor(
        id = "116",
        nameJp = "路考茶",
        name = "ROKOHCHA",
        hex = "#74673E",
        color = Color(0xFF74673E)
    )

    object NATANEYU_117 : NipponColor(
        id = "117",
        nameJp = "菜種油",
        name = "NATANEYU",
        hex = "#A28C37",
        color = Color(0xFFA28C37)
    )

    object UGUISUCHA_118 : NipponColor(
        id = "118",
        nameJp = "鶯茶",
        name = "UGUISUCHA",
        hex = "#6C6024",
        color = Color(0xFF6C6024)
    )

    object KIMIRUCHA_119 : NipponColor(
        id = "119",
        nameJp = "黄海松茶",
        name = "KIMIRUCHA",
        hex = "#867835",
        color = Color(0xFF867835)
    )

    object MIRUCHA_120 : NipponColor(
        id = "120",
        nameJp = "海松茶",
        name = "MIRUCHA",
        hex = "#62592C",
        color = Color(0xFF62592C)
    )

    object KARIYASU_121 : NipponColor(
        id = "121",
        nameJp = "刈安",
        name = "KARIYASU",
        hex = "#E9CD4C",
        color = Color(0xFFE9CD4C)
    )

    object NANOHANA_122 : NipponColor(
        id = "122",
        nameJp = "菜の花",
        name = "NANOHANA",
        hex = "#F7D94C",
        color = Color(0xFFF7D94C)
    )

    object KIHADA_123 : NipponColor(
        id = "123",
        nameJp = "黄蘗",
        name = "KIHADA",
        hex = "#FBE251",
        color = Color(0xFFFBE251)
    )

    object MUSHIKURI_124 : NipponColor(
        id = "124",
        nameJp = "蒸栗",
        name = "MUSHIKURI",
        hex = "#D9CD90",
        color = Color(0xFFD9CD90)
    )

    object AOKUCHIBA_125 : NipponColor(
        id = "125",
        nameJp = "青朽葉",
        name = "AOKUCHIBA",
        hex = "#ADA142",
        color = Color(0xFFADA142)
    )

    object OMINAESHI_126 : NipponColor(
        id = "126",
        nameJp = "女郎花",
        name = "OMINAESHI",
        hex = "#DDD23B",
        color = Color(0xFFDDD23B)
    )

    object HIWACHA_127 : NipponColor(
        id = "127",
        nameJp = "鶸茶",
        name = "HIWACHA",
        hex = "#A5A051",
        color = Color(0xFFA5A051)
    )

    object HIWA_128 : NipponColor(
        id = "128",
        nameJp = "鶸",
        name = "HIWA",
        hex = "#BEC23F",
        color = Color(0xFFBEC23F)
    )

    object UGUISU_129 : NipponColor(
        id = "129",
        nameJp = "鶯",
        name = "UGUISU",
        hex = "#6C6A2D",
        color = Color(0xFF6C6A2D)
    )

    object YANAGICHA_130 : NipponColor(
        id = "130",
        nameJp = "柳茶",
        name = "YANAGICHA",
        hex = "#939650",
        color = Color(0xFF939650)
    )

    object KOKE_131 : NipponColor(
        id = "131",
        nameJp = "苔",
        name = "KOKE",
        hex = "#838A2D",
        color = Color(0xFF838A2D)
    )

    object KIKUJIN_132 : NipponColor(
        id = "132",
        nameJp = "麹塵",
        name = "KIKUJIN",
        hex = "#B1B479",
        color = Color(0xFFB1B479)
    )

    object RIKANCHA_133 : NipponColor(
        id = "133",
        nameJp = "璃寛茶",
        name = "RIKANCHA",
        hex = "#616138",
        color = Color(0xFF616138)
    )

    object AIKOBICHA_134 : NipponColor(
        id = "134",
        nameJp = "藍媚茶",
        name = "AIKOBICHA",
        hex = "#4B4E2A",
        color = Color(0xFF4B4E2A)
    )

    object MIRU_135 : NipponColor(
        id = "135",
        nameJp = "海松",
        name = "MIRU",
        hex = "#5B622E",
        color = Color(0xFF5B622E)
    )

    object SENSAICHA_136 : NipponColor(
        id = "136",
        nameJp = "千歳茶",
        name = "SENSAICHA",
        hex = "#4D5139",
        color = Color(0xFF4D5139)
    )

    object BAIKOCHA_137 : NipponColor(
        id = "137",
        nameJp = "梅幸茶",
        name = "BAIKOCHA",
        hex = "#89916B",
        color = Color(0xFF89916B)
    )

    object HIWAMOEGI_138 : NipponColor(
        id = "138",
        nameJp = "鶸萌黄",
        name = "HIWAMOEGI",
        hex = "#90B44B",
        color = Color(0xFF90B44B)
    )

    object YANAGIZOME_139 : NipponColor(
        id = "139",
        nameJp = "柳染",
        name = "YANAGIZOME",
        hex = "#91AD70",
        color = Color(0xFF91AD70)
    )

    object URAYANAGI_140 : NipponColor(
        id = "140",
        nameJp = "裏柳",
        name = "URAYANAGI",
        hex = "#B5CAA0",
        color = Color(0xFFB5CAA0)
    )

    object IWAICHA_141 : NipponColor(
        id = "141",
        nameJp = "岩井茶",
        name = "IWAICHA",
        hex = "#646A58",
        color = Color(0xFF646A58)
    )

    object MOEGI_142 : NipponColor(
        id = "142",
        nameJp = "萌黄",
        name = "MOEGI",
        hex = "#7BA23F",
        color = Color(0xFF7BA23F)
    )

    object NAE_143 : NipponColor(
        id = "143",
        nameJp = "苗",
        name = "NAE",
        hex = "#86C166",
        color = Color(0xFF86C166)
    )

    object YANAGISUSUTAKE_144 : NipponColor(
        id = "144",
        nameJp = "柳煤竹",
        name = "YANAGISUSUTAKE",
        hex = "#4A593D",
        color = Color(0xFF4A593D)
    )

    object MATSUBA_145 : NipponColor(
        id = "145",
        nameJp = "松葉",
        name = "MATSUBA",
        hex = "#42602D",
        color = Color(0xFF42602D)
    )

    object AONI_146 : NipponColor(
        id = "146",
        nameJp = "青丹",
        name = "AONI",
        hex = "#516E41",
        color = Color(0xFF516E41)
    )

    object USUAO_147 : NipponColor(
        id = "147",
        nameJp = "薄青",
        name = "USUAO",
        hex = "#91B493",
        color = Color(0xFF91B493)
    )

    object YANAGINEZUMI_148 : NipponColor(
        id = "148",
        nameJp = "柳鼠",
        name = "YANAGINEZUMI",
        hex = "#808F7C",
        color = Color(0xFF808F7C)
    )

    object TOKIWA_149 : NipponColor(
        id = "149",
        nameJp = "常磐",
        name = "TOKIWA",
        hex = "#1B813E",
        color = Color(0xFF1B813E)
    )

    object WAKATAKE_150 : NipponColor(
        id = "150",
        nameJp = "若竹",
        name = "WAKATAKE",
        hex = "#5DAC81",
        color = Color(0xFF5DAC81)
    )

    object CHITOSEMIDORI_151 : NipponColor(
        id = "151",
        nameJp = "千歳緑",
        name = "CHITOSEMIDORI",
        hex = "#36563C",
        color = Color(0xFF36563C)
    )

    object MIDORI_152 : NipponColor(
        id = "152",
        nameJp = "緑",
        name = "MIDORI",
        hex = "#227D51",
        color = Color(0xFF227D51)
    )

    object BYAKUROKU_153 : NipponColor(
        id = "153",
        nameJp = "白緑",
        name = "BYAKUROKU",
        hex = "#A8D8B9",
        color = Color(0xFFA8D8B9)
    )

    object OITAKE_154 : NipponColor(
        id = "154",
        nameJp = "老竹",
        name = "OITAKE",
        hex = "#6A8372",
        color = Color(0xFF6A8372)
    )

    object TOKUSA_155 : NipponColor(
        id = "155",
        nameJp = "木賊",
        name = "TOKUSA",
        hex = "#2D6D4B",
        color = Color(0xFF2D6D4B)
    )

    object ONANDOCHA_156 : NipponColor(
        id = "156",
        nameJp = "御納戸茶",
        name = "ONANDOCHA",
        hex = "#465D4C",
        color = Color(0xFF465D4C)
    )

    object ROKUSYOH_157 : NipponColor(
        id = "157",
        nameJp = "緑青",
        name = "ROKUSYOH",
        hex = "#24936E",
        color = Color(0xFF24936E)
    )

    object SABISEIJI_158 : NipponColor(
        id = "158",
        nameJp = "錆青磁",
        name = "SABISEIJI",
        hex = "#86A697",
        color = Color(0xFF86A697)
    )

    object AOTAKE_159 : NipponColor(
        id = "159",
        nameJp = "青竹",
        name = "AOTAKE",
        hex = "#00896C",
        color = Color(0xFF00896C)
    )

    object VELUDO_160 : NipponColor(
        id = "160",
        nameJp = "ビロード",
        name = "VELUDO",
        hex = "#096148",
        color = Color(0xFF096148)
    )

    object MUSHIAO_161 : NipponColor(
        id = "161",
        nameJp = "虫襖",
        name = "MUSHIAO",
        hex = "#20604F",
        color = Color(0xFF20604F)
    )

    object AIMIRUCHA_162 : NipponColor(
        id = "162",
        nameJp = "藍海松茶",
        name = "AIMIRUCHA",
        hex = "#0F4C3A",
        color = Color(0xFF0F4C3A)
    )

    object TONOCHA2_163 : NipponColor(
        id = "163",
        nameJp = "沈香茶",
        name = "TONOCHA2",
        hex = "#4F726C",
        color = Color(0xFF4F726C)
    )

    object AOMIDORI_164 : NipponColor(
        id = "164",
        nameJp = "青緑",
        name = "AOMIDORI",
        hex = "#00AA90",
        color = Color(0xFF00AA90)
    )

    object SEIJI_165 : NipponColor(
        id = "165",
        nameJp = "青磁",
        name = "SEIJI",
        hex = "#69B0AC",
        color = Color(0xFF69B0AC)
    )

    object TETSU_166 : NipponColor(
        id = "166",
        nameJp = "鉄",
        name = "TETSU",
        hex = "#26453D",
        color = Color(0xFF26453D)
    )

    object MIZUASAGI_167 : NipponColor(
        id = "167",
        nameJp = "水浅葱",
        name = "MIZUASAGI",
        hex = "#66BAB7",
        color = Color(0xFF66BAB7)
    )

    object SEIHEKI_168 : NipponColor(
        id = "168",
        nameJp = "青碧",
        name = "SEIHEKI",
        hex = "#268785",
        color = Color(0xFF268785)
    )

    object SABITETSUONANDO_169 : NipponColor(
        id = "169",
        nameJp = "錆鉄御納戸",
        name = "SABITETSUONANDO",
        hex = "#405B55",
        color = Color(0xFF405B55)
    )

    object KORAINANDO_170 : NipponColor(
        id = "170",
        nameJp = "高麗納戸",
        name = "KORAINANDO",
        hex = "#305A56",
        color = Color(0xFF305A56)
    )

    object BYAKUGUN_171 : NipponColor(
        id = "171",
        nameJp = "白群",
        name = "BYAKUGUN",
        hex = "#78C2C4",
        color = Color(0xFF78C2C4)
    )

    object OMESHICHA_172 : NipponColor(
        id = "172",
        nameJp = "御召茶",
        name = "OMESHICHA",
        hex = "#376B6D",
        color = Color(0xFF376B6D)
    )

    object KAMENOZOKI_173 : NipponColor(
        id = "173",
        nameJp = "瓶覗",
        name = "KAMENOZOKI",
        hex = "#A5DEE4",
        color = Color(0xFFA5DEE4)
    )

    object FUKAGAWANEZUMI_174 : NipponColor(
        id = "174",
        nameJp = "深川鼠",
        name = "FUKAGAWANEZUMI",
        hex = "#77969A",
        color = Color(0xFF77969A)
    )

    object SABIASAGI_175 : NipponColor(
        id = "175",
        nameJp = "錆浅葱",
        name = "SABIASAGI",
        hex = "#6699A1",
        color = Color(0xFF6699A1)
    )

    object MIZU_176 : NipponColor(
        id = "176",
        nameJp = "水",
        name = "MIZU",
        hex = "#81C7D4",
        color = Color(0xFF81C7D4)
    )

    object ASAGI_177 : NipponColor(
        id = "177",
        nameJp = "浅葱",
        name = "ASAGI",
        hex = "#33A6B8",
        color = Color(0xFF33A6B8)
    )

    object ONANDO_178 : NipponColor(
        id = "178",
        nameJp = "御納戸",
        name = "ONANDO",
        hex = "#0C4842",
        color = Color(0xFF0C4842)
    )

    object AI_179 : NipponColor(
        id = "179",
        nameJp = "藍",
        name = "AI",
        hex = "#0D5661",
        color = Color(0xFF0D5661)
    )

    object SHINBASHI_180 : NipponColor(
        id = "180",
        nameJp = "新橋",
        name = "SHINBASHI",
        hex = "#0089A7",
        color = Color(0xFF0089A7)
    )

    object SABIONANDO_181 : NipponColor(
        id = "181",
        nameJp = "錆御納戸",
        name = "SABIONANDO",
        hex = "#336774",
        color = Color(0xFF336774)
    )

    object TETSUONANDO_182 : NipponColor(
        id = "182",
        nameJp = "鉄御納戸",
        name = "TETSUONANDO",
        hex = "#255359",
        color = Color(0xFF255359)
    )

    object HANAASAGI_183 : NipponColor(
        id = "183",
        nameJp = "花浅葱",
        name = "HANAASAGI",
        hex = "#1E88A8",
        color = Color(0xFF1E88A8)
    )

    object AINEZUMI_184 : NipponColor(
        id = "184",
        nameJp = "藍鼠",
        name = "AINEZUMI",
        hex = "#566C73",
        color = Color(0xFF566C73)
    )

    object MASUHANA_185 : NipponColor(
        id = "185",
        nameJp = "舛花",
        name = "MASUHANA",
        hex = "#577C8A",
        color = Color(0xFF577C8A)
    )

    object SORA_186 : NipponColor(
        id = "186",
        nameJp = "空",
        name = "SORA",
        hex = "#58B2DC",
        color = Color(0xFF58B2DC)
    )

    object NOSHIMEHANA_187 : NipponColor(
        id = "187",
        nameJp = "熨斗目花",
        name = "NOSHIMEHANA",
        hex = "#2B5F75",
        color = Color(0xFF2B5F75)
    )

    object CHIGUSA_188 : NipponColor(
        id = "188",
        nameJp = "千草",
        name = "CHIGUSA",
        hex = "#3A8FB7",
        color = Color(0xFF3A8FB7)
    )

    object OMESHIONANDO_189 : NipponColor(
        id = "189",
        nameJp = "御召御納戸",
        name = "OMESHIONANDO",
        hex = "#2E5C6E",
        color = Color(0xFF2E5C6E)
    )

    object HANADA_190 : NipponColor(
        id = "190",
        nameJp = "縹",
        name = "HANADA",
        hex = "#006284",
        color = Color(0xFF006284)
    )

    object WASURENAGUSA_191 : NipponColor(
        id = "191",
        nameJp = "勿忘草",
        name = "WASURENAGUSA",
        hex = "#7DB9DE",
        color = Color(0xFF7DB9DE)
    )

    object GUNJYO_192 : NipponColor(
        id = "192",
        nameJp = "群青",
        name = "GUNJYO",
        hex = "#51A8DD",
        color = Color(0xFF51A8DD)
    )

    object TSUYUKUSA_193 : NipponColor(
        id = "193",
        nameJp = "露草",
        name = "TSUYUKUSA",
        hex = "#2EA9DF",
        color = Color(0xFF2EA9DF)
    )

    object KUROTSURUBAMI_194 : NipponColor(
        id = "194",
        nameJp = "黒橡",
        name = "KUROTSURUBAMI",
        hex = "#0B1013",
        color = Color(0xFF0B1013)
    )

    object KON_195 : NipponColor(
        id = "195",
        nameJp = "紺",
        name = "KON",
        hex = "#0F2540",
        color = Color(0xFF0F2540)
    )

    object KACHI_196 : NipponColor(
        id = "196",
        nameJp = "褐",
        name = "KACHI",
        hex = "#08192D",
        color = Color(0xFF08192D)
    )

    object RURI_197 : NipponColor(
        id = "197",
        nameJp = "瑠璃",
        name = "RURI",
        hex = "#005CAF",
        color = Color(0xFF005CAF)
    )

    object RURIKON_198 : NipponColor(
        id = "198",
        nameJp = "瑠璃紺",
        name = "RURIKON",
        hex = "#0B346E",
        color = Color(0xFF0B346E)
    )

    object BENIMIDORI_199 : NipponColor(
        id = "199",
        nameJp = "紅碧",
        name = "BENIMIDORI",
        hex = "#7B90D2",
        color = Color(0xFF7B90D2)
    )

    object FUJINEZUMI_200 : NipponColor(
        id = "200",
        nameJp = "藤鼠",
        name = "FUJINEZUMI",
        hex = "#6E75A4",
        color = Color(0xFF6E75A4)
    )

    object TETSUKON_201 : NipponColor(
        id = "201",
        nameJp = "鉄紺",
        name = "TETSUKON",
        hex = "#261E47",
        color = Color(0xFF261E47)
    )

    object KONJYO_202 : NipponColor(
        id = "202",
        nameJp = "紺青",
        name = "KONJYO",
        hex = "#113285",
        color = Color(0xFF113285)
    )

    object BENIKAKEHANA_203 : NipponColor(
        id = "203",
        nameJp = "紅掛花",
        name = "BENIKAKEHANA",
        hex = "#4E4F97",
        color = Color(0xFF4E4F97)
    )

    object KONKIKYO_204 : NipponColor(
        id = "204",
        nameJp = "紺桔梗",
        name = "KONKIKYO",
        hex = "#211E55",
        color = Color(0xFF211E55)
    )

    object FUJI_205 : NipponColor(
        id = "205",
        nameJp = "藤",
        name = "FUJI",
        hex = "#8B81C3",
        color = Color(0xFF8B81C3)
    )

    object FUTAAI_206 : NipponColor(
        id = "206",
        nameJp = "二藍",
        name = "FUTAAI",
        hex = "#70649A",
        color = Color(0xFF70649A)
    )

    object OUCHI_207 : NipponColor(
        id = "207",
        nameJp = "楝",
        name = "OUCHI",
        hex = "#9B90C2",
        color = Color(0xFF9B90C2)
    )

    object FUJIMURASAKI_208 : NipponColor(
        id = "208",
        nameJp = "藤紫",
        name = "FUJIMURASAKI",
        hex = "#8A6BBE",
        color = Color(0xFF8A6BBE)
    )

    object KIKYO_209 : NipponColor(
        id = "209",
        nameJp = "桔梗",
        name = "KIKYO",
        hex = "#6A4C9C",
        color = Color(0xFF6A4C9C)
    )

    object SHION_210 : NipponColor(
        id = "210",
        nameJp = "紫苑",
        name = "SHION",
        hex = "#8F77B5",
        color = Color(0xFF8F77B5)
    )

    object MESSHI_211 : NipponColor(
        id = "211",
        nameJp = "滅紫",
        name = "MESSHI",
        hex = "#533D5B",
        color = Color(0xFF533D5B)
    )

    object USU_212 : NipponColor(
        id = "212",
        nameJp = "薄",
        name = "USU",
        hex = "#B28FCE",
        color = Color(0xFFB28FCE)
    )

    object HASHITA_213 : NipponColor(
        id = "213",
        nameJp = "半",
        name = "HASHITA",
        hex = "#986DB2",
        color = Color(0xFF986DB2)
    )

    object EDOMURASAKI_214 : NipponColor(
        id = "214",
        nameJp = "江戸紫",
        name = "EDOMURASAKI",
        hex = "#77428D",
        color = Color(0xFF77428D)
    )

    object SHIKON_215 : NipponColor(
        id = "215",
        nameJp = "紫紺",
        name = "SHIKON",
        hex = "#3C2F41",
        color = Color(0xFF3C2F41)
    )

    object KOKIMURASAKI_216 : NipponColor(
        id = "216",
        nameJp = "深紫",
        name = "KOKIMURASAKI",
        hex = "#4A225D",
        color = Color(0xFF4A225D)
    )

    object SUMIRE_217 : NipponColor(
        id = "217",
        nameJp = "菫",
        name = "SUMIRE",
        hex = "#66327C",
        color = Color(0xFF66327C)
    )

    object MURASAKI_218 : NipponColor(
        id = "218",
        nameJp = "紫",
        name = "MURASAKI",
        hex = "#592C63",
        color = Color(0xFF592C63)
    )

    object AYAME_219 : NipponColor(
        id = "219",
        nameJp = "菖蒲",
        name = "AYAME",
        hex = "#6F3381",
        color = Color(0xFF6F3381)
    )

    object FUJISUSUTAKE_220 : NipponColor(
        id = "220",
        nameJp = "藤煤竹",
        name = "FUJISUSUTAKE",
        hex = "#574C57",
        color = Color(0xFF574C57)
    )

    object BENIFUJI_221 : NipponColor(
        id = "221",
        nameJp = "紅藤",
        name = "BENIFUJI",
        hex = "#B481BB",
        color = Color(0xFFB481BB)
    )

    object KUROBENI_222 : NipponColor(
        id = "222",
        nameJp = "黒紅",
        name = "KUROBENI",
        hex = "#3F2B36",
        color = Color(0xFF3F2B36)
    )

    object NASUKON_223 : NipponColor(
        id = "223",
        nameJp = "茄子紺",
        name = "NASUKON",
        hex = "#572A3F",
        color = Color(0xFF572A3F)
    )

    object BUDOHNEZUMI_224 : NipponColor(
        id = "224",
        nameJp = "葡萄鼠",
        name = "BUDOHNEZUMI",
        hex = "#5E3D50",
        color = Color(0xFF5E3D50)
    )

    object HATOBANEZUMI_225 : NipponColor(
        id = "225",
        nameJp = "鳩羽鼠",
        name = "HATOBANEZUMI",
        hex = "#72636E",
        color = Color(0xFF72636E)
    )

    object KAKITSUBATA_226 : NipponColor(
        id = "226",
        nameJp = "杜若",
        name = "KAKITSUBATA",
        hex = "#622954",
        color = Color(0xFF622954)
    )

    object EBIZOME_227 : NipponColor(
        id = "227",
        nameJp = "蒲葡",
        name = "EBIZOME",
        hex = "#6D2E5B",
        color = Color(0xFF6D2E5B)
    )

    object BOTAN_228 : NipponColor(
        id = "228",
        nameJp = "牡丹",
        name = "BOTAN",
        hex = "#C1328E",
        color = Color(0xFFC1328E)
    )

    object UMEMURASAKI_229 : NipponColor(
        id = "229",
        nameJp = "梅紫",
        name = "UMEMURASAKI",
        hex = "#A8497A",
        color = Color(0xFFA8497A)
    )

    object NISEMURASAKI_230 : NipponColor(
        id = "230",
        nameJp = "似紫",
        name = "NISEMURASAKI",
        hex = "#562E37",
        color = Color(0xFF562E37)
    )

    object TSUTSUJI_231 : NipponColor(
        id = "231",
        nameJp = "躑躅",
        name = "TSUTSUJI",
        hex = "#E03C8A",
        color = Color(0xFFE03C8A)
    )

    object MURASAKITOBI_232 : NipponColor(
        id = "232",
        nameJp = "紫鳶",
        name = "MURASAKITOBI",
        hex = "#60373E",
        color = Color(0xFF60373E)
    )

    object SHIRONERI_233 : NipponColor(
        id = "233",
        nameJp = "白練",
        name = "SHIRONERI",
        hex = "#FCFAF2",
        color = Color(0xFFFCFAF2)
    )

    object GOFUN_234 : NipponColor(
        id = "234",
        nameJp = "胡粉",
        name = "GOFUN",
        hex = "#FFFFFB",
        color = Color(0xFFFFFFFB)
    )

    object SHIRONEZUMI_235 : NipponColor(
        id = "235",
        nameJp = "白鼠",
        name = "SHIRONEZUMI",
        hex = "#BDC0BA",
        color = Color(0xFFBDC0BA)
    )

    object GINNEZUMI_236 : NipponColor(
        id = "236",
        nameJp = "銀鼠",
        name = "GINNEZUMI",
        hex = "#91989F",
        color = Color(0xFF91989F)
    )

    object NAMARI_237 : NipponColor(
        id = "237",
        nameJp = "鉛",
        name = "NAMARI",
        hex = "#787878",
        color = Color(0xFF787878)
    )

    object HAI_238 : NipponColor(
        id = "238",
        nameJp = "灰",
        name = "HAI",
        hex = "#828282",
        color = Color(0xFF828282)
    )

    object SUNEZUMI_239 : NipponColor(
        id = "239",
        nameJp = "素鼠",
        name = "SUNEZUMI",
        hex = "#787D7B",
        color = Color(0xFF787D7B)
    )

    object RIKYUNEZUMI_240 : NipponColor(
        id = "240",
        nameJp = "利休鼠",
        name = "RIKYUNEZUMI",
        hex = "#707C74",
        color = Color(0xFF707C74)
    )

    object NIBI_241 : NipponColor(
        id = "241",
        nameJp = "鈍",
        name = "NIBI",
        hex = "#656765",
        color = Color(0xFF656765)
    )

    object AONIBI_242 : NipponColor(
        id = "242",
        nameJp = "青鈍",
        name = "AONIBI",
        hex = "#535953",
        color = Color(0xFF535953)
    )

    object DOBUNEZUMI_243 : NipponColor(
        id = "243",
        nameJp = "溝鼠",
        name = "DOBUNEZUMI",
        hex = "#4F4F48",
        color = Color(0xFF4F4F48)
    )

    object BENIKESHINEZUMI_244 : NipponColor(
        id = "244",
        nameJp = "紅消鼠",
        name = "BENIKESHINEZUMI",
        hex = "#52433D",
        color = Color(0xFF52433D)
    )

    object AISUMICHA_245 : NipponColor(
        id = "245",
        nameJp = "藍墨茶",
        name = "AISUMICHA",
        hex = "#373C38",
        color = Color(0xFF373C38)
    )

    object BINROJIZOME_246 : NipponColor(
        id = "246",
        nameJp = "檳榔子染",
        name = "BINROJIZOME",
        hex = "#3A3226",
        color = Color(0xFF3A3226)
    )

    object KESHIZUMI_247 : NipponColor(
        id = "247",
        nameJp = "消炭",
        name = "KESHIZUMI",
        hex = "#434343",
        color = Color(0xFF434343)
    )

    object SUMI_248 : NipponColor(
        id = "248",
        nameJp = "墨",
        name = "SUMI",
        hex = "#1C1C1C",
        color = Color(0xFF1C1C1C)
    )

    object KURO_249 : NipponColor(
        id = "249",
        nameJp = "黒",
        name = "KURO",
        hex = "#080808",
        color = Color(0xFF080808)
    )

    object RO_250 : NipponColor(
        id = "250",
        nameJp = "呂",
        name = "RO",
        hex = "#0C0C0C",
        color = Color(0xFF0C0C0C)
    )

    companion object {
        val list = listOf(
            nadeshiko_1,
            kohbai_2,
            suoh_3,
            taikoh_4,
            ikkonzome_5,
            kuwazome_6,
            momo_7,
            ichigo_8,
            usubeni_9,
            imayoh_10,
            nakabeni_11,
            sakura_12,
            umenezumi_13,
            karakurenai_14,
            enji_15,
            kurenai_16,
            toki_17,
            cyohsyun_18,
            kokiake_19,
            sakuranezumi_20,
            jinzamomi_21,
            azuki_22,
            suohkoh_23,
            akabeni_24,
            shinsyu_25,
            haizakura_26,
            kuriume_27,
            ebicha_28,
            ginsyu_29,
            kurotobi_30,
            benitobi_31,
            akebono_32,
            benikaba_33,
            mizugaki_34,
            sangosyu_35,
            benihiwada_36,
            syojyohi_37,
            entan_38,
            shikancha_39,
            hiwada_40,
            kakishibu_41,
            ake_42,
            tobi_43,
            benihi_44,
            kurikawacha_45,
            bengara_46,
            terigaki_47,
            edocha_48,
            araisyu_49,
            momoshiocha_50,
            karacha_51,
            tokigaracha_52,
            ohni_53,
            sohi_54,
            ensyucha_55,
            kabacha_56,
            kogecha_57,
            akakoh_58,
            suzumecha_59,
            shishi_60,
            sodenkaracha_61,
            kaba_62,
            kokikuchinashi_63,
            kurumi_64,
            taisya_65,
            araigaki_66,
            kohrozen_67,
            akakuchiba_68,
            tonocha_69,
            akashiritsurubami_70,
            sencha_71,
            kanzo_72,
            sharegaki_73,
            beniukon_74,
            umezome_75,
            biwacha_76,
            chojicha_77,
            kenpohzome_78,
            kohaku_79,
            usugaki_80,
            kyara_81,
            chojizome_82,
            FUSHIZOME_83,
            KUCHIBA_84,
            KINCHA_85,
            KITSUNE_86,
            SUSUTAKE_87,
            USUKOH_88,
            TONOKO_89,
            GINSUSUTAKE_90,
            OHDO_91,
            SHIRACHA_92,
            KOBICHA_93,
            KIGARACHA_94,
            YAMABUKI_95,
            YAMABUKICHA_96,
            HAJIZOME_97,
            KUWACHA_98,
            TAMAGO_99,
            SHIROTSURUBAMI_100,
            KITSURUBAMI_101,
            TAMAMOROKOSHI_102,
            HANABA_103,
            NAMAKABE_104,
            TORINOKO_105,
            USUKI_106,
            KIKUCHIBA_107,
            KUCHINASHI_108,
            TOHOH_109,
            UKON_110,
            KARASHI_111,
            HIGOSUSUTAKE_112,
            RIKYUSHIRACHA_113,
            AKU_114,
            RIKYUCHA_115,
            ROKOHCHA_116,
            NATANEYU_117,
            UGUISUCHA_118,
            KIMIRUCHA_119,
            MIRUCHA_120,
            KARIYASU_121,
            NANOHANA_122,
            KIHADA_123,
            MUSHIKURI_124,
            AOKUCHIBA_125,
            OMINAESHI_126,
            HIWACHA_127,
            HIWA_128,
            UGUISU_129,
            YANAGICHA_130,
            KOKE_131,
            KIKUJIN_132,
            RIKANCHA_133,
            AIKOBICHA_134,
            MIRU_135,
            SENSAICHA_136,
            BAIKOCHA_137,
            HIWAMOEGI_138,
            YANAGIZOME_139,
            URAYANAGI_140,
            IWAICHA_141,
            MOEGI_142,
            NAE_143,
            YANAGISUSUTAKE_144,
            MATSUBA_145,
            AONI_146,
            USUAO_147,
            YANAGINEZUMI_148,
            TOKIWA_149,
            WAKATAKE_150,
            CHITOSEMIDORI_151,
            MIDORI_152,
            BYAKUROKU_153,
            OITAKE_154,
            TOKUSA_155,
            ONANDOCHA_156,
            ROKUSYOH_157,
            SABISEIJI_158,
            AOTAKE_159,
            VELUDO_160,
            MUSHIAO_161,
            AIMIRUCHA_162,
            TONOCHA2_163,
            AOMIDORI_164,
            SEIJI_165,
            TETSU_166,
            MIZUASAGI_167,
            SEIHEKI_168,
            SABITETSUONANDO_169,
            KORAINANDO_170,
            BYAKUGUN_171,
            OMESHICHA_172,
            KAMENOZOKI_173,
            FUKAGAWANEZUMI_174,
            SABIASAGI_175,
            MIZU_176,
            ASAGI_177,
            ONANDO_178,
            AI_179,
            SHINBASHI_180,
            SABIONANDO_181,
            TETSUONANDO_182,
            HANAASAGI_183,
            AINEZUMI_184,
            MASUHANA_185,
            SORA_186,
            NOSHIMEHANA_187,
            CHIGUSA_188,
            OMESHIONANDO_189,
            HANADA_190,
            WASURENAGUSA_191,
            GUNJYO_192,
            TSUYUKUSA_193,
            KUROTSURUBAMI_194,
            KON_195,
            KACHI_196,
            RURI_197,
            RURIKON_198,
            BENIMIDORI_199,
            FUJINEZUMI_200,
            TETSUKON_201,
            KONJYO_202,
            BENIKAKEHANA_203,
            KONKIKYO_204,
            FUJI_205,
            FUTAAI_206,
            OUCHI_207,
            FUJIMURASAKI_208,
            KIKYO_209,
            SHION_210,
            MESSHI_211,
            USU_212,
            HASHITA_213,
            EDOMURASAKI_214,
            SHIKON_215,
            KOKIMURASAKI_216,
            SUMIRE_217,
            MURASAKI_218,
            AYAME_219,
            FUJISUSUTAKE_220,
            BENIFUJI_221,
            KUROBENI_222,
            NASUKON_223,
            BUDOHNEZUMI_224,
            HATOBANEZUMI_225,
            KAKITSUBATA_226,
            EBIZOME_227,
            BOTAN_228,
            UMEMURASAKI_229,
            NISEMURASAKI_230,
            TSUTSUJI_231,
            MURASAKITOBI_232,
            SHIRONERI_233,
            GOFUN_234,
            SHIRONEZUMI_235,
            GINNEZUMI_236,
            NAMARI_237,
            HAI_238,
            SUNEZUMI_239,
            RIKYUNEZUMI_240,
            NIBI_241,
            AONIBI_242,
            DOBUNEZUMI_243,
            BENIKESHINEZUMI_244,
            AISUMICHA_245,
            BINROJIZOME_246,
            KESHIZUMI_247,
            SUMI_248,
            KURO_249,
            RO_250,
        )
    }


    override fun toString(): String {

//        return """
//            object FUJIMURASAKI_0 : NipponColor(0, "藤紫", "FUJIMURASAKI", "8A6BBE")
//
//        """.trimIndent()
        return """object ${name}_$id : NipponColor(id ="$id", nameJp = "$nameJp", name = "$name", hex = "$hex", color = Color(0xFF${
            hex.replace("#", "")
        }))"""
    }


}


class NipponColorReader : IColorReader {

    override val json: String
        get() = "nipponcolor.json"


    override fun getColorList(context: Context): List<ZgoColor> {

        var colors: List<ZgoColor> = listOf()


        val jsonStr = getJsonString(context)
        try {
            val jsonArray = JSONArray(jsonStr)
            val colorCount = jsonArray.length()
            colors = ArrayList<NipponColor>(colorCount + 1)

            for (i in 0 until colorCount) {
                val jsonObject = jsonArray.getJSONObject(i)
                //     {
                //        "id": "001",
                //        "name": "nadeshiko",
                //        "cname": "撫子",
                //        "color": "DC9F84"
                //    }
                val id = jsonObject.getString("id").toInt()
                val name = jsonObject.getString("name")
                val nameJp = jsonObject.getString("cname")
                val hex = jsonObject.getString("color")
                val nipponColor = NipponColor(
                    id = id.toString(),
                    name = name,
                    nameJp = nameJp,
                    hex = "#$hex"
                )

                colors.add(i, nipponColor)
            }
        } catch (e: JSONException) {
            e.printStackTrace()
        }

        colors.forEach {
//            Log.e("zzz", it.toString())
            Log.e("zzz", "${it.name}_${it.id},")
        }

        return colors
    }


}