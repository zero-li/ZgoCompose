package com.zgo.lib.ui.theme.color

import android.content.Context
import android.util.Log
import androidx.compose.ui.graphics.Color
import org.json.JSONArray
import org.json.JSONException


/*
 * 
 * 
 * @author: zhhli
 * @date: 22/1/21
 */

///{
//    "id": "0-0",
//    "hex": "#ffb3a7",
//    "name": "粉红",
//    "intro": "即浅红色。别称：妃色、杨妃色、湘妃色、妃红色",
//}
open class ChKindColor(
    id: String,
    name: String,
    hex: String = "#ffb3a7",
    color: Color = Color.Transparent,
    intro: String = "",
) : ZgoColor(id, name, hex, color, intro) {

    object red :
        ChKindColor("id = red", name = "红", hex = "#ffb3a7", color = Color(0xFFffb3a7), intro = "")

    object red_0 : ChKindColor(
        "id = red_0",
        name = "粉红",
        hex = "#ffb3a7",
        color = Color(0xFFffb3a7),
        intro = "即浅红色。别称：妃色、杨妃色、湘妃色、妃红色"
    )

    object red_1 : ChKindColor(
        "id = red_1",
        name = "妃色",
        hex = "#ed5736",
        color = Color(0xFFed5736),
        intro = "妃红色。古同'绯'，粉红色。杨妃色湘妃色粉红皆同义。"
    )

    object red_2 : ChKindColor(
        "id = red_2",
        name = "品红",
        hex = "#f00056",
        color = Color(0xFFf00056),
        intro = "比大红浅的红色（这里的'品红'估计是指的'一品红'，是基于大红色系的，和现在我们印刷用色的'品红M100'不是一个概念）"
    )

    object red_3 : ChKindColor(
        "id = red_3",
        name = "桃红",
        hex = "#f47983",
        color = Color(0xFFf47983),
        intro = "桃花的颜色，比粉红略鲜润的颜色。（不大于M70的色彩，有时可加入适量黄色）"
    )

    object red_4 : ChKindColor(
        "id = red_4",
        name = "海棠红",
        hex = "#db5a6b",
        color = Color(0xFFdb5a6b),
        intro = "淡紫红色、较桃红色深一些，是非常妩媚娇艳的颜色。"
    )

    object red_5 : ChKindColor(
        "id = red_5",
        name = "石榴红",
        hex = "#f20c00",
        color = Color(0xFFf20c00),
        intro = "石榴花的颜色，高色度和纯度的红色。"
    )

    object red_6 : ChKindColor(
        "id = red_6",
        name = "樱桃色",
        hex = "#c93756",
        color = Color(0xFFc93756),
        intro = "鲜红色"
    )

    object red_7 : ChKindColor(
        "id = red_7",
        name = "银红",
        hex = "#f05654",
        color = Color(0xFFf05654),
        intro = "银朱和粉红色颜料配成的颜色。多用来形容有光泽的各种红色，尤指有光泽浅红。"
    )

    object red_8 : ChKindColor(
        "id = red_8",
        name = "大红",
        hex = "#ff2121",
        color = Color(0xFFff2121),
        intro = "正红色，三原色中的红，传统的中国红，又称绛色（RGB色中的R255系列明度）"
    )

    object red_9 : ChKindColor(
        "id = red_9",
        name = "绛紫",
        hex = "#8c4356",
        color = Color(0xFF8c4356),
        intro = "紫中略带红的颜色"
    )

    object red_10 : ChKindColor(
        "id = red_10",
        name = "绯红",
        hex = "#c83c23",
        color = Color(0xFFc83c23),
        intro = "艳丽的深红"
    )

    object red_11 : ChKindColor(
        "id = red_11",
        name = "胭脂",
        hex = "#9d2933",
        color = Color(0xFF9d2933),
        intro = "1，女子装扮时用的胭脂的颜色。2，国画暗红色颜料"
    )

    object red_12 : ChKindColor(
        "id = red_12",
        name = "朱红",
        hex = "#ff4c00",
        color = Color(0xFFff4c00),
        intro = "朱砂的颜色，比大红活泼，也称铅朱朱色丹色（在YM对等的情况下，适量减少红色的成分就是该色的色彩系列感觉）"
    )

    object red_13 : ChKindColor(
        "id = red_13",
        name = "丹",
        hex = "#ff4e20",
        color = Color(0xFFff4e20),
        intro = "丹砂的鲜艳红色"
    )

    object red_14 : ChKindColor(
        "id = red_14",
        name = "彤",
        hex = "#f35336",
        color = Color(0xFFf35336),
        intro = "赤色"
    )

    object red_15 : ChKindColor(
        "id = red_15",
        name = "茜色",
        hex = "#cb3a56",
        color = Color(0xFFcb3a56),
        intro = "茜草染的色彩，呈深红色"
    )

    object red_16 : ChKindColor(
        "id = red_16",
        name = "火红",
        hex = "#ff2d51",
        color = Color(0xFFff2d51),
        intro = "火焰的红色，赤色"
    )

    object red_17 : ChKindColor(
        "id = red_17",
        name = "赫赤",
        hex = "#c91f37",
        color = Color(0xFFc91f37),
        intro = "深红，火红。泛指赤色、火红色。"
    )

    object red_18 : ChKindColor(
        "id = red_18",
        name = "嫣红",
        hex = "#ef7a82",
        color = Color(0xFFef7a82),
        intro = "鲜艳的红色"
    )

    object red_19 : ChKindColor(
        "id = red_19",
        name = "洋红",
        hex = "#ff0097",
        color = Color(0xFFff0097),
        intro = "色橘红（这个色彩方向不太对，通常洋红指的是倾向于M100系列的红色，应该削弱黄色成分。）"
    )

    object red_20 : ChKindColor(
        "id = red_20",
        name = "炎",
        hex = "#ff3300",
        color = Color(0xFFff3300),
        intro = "引申为红色"
    )

    object red_21 : ChKindColor(
        "id = red_21",
        name = "赤",
        hex = "#c3272b",
        color = Color(0xFFc3272b),
        intro = "本义火的颜色，即红色"
    )

    object red_22 : ChKindColor(
        "id = red_22",
        name = "绾",
        hex = "#a98175",
        color = Color(0xFFa98175),
        intro = "绛色；浅绛色"
    )

    object red_23 : ChKindColor(
        "id = red_23",
        name = "枣红",
        hex = "#c32136",
        color = Color(0xFFc32136),
        intro = "即深红（色相不变，是深浅变化）"
    )

    object red_24 : ChKindColor(
        "id = red_24",
        name = "檀",
        hex = "#b36d61",
        color = Color(0xFFb36d61),
        intro = "浅红色，浅绛色"
    )

    object red_25 : ChKindColor(
        "id = red_25",
        name = "殷红",
        hex = "#be002f",
        color = Color(0xFFbe002f),
        intro = "发黑的红色。"
    )

    object red_26 : ChKindColor(
        "id = red_26",
        name = "酡红",
        hex = "#dc3023",
        color = Color(0xFFdc3023),
        intro = "像饮酒后脸上泛现的红色，泛指脸红"
    )

    object red_27 : ChKindColor(
        "id = red_27",
        name = "酡颜",
        hex = "#f9906f",
        color = Color(0xFFf9906f),
        intro = "饮酒脸红的样子。亦泛指脸红色"
    )

    object yellow : ChKindColor(
        "id = yellow",
        name = "黄",
        hex = "#fff143",
        color = Color(0xFFfff143),
        intro = ""
    )

    object yellow_0 : ChKindColor(
        "id = yellow_0",
        name = "鹅黄",
        hex = "#fff143",
        color = Color(0xFFfff143),
        intro = "淡黄色（鹅嘴的颜色，高明度微偏红黄色）"
    )

    object yellow_1 : ChKindColor(
        "id = yellow_1",
        name = "鸭黄",
        hex = "#faff72",
        color = Color(0xFFfaff72),
        intro = "小鸭毛的黄色"
    )

    object yellow_2 : ChKindColor(
        "id = yellow_2",
        name = "樱草色",
        hex = "#eaff56",
        color = Color(0xFFeaff56),
        intro = "淡黄色"
    )

    object yellow_3 : ChKindColor(
        "id = yellow_3",
        name = "杏黄",
        hex = "#ffa631",
        color = Color(0xFFffa631),
        intro = "成熟杏子的黄色（Y100M20~30感觉的色彩，比较常用且有浓郁中国味道）"
    )

    object yellow_4 : ChKindColor(
        "id = yellow_4",
        name = "杏红",
        hex = "#ff8c31",
        color = Color(0xFFff8c31),
        intro = "成熟杏子偏红色的一种颜色"
    )

    object yellow_5 : ChKindColor(
        "id = yellow_5",
        name = "橘黄",
        hex = "#ff8936",
        color = Color(0xFFff8936),
        intro = "柑橘的黄色。"
    )

    object yellow_6 : ChKindColor(
        "id = yellow_6",
        name = "橙黄",
        hex = "#ffa400",
        color = Color(0xFFffa400),
        intro = "同上。（Y100M50感觉的色彩，现代感比较强。广告上用得较多）"
    )

    object yellow_7 : ChKindColor(
        "id = yellow_7",
        name = "橘红",
        hex = "#ff7500",
        color = Color(0xFFff7500),
        intro = "柑橘皮所呈现的红色。"
    )

    object yellow_8 : ChKindColor(
        "id = yellow_8",
        name = "姜黄",
        hex = "#ffc773",
        color = Color(0xFFffc773),
        intro = "中药名。别名黄姜。为姜科植物姜黄的根茎。又指人脸色不正,呈黄白色"
    )

    object yellow_9 : ChKindColor(
        "id = yellow_9",
        name = "缃色",
        hex = "#f0c239",
        color = Color(0xFFf0c239),
        intro = "浅黄色"
    )

    object yellow_10 : ChKindColor(
        "id = yellow_10",
        name = "橙色",
        hex = "#fa8c35",
        color = Color(0xFFfa8c35),
        intro = "界于红色和黄色之间的混合色"
    )

    object yellow_11 : ChKindColor(
        "id = yellow_11",
        name = "茶色",
        hex = "#b35c44",
        color = Color(0xFFb35c44),
        intro = "一种比栗色稍红的棕橙色至浅棕色"
    )

    object yellow_12 : ChKindColor(
        "id = yellow_12",
        name = "驼色",
        hex = "#a88462",
        color = Color(0xFFa88462),
        intro = "一种比咔叽色稍红而微淡、比肉桂色黄而稍淡和比核桃棕色黄而暗的浅黄棕色"
    )

    object yellow_13 : ChKindColor(
        "id = yellow_13",
        name = "昏黄",
        hex = "#c89b40",
        color = Color(0xFFc89b40),
        intro = "形容天色、灯光等呈幽暗的黄色"
    )

    object yellow_14 : ChKindColor(
        "id = yellow_14",
        name = "栗色",
        hex = "#60281e",
        color = Color(0xFF60281e),
        intro = "栗壳的颜色。即紫黑色"
    )

    object yellow_15 : ChKindColor(
        "id = yellow_15",
        name = "棕色",
        hex = "#b25d25",
        color = Color(0xFFb25d25),
        intro = "棕毛的颜色,即褐色。1，在红色和黄色之间的任何一种颜色2，适中的暗淡和适度的浅黑。"
    )

    object yellow_16 : ChKindColor(
        "id = yellow_16",
        name = "棕绿",
        hex = "#827100",
        color = Color(0xFF827100),
        intro = "绿中泛棕色的一种颜色"
    )

    object yellow_17 : ChKindColor(
        "id = yellow_17",
        name = "棕黑",
        hex = "#7c4b00",
        color = Color(0xFF7c4b00),
        intro = "深棕色。"
    )

    object yellow_18 : ChKindColor(
        "id = yellow_18",
        name = "棕红",
        hex = "#9b4400",
        color = Color(0xFF9b4400),
        intro = "红褐色。"
    )

    object yellow_19 : ChKindColor(
        "id = yellow_19",
        name = "棕黄",
        hex = "#ae7000",
        color = Color(0xFFae7000),
        intro = "浅褐色。"
    )

    object yellow_20 : ChKindColor(
        "id = yellow_20",
        name = "赭",
        hex = "#9c5333",
        color = Color(0xFF9c5333),
        intro = "赤红如赭土的颜料,古人用以饰面"
    )

    object yellow_21 : ChKindColor(
        "id = yellow_21",
        name = "赭色",
        hex = "#955539",
        color = Color(0xFF955539),
        intro = "红色、赤红色。"
    )

    object yellow_22 : ChKindColor(
        "id = yellow_22",
        name = "琥珀",
        hex = "#ca6924",
        color = Color(0xFFca6924),
        intro = ""
    )

    object yellow_23 : ChKindColor(
        "id = yellow_23",
        name = "褐色",
        hex = "#6e511e",
        color = Color(0xFF6e511e),
        intro = "黄黑色"
    )

    object yellow_24 : ChKindColor(
        "id = yellow_24",
        name = "枯黄",
        hex = "#d3b17d",
        color = Color(0xFFd3b17d),
        intro = "干枯焦黄"
    )

    object yellow_25 : ChKindColor(
        "id = yellow_25",
        name = "黄栌",
        hex = "#e29c45",
        color = Color(0xFFe29c45),
        intro = "一种落叶灌木，花黄绿色,叶子秋天变成红色。木材黄色可做染料。"
    )

    object yellow_26 : ChKindColor(
        "id = yellow_26",
        name = "秋色",
        hex = "#896c39",
        color = Color(0xFF896c39),
        intro = "1，中常橄榄棕色,它比一般橄榄棕色稍暗,且稍稍绿些。2，古以秋为金,其色白,故代指白色。"
    )

    object yellow_27 : ChKindColor(
        "id = yellow_27",
        name = "秋香色",
        hex = "#d9b611",
        color = Color(0xFFd9b611),
        intro = "浅橄榄色浅黄绿色。（直接在Y中掺入k10~30可得到不同浓淡的该类色彩）"
    )

    object green : ChKindColor(
        "id = green",
        name = "绿",
        hex = "#0aa344",
        color = Color(0xFF0aa344),
        intro = ""
    )

    object green_0 : ChKindColor(
        "id = green_0",
        name = "嫩绿",
        hex = "#bddd22",
        color = Color(0xFFbddd22),
        intro = "像刚长出的嫩叶的浅绿色"
    )

    object green_1 : ChKindColor(
        "id = green_1",
        name = "柳黄",
        hex = "#c9dd22",
        color = Color(0xFFc9dd22),
        intro = "像柳树芽那样的浅黄色"
    )

    object green_2 : ChKindColor(
        "id = green_2",
        name = "柳绿",
        hex = "#afdd22",
        color = Color(0xFFafdd22),
        intro = "柳叶的青绿色"
    )

    object green_3 : ChKindColor(
        "id = green_3",
        name = "竹青",
        hex = "#789262",
        color = Color(0xFF789262),
        intro = "竹子的绿色"
    )

    object green_4 : ChKindColor(
        "id = green_4",
        name = "葱黄",
        hex = "#a3d900",
        color = Color(0xFFa3d900),
        intro = "黄绿色，嫩黄色"
    )

    object green_5 : ChKindColor(
        "id = green_5",
        name = "葱绿",
        hex = "#9ed900",
        color = Color(0xFF9ed900),
        intro = "1:浅绿又略显微黄的颜色 2:草木青翠的样子"
    )

    object green_6 : ChKindColor(
        "id = green_6",
        name = "葱青",
        hex = "#0eb83a",
        color = Color(0xFF0eb83a),
        intro = "淡淡的青绿色"
    )

    object green_7 : ChKindColor(
        "id = green_7",
        name = "葱倩",
        hex = "#0eb840",
        color = Color(0xFF0eb840),
        intro = "青绿色"
    )

    object green_8 : ChKindColor(
        "id = green_8",
        name = "青葱",
        hex = "#0aa344",
        color = Color(0xFF0aa344),
        intro = "翠绿色,形容植物浓绿"
    )

    object green_9 : ChKindColor(
        "id = green_9",
        name = "油绿",
        hex = "#00bc12",
        color = Color(0xFF00bc12),
        intro = "光润而浓绿的颜色。以上几种绿色都是明亮可爱的色彩。"
    )

    object green_10 : ChKindColor(
        "id = green_10",
        name = "绿沈",
        hex = "#0c8918",
        color = Color(0xFF0c8918),
        intro = "（沉）深绿"
    )

    object green_11 : ChKindColor(
        "id = green_11",
        name = "碧色",
        hex = "#1bd1a5",
        color = Color(0xFF1bd1a5),
        intro = "1，青绿色。2，青白色,浅蓝色。"
    )

    object green_12 : ChKindColor(
        "id = green_12",
        name = "碧绿",
        hex = "#2add9c",
        color = Color(0xFF2add9c),
        intro = "鲜艳的青绿色"
    )

    object green_13 : ChKindColor(
        "id = green_13",
        name = "青碧",
        hex = "#48c0a3",
        color = Color(0xFF48c0a3),
        intro = "鲜艳的青蓝色"
    )

    object green_14 : ChKindColor(
        "id = green_14",
        name = "翡翠色",
        hex = "#3de1ad",
        color = Color(0xFF3de1ad),
        intro = "1，翡翠鸟羽毛的青绿色。2，翡翠宝石的颜色。（C-Y≥30的系列色彩，多与白色配合以体现清新明丽感觉，与黑色配合效果不好该色个性柔弱，会被黑色牵制）"
    )

    object green_15 : ChKindColor(
        "id = green_15",
        name = "草绿",
        hex = "#40de5a",
        color = Color(0xFF40de5a),
        intro = "绿而略黄的颜色。"
    )

    object green_16 : ChKindColor(
        "id = green_16",
        name = "青色",
        hex = "#00e09e",
        color = Color(0xFF00e09e),
        intro = "1，一类带绿的蓝色,中等深浅,高度饱和。3，本义是蓝色。4，一般指深绿色。5，也指黑色。6，四色印刷中的一色。2，特指三补色中的一色。"
    )

    object green_17 : ChKindColor(
        "id = green_17",
        name = "青翠",
        hex = "#00e079",
        color = Color(0xFF00e079),
        intro = "鲜绿"
    )

    object green_18 : ChKindColor(
        "id = green_18",
        name = "青白",
        hex = "#c0ebd7",
        color = Color(0xFFc0ebd7),
        intro = "白而发青,尤指脸没有血色"
    )

    object green_19 : ChKindColor(
        "id = green_19",
        name = "鸭卵青",
        hex = "#e0eee8",
        color = Color(0xFFe0eee8),
        intro = "淡青灰色，极淡的青绿色"
    )

    object green_20 : ChKindColor(
        "id = green_20",
        name = "蟹壳青",
        hex = "#bbcdc5",
        color = Color(0xFFbbcdc5),
        intro = "深灰绿色"
    )

    object green_21 : ChKindColor(
        "id = green_21",
        name = "鸦青",
        hex = "#424c50",
        color = Color(0xFF424c50),
        intro = "鸦羽的颜色。即黑而带有紫绿光的颜色。"
    )

    object green_22 : ChKindColor(
        "id = green_22",
        name = "绿色",
        hex = "#00e500",
        color = Color(0xFF00e500),
        intro = "1，在光谱中介于蓝与黄之间的那种颜色。2，本义青中带黄的颜色。3，引申为黑色，如绿鬓乌黑而光亮的鬓发。代指为青春年少的容颜。（现代色彩研究中，把绿色提高到了一个重要的位置，和其它红黄兰三原色并列研究，称做'心理原色'之一）"
    )

    object green_23 : ChKindColor(
        "id = green_23",
        name = "豆绿",
        hex = "#9ed048",
        color = Color(0xFF9ed048),
        intro = "浅黄绿色"
    )

    object green_24 : ChKindColor(
        "id = green_24",
        name = "豆青",
        hex = "#96ce54",
        color = Color(0xFF96ce54),
        intro = "浅青绿色"
    )

    object green_25 : ChKindColor(
        "id = green_25",
        name = "石青",
        hex = "#7bcfa6",
        color = Color(0xFF7bcfa6),
        intro = "淡灰绿色"
    )

    object green_26 : ChKindColor(
        "id = green_26",
        name = "玉色",
        hex = "#2edfa3",
        color = Color(0xFF2edfa3),
        intro = "玉的颜色，高雅的淡绿、淡青色"
    )

    object green_27 : ChKindColor(
        "id = green_27",
        name = "缥",
        hex = "#7fecad",
        color = Color(0xFF7fecad),
        intro = "绿色而微白"
    )

    object green_28 : ChKindColor(
        "id = green_28",
        name = "艾绿",
        hex = "#a4e2c6",
        color = Color(0xFFa4e2c6),
        intro = "艾草的颜色。偏苍白的绿色"
    )

    object green_29 : ChKindColor(
        "id = green_29",
        name = "松柏绿",
        hex = "#21a675",
        color = Color(0xFF21a675),
        intro = "经冬松柏叶的深绿"
    )

    object green_30 : ChKindColor(
        "id = green_30",
        name = "松花绿",
        hex = "#057748",
        color = Color(0xFF057748),
        intro = "亦作'松花'、'松绿'。偏黑的深绿色,墨绿。"
    )

    object green_31 : ChKindColor(
        "id = green_31",
        name = "松花色",
        hex = "#bce672",
        color = Color(0xFFbce672),
        intro = "浅黄绿色。（松树花粉的颜色）《红楼梦》中提及松花配桃红为娇艳"
    )

    object blue :
        ChKindColor("id = blue", name = "蓝", hex = "#44cef6", color = Color(0xFF44cef6), intro = "")

    object blue_0 : ChKindColor(
        "id = blue_0",
        name = "蓝",
        hex = "#44cef6",
        color = Color(0xFF44cef6),
        intro = "三原色的一种。像晴天天空的颜色（这里的蓝色指的不是RGB色彩中的B，而是CMY色彩中的C）"
    )

    object blue_1 : ChKindColor(
        "id = blue_1",
        name = "靛青",
        hex = "#177cb0",
        color = Color(0xFF177cb0),
        intro = "也叫'蓝靛'。用蓼蓝叶泡水调和与石灰沉淀所得的蓝色染料。呈深蓝绿色（靛，发音dian四声，有些地方将蓝墨水称为'靛水'或者'兰靛水'）"
    )

    object blue_2 : ChKindColor(
        "id = blue_2",
        name = "靛蓝",
        hex = "#065279",
        color = Color(0xFF065279),
        intro = "由植物(例如靛蓝或菘蓝属植物)得到的蓝色染料"
    )

    object blue_3 : ChKindColor(
        "id = blue_3",
        name = "碧蓝",
        hex = "#3eede7",
        color = Color(0xFF3eede7),
        intro = "青蓝色"
    )

    object blue_4 : ChKindColor(
        "id = blue_4",
        name = "蔚蓝",
        hex = "#70f3ff",
        color = Color(0xFF70f3ff),
        intro = "类似晴朗天空的颜色的一种蓝色"
    )

    object blue_5 : ChKindColor(
        "id = blue_5",
        name = "宝蓝",
        hex = "#4b5cc4",
        color = Color(0xFF4b5cc4),
        intro = "鲜艳明亮的蓝色（英文中为RoyalBlue即皇家蓝色，是皇室选用的色彩，多和小面积纯黄色（金色）配合使用。）"
    )

    object blue_6 : ChKindColor(
        "id = blue_6",
        name = "蓝灰色",
        hex = "#a1afc9",
        color = Color(0xFFa1afc9),
        intro = "一种近于灰略带蓝的深灰色"
    )

    object blue_7 : ChKindColor(
        "id = blue_7",
        name = "藏青",
        hex = "#2e4e7e",
        color = Color(0xFF2e4e7e),
        intro = "蓝而近黑"
    )

    object blue_8 : ChKindColor(
        "id = blue_8",
        name = "藏蓝",
        hex = "#3b2e7e",
        color = Color(0xFF3b2e7e),
        intro = "蓝里略透红色"
    )

    object blue_9 : ChKindColor(
        "id = blue_9",
        name = "黛",
        hex = "#4a4266",
        color = Color(0xFF4a4266),
        intro = "别名：黛色，黛螺。青黑色的颜料。古代女子用以画眉。绘画或画眉所使用的青黑色颜料，代指女子眉妩。"
    )

    object blue_10 : ChKindColor(
        "id = blue_10",
        name = "黛绿",
        hex = "#426666",
        color = Color(0xFF426666),
        intro = "墨绿"
    )

    object blue_11 : ChKindColor(
        "id = blue_11",
        name = "黛蓝",
        hex = "#425066",
        color = Color(0xFF425066),
        intro = "深蓝色"
    )

    object blue_12 : ChKindColor(
        "id = blue_12",
        name = "黛紫",
        hex = "#574266",
        color = Color(0xFF574266),
        intro = "深紫色"
    )

    object blue_13 : ChKindColor(
        "id = blue_13",
        name = "紫色",
        hex = "#8d4bbb",
        color = Color(0xFF8d4bbb),
        intro = "蓝和红组成的颜色。古人以紫为祥瑞的颜色。代指与帝王、皇宫有关的事物"
    )

    object blue_14 : ChKindColor(
        "id = blue_14",
        name = "紫酱",
        hex = "#815463",
        color = Color(0xFF815463),
        intro = "浑浊的紫色"
    )

    object blue_15 : ChKindColor(
        "id = blue_15",
        name = "酱紫",
        hex = "#815476",
        color = Color(0xFF815476),
        intro = "紫中略带红的颜色"
    )

    object blue_16 : ChKindColor(
        "id = blue_16",
        name = "紫檀",
        hex = "#4c221b",
        color = Color(0xFF4c221b),
        intro = "檀木的颜色，也称乌檀色乌木色"
    )

    object blue_17 : ChKindColor(
        "id = blue_17",
        name = "绀青绀紫",
        hex = "#003371",
        color = Color(0xFF003371),
        intro = "纯度较低的深紫色"
    )

    object blue_18 : ChKindColor(
        "id = blue_18",
        name = "紫棠",
        hex = "#56004f",
        color = Color(0xFF56004f),
        intro = "黑红色"
    )

    object blue_19 : ChKindColor(
        "id = blue_19",
        name = "青莲",
        hex = "#801dae",
        color = Color(0xFF801dae),
        intro = "偏蓝的紫色"
    )

    object blue_20 : ChKindColor(
        "id = blue_20",
        name = "群青",
        hex = "#4c8dae",
        color = Color(0xFF4c8dae),
        intro = "深蓝色"
    )

    object blue_21 : ChKindColor(
        "id = blue_21",
        name = "雪青",
        hex = "#b0a4e3",
        color = Color(0xFFb0a4e3),
        intro = "浅蓝紫色"
    )

    object blue_22 : ChKindColor(
        "id = blue_22",
        name = "丁香色",
        hex = "#cca4e3",
        color = Color(0xFFcca4e3),
        intro = "紫丁香的颜色，浅浅的紫色，很娇柔淡雅的色彩"
    )

    object blue_23 : ChKindColor(
        "id = blue_23",
        name = "藕色",
        hex = "#edd1d8",
        color = Color(0xFFedd1d8),
        intro = "浅灰而略带红的颜色"
    )

    object blue_24 : ChKindColor(
        "id = blue_24",
        name = "藕荷色",
        hex = "#e4c6d0",
        color = Color(0xFFe4c6d0),
        intro = "浅紫而略带红的颜色"
    )

    object cang :
        ChKindColor("id = cang", name = "苍", hex = "#75878a", color = Color(0xFF75878a), intro = "")

    object cang_0 : ChKindColor(
        "id = cang_0",
        name = "苍色",
        hex = "#75878a",
        color = Color(0xFF75878a),
        intro = "即各种颜色掺入黑色后的颜色"
    )

    object cang_1 : ChKindColor(
        "id = cang_1",
        name = "苍翠",
        hex = "#519a73",
        color = Color(0xFF519a73),
        intro = ""
    )

    object cang_2 : ChKindColor(
        "id = cang_2",
        name = "苍黄",
        hex = "#a29b7c",
        color = Color(0xFFa29b7c),
        intro = ""
    )

    object cang_3 : ChKindColor(
        "id = cang_3",
        name = "苍青",
        hex = "#7397ab",
        color = Color(0xFF7397ab),
        intro = ""
    )

    object cang_4 : ChKindColor(
        "id = cang_4",
        name = "苍黑",
        hex = "#395260",
        color = Color(0xFF395260),
        intro = ""
    )

    object cang_5 : ChKindColor(
        "id = cang_5",
        name = "苍白",
        hex = "#d1d9e0",
        color = Color(0xFFd1d9e0),
        intro = "准确的说是掺入不同灰度级别的灰色"
    )

    object water : ChKindColor(
        "id = water",
        name = "水",
        hex = "#d2f0f4",
        color = Color(0xFFd2f0f4),
        intro = ""
    )

    object water_0 : ChKindColor(
        "id = water_0",
        name = "水色",
        hex = "#88ada6",
        color = Color(0xFF88ada6),
        intro = ""
    )

    object water_1 : ChKindColor(
        "id = water_1",
        name = "水红",
        hex = "#f3d3e7",
        color = Color(0xFFf3d3e7),
        intro = ""
    )

    object water_2 : ChKindColor(
        "id = water_2",
        name = "水绿",
        hex = "#d4f2e7",
        color = Color(0xFFd4f2e7),
        intro = ""
    )

    object water_3 : ChKindColor(
        "id = water_3",
        name = "水蓝",
        hex = "#d2f0f4",
        color = Color(0xFFd2f0f4),
        intro = ""
    )

    object water_4 : ChKindColor(
        "id = water_4",
        name = "淡青",
        hex = "#d3e0f3",
        color = Color(0xFFd3e0f3),
        intro = ""
    )

    object water_5 : ChKindColor(
        "id = water_5",
        name = "湖蓝",
        hex = "#30dff3",
        color = Color(0xFF30dff3),
        intro = ""
    )

    object water_6 : ChKindColor(
        "id = water_6",
        name = "湖绿",
        hex = "#25f8cb",
        color = Color(0xFF25f8cb),
        intro = "皆是浅色。深色淡色，颜色深的或浅的，不再一一列出。"
    )

    object gray : ChKindColor(
        "id = gray",
        name = "灰白",
        hex = "#f0f0f4",
        color = Color(0xFFf0f0f4),
        intro = ""
    )

    object gray_0 : ChKindColor(
        "id = gray_0",
        name = "精白",
        hex = "#ffffff",
        color = Color(0xFFffffff),
        intro = "纯白，洁白，净白，粉白。"
    )

    object gray_1 : ChKindColor(
        "id = gray_1",
        name = "象牙白",
        hex = "#fffbf0",
        color = Color(0xFFfffbf0),
        intro = "乳白色"
    )

    object gray_2 : ChKindColor(
        "id = gray_2",
        name = "雪白",
        hex = "#f2fdff",
        color = Color(0xFFf2fdff),
        intro = "如雪般洁白"
    )

    object gray_3 : ChKindColor(
        "id = gray_3",
        name = "月白",
        hex = "#d6ecf0",
        color = Color(0xFFd6ecf0),
        intro = "淡蓝色"
    )

    object gray_4 : ChKindColor(
        "id = gray_4",
        name = "缟",
        hex = "#f2ecde",
        color = Color(0xFFf2ecde),
        intro = "白色"
    )

    object gray_5 : ChKindColor(
        "id = gray_5",
        name = "素",
        hex = "#e0f0e9",
        color = Color(0xFFe0f0e9),
        intro = "白色，无色"
    )

    object gray_6 : ChKindColor(
        "id = gray_6",
        name = "荼白",
        hex = "#f3f9f1",
        color = Color(0xFFf3f9f1),
        intro = "如荼之白色"
    )

    object gray_7 : ChKindColor(
        "id = gray_7",
        name = "霜色",
        hex = "#e9f1f6",
        color = Color(0xFFe9f1f6),
        intro = "白霜的颜色。"
    )

    object gray_8 : ChKindColor(
        "id = gray_8",
        name = "花白",
        hex = "#c2ccd0",
        color = Color(0xFFc2ccd0),
        intro = "白色和黑色混杂的。斑白的夹杂有灰色的白"
    )

    object gray_9 : ChKindColor(
        "id = gray_9",
        name = "鱼肚白",
        hex = "#fcefe8",
        color = Color(0xFFfcefe8),
        intro = "似鱼腹部的颜色，多指黎明时东方的天色颜色（M5Y5）"
    )

    object gray_10 : ChKindColor(
        "id = gray_10",
        name = "莹白",
        hex = "#e3f9fd",
        color = Color(0xFFe3f9fd),
        intro = "晶莹洁白"
    )

    object gray_11 : ChKindColor(
        "id = gray_11",
        name = "灰色",
        hex = "#808080",
        color = Color(0xFF808080),
        intro = "黑色和白色混和成的一种颜色"
    )

    object gray_12 : ChKindColor(
        "id = gray_12",
        name = "牙色",
        hex = "#eedeb0",
        color = Color(0xFFeedeb0),
        intro = "与象牙相似的淡黄色（暖白）"
    )

    object gray_13 : ChKindColor(
        "id = gray_13",
        name = "铅白",
        hex = "#f0f0f4",
        color = Color(0xFFf0f0f4),
        intro = "铅粉的白色。铅粉，国画颜料，日久易氧化'返铅'变黑。铅粉在古时用以搽脸的化妆品。（冷白）"
    )

    object black : ChKindColor(
        "id = black",
        name = "黑",
        hex = "#000000",
        color = Color(0xFF000000),
        intro = ""
    )

    object black_0 : ChKindColor(
        "id = black_0",
        name = "玄色",
        hex = "#622a1d",
        color = Color(0xFF622a1d),
        intro = "赤黑色，黑中带红的颜色，又泛指黑色"
    )

    object black_1 : ChKindColor(
        "id = black_1",
        name = "玄青",
        hex = "#3d3b4f",
        color = Color(0xFF3d3b4f),
        intro = "深黑色"
    )

    object black_2 : ChKindColor(
        "id = black_2",
        name = "乌色",
        hex = "#725e82",
        color = Color(0xFF725e82),
        intro = "暗而呈黑的颜色"
    )

    object black_3 : ChKindColor(
        "id = black_3",
        name = "乌黑",
        hex = "#392f41",
        color = Color(0xFF392f41),
        intro = "深黑；漆黑"
    )

    object black_4 : ChKindColor(
        "id = black_4",
        name = "漆黑",
        hex = "#161823",
        color = Color(0xFF161823),
        intro = "非常黑的"
    )

    object black_5 : ChKindColor(
        "id = black_5",
        name = "墨色",
        hex = "#50616d",
        color = Color(0xFF50616d),
        intro = "即黑色"
    )

    object black_6 : ChKindColor(
        "id = black_6",
        name = "墨灰",
        hex = "#758a99",
        color = Color(0xFF758a99),
        intro = "即黑灰"
    )

    object black_7 : ChKindColor(
        "id = black_7",
        name = "黑色",
        hex = "#000000",
        color = Color(0xFF000000),
        intro = "亮度最低的非彩色的或消色差的物体的颜色；最暗的灰色；与白色截然不同的消色差的颜色；被认为特别属于那些既不能反射、又不能透过能使人感觉到的微小入射光的物体,任何亮度很低的物体颜色。"
    )

    object black_8 : ChKindColor(
        "id = black_8",
        name = "缁色",
        hex = "#493131",
        color = Color(0xFF493131),
        intro = "帛黑色"
    )

    object black_9 : ChKindColor(
        "id = black_9",
        name = "煤黑",
        hex = "#312520",
        color = Color(0xFF312520),
        intro = "别称：象牙黑。都是黑，不过有冷暖之分"
    )

    object black_10 : ChKindColor(
        "id = black_10",
        name = "黧",
        hex = "#5d513c",
        color = Color(0xFF5d513c),
        intro = "黑中带黄的颜色"
    )

    object black_11 : ChKindColor(
        "id = black_11",
        name = "黎",
        hex = "#75664d",
        color = Color(0xFF75664d),
        intro = "黑中带黄似黎草色"
    )

    object black_12 : ChKindColor(
        "id = black_12",
        name = "黝",
        hex = "#6b6882",
        color = Color(0xFF6b6882),
        intro = "本义为淡黑色或微青黑色。"
    )

    object black_13 : ChKindColor(
        "id = black_13",
        name = "黝黑",
        hex = "#665757",
        color = Color(0xFF665757),
        intro = "（皮肤暴露在太阳光下而晒成的）青黑色"
    )

    object black_14 : ChKindColor(
        "id = black_14",
        name = "黯",
        hex = "#41555d",
        color = Color(0xFF41555d),
        intro = "深黑色、泛指黑色"
    )

    object gold_silver : ChKindColor(
        "id = gold_silver",
        name = "金银",
        hex = "#eacd76",
        color = Color(0xFFeacd76),
        intro = ""
    )

    object gold_silver_0 : ChKindColor(
        "id = gold_silver_0",
        name = "赤金",
        hex = "#f2be45",
        color = Color(0xFFf2be45),
        intro = "足金的颜色"
    )

    object gold_silver_1 : ChKindColor(
        "id = gold_silver_1",
        name = "金色",
        hex = "#eacd76",
        color = Color(0xFFeacd76),
        intro = "平均为深黄色带光泽的颜色"
    )

    object gold_silver_2 : ChKindColor(
        "id = gold_silver_2",
        name = "银白",
        hex = "#e9e7ef",
        color = Color(0xFFe9e7ef),
        intro = "带银光的白色"
    )

    object gold_silver_3 : ChKindColor(
        "id = gold_silver_3",
        name = "老银",
        hex = "#bacac6",
        color = Color(0xFFbacac6),
        intro = "金属氧化后的色彩"
    )

    object gold_silver_4 : ChKindColor(
        "id = gold_silver_4",
        name = "乌金",
        hex = "#a78e44",
        color = Color(0xFFa78e44),
        intro = ""
    )

    object gold_silver_5 : ChKindColor(
        "id = gold_silver_5",
        name = "铜绿",
        hex = "#549688",
        color = Color(0xFF549688),
        intro = ""
    )

    companion object {
        val list = listOf(
            red,
            red_0,
            red_1,
            red_2,
            red_3,
            red_4,
            red_5,
            red_6,
            red_7,
            red_8,
            red_9,
            red_10,
            red_11,
            red_12,
            red_13,
            red_14,
            red_15,
            red_16,
            red_17,
            red_18,
            red_19,
            red_20,
            red_21,
            red_22,
            red_23,
            red_24,
            red_25,
            red_26,
            red_27,
            yellow,
            yellow_0,
            yellow_1,
            yellow_2,
            yellow_3,
            yellow_4,
            yellow_5,
            yellow_6,
            yellow_7,
            yellow_8,
            yellow_9,
            yellow_10,
            yellow_11,
            yellow_12,
            yellow_13,
            yellow_14,
            yellow_15,
            yellow_16,
            yellow_17,
            yellow_18,
            yellow_19,
            yellow_20,
            yellow_21,
            yellow_22,
            yellow_23,
            yellow_24,
            yellow_25,
            yellow_26,
            yellow_27,
            green,
            green_0,
            green_1,
            green_2,
            green_3,
            green_4,
            green_5,
            green_6,
            green_7,
            green_8,
            green_9,
            green_10,
            green_11,
            green_12,
            green_13,
            green_14,
            green_15,
            green_16,
            green_17,
            green_18,
            green_19,
            green_20,
            green_21,
            green_22,
            green_23,
            green_24,
            green_25,
            green_26,
            green_27,
            green_28,
            green_29,
            green_30,
            green_31,
            blue,
            blue_0,
            blue_1,
            blue_2,
            blue_3,
            blue_4,
            blue_5,
            blue_6,
            blue_7,
            blue_8,
            blue_9,
            blue_10,
            blue_11,
            blue_12,
            blue_13,
            blue_14,
            blue_15,
            blue_16,
            blue_17,
            blue_18,
            blue_19,
            blue_20,
            blue_21,
            blue_22,
            blue_23,
            blue_24,
            cang,
            cang_0,
            cang_1,
            cang_2,
            cang_3,
            cang_4,
            cang_5,
            water,
            water_0,
            water_1,
            water_2,
            water_3,
            water_4,
            water_5,
            water_6,
            gray,
            gray_0,
            gray_1,
            gray_2,
            gray_3,
            gray_4,
            gray_5,
            gray_6,
            gray_7,
            gray_8,
            gray_9,
            gray_10,
            gray_11,
            gray_12,
            gray_13,
            black,
            black_0,
            black_1,
            black_2,
            black_3,
            black_4,
            black_5,
            black_6,
            black_7,
            black_8,
            black_9,
            black_10,
            black_11,
            black_12,
            black_13,
            black_14,
            gold_silver,
            gold_silver_0,
            gold_silver_1,
            gold_silver_2,
            gold_silver_3,
            gold_silver_4,
            gold_silver_5,
        )
    }


    override fun toString(): String {

        //     val id: String,
        //    val name: String,
        //    val hex: String,
        //    val intro: String,


//        return """
//  object red_1 : ChKindColor("red_1", "藤紫", "#ffb3a7", "即浅红色。别称：妃色、杨妃色、湘妃色、妃红色")
//  object red_1 : ChKindColor("red_1", "藤紫", "#ffb3a7", "")
//
//        """.trimIndent()


        return """object $id : ChKindColor("id = $id", name = "$name", hex = "$hex",color = Color(0xFF${
            hex.replace(
                "#",
                ""
            )
        }), intro = "$intro")"""


    }
}


class ChKindIColorReader : IColorReader {


    override val json: String
        get() = "zhongguofenlei.json"


    override fun getColorList(context: Context): List<ChKindColor> {
        val colors = ArrayList<ChKindColor>()


        val jsonStr = getJsonString(context)
        try {

            //{
            //    "id": 1
            //    "name": "黄",
            //    "hex": "#fff143",
            //    "RGB": [],
            //    "colors": [],
            //}

            val chList = listOf("红", "黄", "绿", "蓝", "苍", "水", "灰白", "黑", "金银")
            val enList = listOf(
                "red",
                "yellow",
                "green",
                "blue",
                "cang",
                "water",
                "gray",
                "black",
                "gold_silver"
            )

            val jsonArray = JSONArray(jsonStr)
            val colorCount = jsonArray.length()
            for (i in 0 until colorCount) {
                val jsonObject = jsonArray.getJSONObject(i)
//     val pinyin = jsonObject.getString("pinyin")
//                    val id = enList[i]+"_"+jsonObject.getInt("id")
                val id = enList[i]
                val name = jsonObject.getString("name")
                val hex = jsonObject.getString("hex")

                colors.add(ChKindColor(id = id, name = name, hex = hex))

                val rgbArray = jsonObject.getJSONArray("RGB")
                val rgbCount = rgbArray.length()
                val rgbList = ArrayList<Int>(3)
                for (r in 0 until rgbCount) {
                    rgbList.add(rgbArray.getInt(r))
                }

                val cArray = jsonObject.getJSONArray("colors")
                val cCount = cArray.length()
                for (c in 0 until cCount) {
                    // {
                    //    "id": "0-0",
                    //    "hex": "#ffb3a7",
                    //    "name": "粉红",
                    //    "intro": "即浅红色。别称：妃色、杨妃色、湘妃色、妃红色",
                    //}

                    val cJsonObject = cArray.getJSONObject(c)

                    val id_ = enList[i] + "_" + cJsonObject.getString("id").substring(2)
                    val name_ = cJsonObject.getString("name")
                    val hex_ = cJsonObject.getString("hex")
                    val intro = if (cJsonObject.has("intro")) {
                        cJsonObject.getString("intro").replace("\"", "'")
                    } else {
                        ""
                    }
                    colors.add(ChKindColor(id_, name_, hex_, intro = intro))

                }


            }
        } catch (e: JSONException) {
            e.printStackTrace()
        }


        colors.forEach {
//            Log.e("zzz", it.toString())
            Log.e("zzz", "${it.id},")
        }

        return colors


    }


}