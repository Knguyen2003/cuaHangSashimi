



CREATE (t1:Table {soBan: "T1", trangThai: "Trống",soGhe:2})
CREATE (t2:Table {soBan: "T2", trangThai: "Trống",soGhe:2})
CREATE (t3:Table {soBan: "T3", trangThai: "Trống",soGhe:2})
CREATE (t4:Table {soBan: "T4", trangThai: "Trống",soGhe:2})

CREATE (t5:Table {soBan: "F1", trangThai: "Trống",soGhe:4})
CREATE (t6:Table {soBan: "F2", trangThai: "Trống",soGhe:4})
CREATE (t7:Table {soBan: "F3", trangThai: "Trống",soGhe:4})
CREATE (t8:Table {soBan: "F4", trangThai: "Trống",soGhe:4})

CREATE (t9:Table {soBan: "E1", trangThai: "Trống",soGhe:8})
CREATE (t10:Table {soBan: "E2", trangThai: "Trống",soGhe:8})
CREATE (t11:Table {soBan: "E3", trangThai: "Trống",soGhe:8})
CREATE (t12:Table {soBan: "E4", trangThai: "Trống",soGhe:8})

CREATE (t13:Table {soBan: "TW4", trangThai: "Trống",soGhe:12})
CREATE (t14:Table {soBan: "TW3", trangThai: "Trống",soGhe:12})
CREATE (t15:Table {soBan: "TW2", trangThai: "Trống",soGhe:12})
CREATE (t16:Table {soBan: "TW1", trangThai: "Trống",soGhe:12})




// Tạo constraint cho các label
CREATE CONSTRAINT unique_table_id FOR (t:Table) REQUIRE t.soBan IS UNIQUE;


//Tạo category
CREATE (c:Category {categoryID: "DR", categoryName: "Nước Uống"})
CREATE (c1:Category {categoryID: "SN", categoryName: "Set Sinh Nhật"})
CREATE (c2:Category {categoryID: "MC", categoryName: "Món Chiên"})
CREATE (c3:Category {categoryID: "CT", categoryName: "Cơm Tô"})
CREATE (c4:Category {categoryID: "MU", categoryName: "Mì Udon"})
CREATE (c5:Category {categoryID: "MN", categoryName: "Món Nướng"})
CREATE (c6:Category {categoryID: "HR", categoryName: "Han Rolls"})
CREATE (c7:Category {categoryID: "KV", categoryName: "Khai Vị"})
CREATE (c8:Category {categoryID: "NR", categoryName: "Nigiri"})
CREATE (c9:Category {categoryID: "CC", categoryName: "Cơm Cuộn"})
CREATE (c10:Category {categoryID: "IA", categoryName: "ichiana awesome"})
CREATE (c11:Category {categoryID: "CB", categoryName: "Combo"})
CREATE (c12:Category {categoryID: "SM", categoryName: "Sashimi"})
//Tạo constraint cho các Category
CREATE CONSTRAINT unique_category_id FOR (t:Category) REQUIRE t.categoryID IS UNIQUE;

//Tạo Food
MATCH (c:Category {categoryID: "DR"})
CREATE (f1:Food {foodID: "DR01", foodName: "KIWI", price:65000, img:"/Menu Sashimi/Nước uống/TRA-HIBI-KIWI-GHEP-ANH-450x450.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f2:Food {foodID: "DR02", foodName: "Trà Đào", price:65000, img:"/Menu Sashimi/Nước uống/tra-vai-hibicus-ghep-anh-450x450.jpg", soLuong:100, trangThai:1 }) -[:BELONG_TO]-> (c)
CREATE (f3:Food {foodID: "DR03", foodName: "Trà Dâu", price:65000, img:"/Menu Sashimi/Nước uống/TRA-DAU-GHEP-ANH-450x450.jpg", soLuong:100, trangThai:1 }) -[:BELONG_TO]-> (c)
CREATE (f4:Food {foodID: "DR04", foodName: "Trà Nhài Sen", price:95000, img:"/Menu Sashimi/Nước uống/TRA-NHAI-SEN-450x450.jpg", soLuong:100, trangThai:1 }) -[:BELONG_TO]-> (c)
CREATE (f5:Food {foodID: "DR05", foodName: "Trà Vải", price:75000, img:"/Menu Sashimi/Nước uống/TRA-VAI-GHEP-ANH-450x450.jpg", soLuong:100, trangThai:1 }) -[:BELONG_TO]-> (c)
CREATE (f6:Food {foodID: "DR06", foodName: "Trà Quế", price:65000, img:"/Menu Sashimi/Nước uống/TRA-QUE-450x450.jpg", soLuong:100, trangThai:1 }) -[:BELONG_TO]-> (c)
CREATE (f7:Food {foodID: "DR07", foodName: "Trà Xoài", price:65000, img:"/Menu Sashimi/Nước uống/TRA-XOAI-GHEP-ANH-450x450.jpg", soLuong:100, trangThai:1 }) -[:BELONG_TO]-> (c)
CREATE (f8:Food {foodID: "DR08", foodName: "Trà Nhài Mật Ong ", price:95000, img:"/Menu Sashimi/Nước uống/TRA-NHAI-MAT-ONG-450x450.jpg", soLuong:100, trangThai:1 }) -[:BELONG_TO]-> (c)


//Tạo constraint cho các Food
MATCH (c:Category {categoryID: "SN"})
CREATE (f9:Food {foodID: "SN01", foodName: "SushiCake5", price:1999000, img:"/Menu Sashimi/Set Sinh Nhật/SushiCake5_4.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f10:Food {foodID: "SN02", foodName: "SushiCake13", price:1659000, img:"/Menu Sashimi/Set Sinh Nhật/SushiCake13.jpg", soLuong:100, trangThai:1 }) -[:BELONG_TO]-> (c)
CREATE (f11:Food {foodID: "SN03", foodName: "SushiCake1", price:2265000, img:"/Menu Sashimi/Set Sinh Nhật/SushiCake1_3.jpg", soLuong:100, trangThai:1 }) -[:BELONG_TO]-> (c)
CREATE (f12:Food {foodID: "SN04", foodName: "Cake7", price:1995000, img:"/Menu Sashimi/Set Sinh Nhật/Cake7.jpg", soLuong:100, trangThai:1 }) -[:BELONG_TO]-> (c)
CREATE (f13:Food {foodID: "SN05", foodName: "SushiCake2", price:2475000, img:"/Menu Sashimi/Set Sinh Nhật/SushiCake2.jpg", soLuong:100, trangThai:1 }) -[:BELONG_TO]-> (c)
CREATE (f14:Food {foodID: "SN06", foodName: "SushiCake6_5", price:1565000, img:"/Menu Sashimi/Set Sinh Nhật/SushiCake6_5.jpg", soLuong:100, trangThai:1 }) -[:BELONG_TO]-> (c)
CREATE (f15:Food {foodID: "SN07", foodName: "SushiCake14", price:2965000, img:"/Menu Sashimi/Set Sinh Nhật/SushiCake14.jpg", soLuong:100, trangThai:1 }) -[:BELONG_TO]-> (c)
CREATE (f16:Food {foodID: "SN08", foodName: "SushiCake1B_1", price:3195000, img:"/Menu Sashimi/Set Sinh Nhật/SushiCake1B_1.jpg", soLuong:100, trangThai:1 }) -[:BELONG_TO]-> (c)
CREATE (f17:Food {foodID: "SN09", foodName: "SushiCake12_1", price:2895000, img:"/Menu Sashimi/Set Sinh Nhật/SushiCake12_1.jpg", soLuong:100, trangThai:1 }) -[:BELONG_TO]-> (c)
CREATE (f18:Food {foodID: "SN10", foodName: "SushiCake10_1", price:1975000, img:"/Menu Sashimi/Set Sinh Nhật/SushiCake10_1.jpg", soLuong:100, trangThai:1 }) -[:BELONG_TO]-> (c)
CREATE (f19:Food {foodID: "SN11", foodName: "SushiCake4_1", price:2465000, img:"/Menu Sashimi/Set Sinh Nhật/SushiCake4_1.jpg", soLuong:100, trangThai:1 }) -[:BELONG_TO]-> (c)
CREATE (f20:Food {foodID: "SN12", foodName: "SushiCake3_1", price:1765000, img:"/Menu Sashimi/Set Sinh Nhật/SushiCake3_1.jpg", soLuong:100, trangThai:1 }) -[:BELONG_TO]-> (c)
CREATE (f21:Food {foodID: "SN13", foodName: "SushiCake11_1", price:2495000, img:"/Menu Sashimi/Set Sinh Nhật/SushiCake11_1.jpg", soLuong:100, trangThai:1 }) -[:BELONG_TO]-> (c)




MATCH (c:Category {categoryID: "MC"})
CREATE (f22:Food {foodID: "MC01", foodName: "FU9-BeefPhoFurai", price:199000, img:"/Menu Sashimi/Món chiên/FU9-BeefPhoFurai.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f23:Food {foodID: "MC02", foodName: "FU8-SakeYakimesiFixed", price:169000, img:"/Menu Sashimi/Món chiên/FU8-SakeYakimesiFixed.jpg", soLuong:100, trangThai:1 }) -[:BELONG_TO]-> (c)
CREATE (f24:Food {foodID: "MC03", foodName: "FU5-ShrimpTempura", price:159000, img:"/Menu Sashimi/Món chiên/FU5-ShrimpTempura.jpg", soLuong:100, trangThai:1 }) -[:BELONG_TO]-> (c)
CREATE (f25:Food {foodID: "MC04", foodName: "FU1-TonkatsuFixed", price:219000, img:"/Menu Sashimi/Món chiên/FU1-TonkatsuFixed.jpg", soLuong:100, trangThai:1 }) -[:BELONG_TO]-> (c)


MATCH (c:Category {categoryID: "CT"})
CREATE (f26:Food {foodID: "CT01", foodName: "DON10-CurryRice", price:169000, img:"/Menu Sashimi/Cơm Tô/DON10-CurryRice.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f27:Food {foodID: "CT02", foodName: "DON7-Unadon", price:169000, img:"/Menu Sashimi/Cơm Tô/DON7-Unadon.jpg", soLuong:100, trangThai:1 }) -[:BELONG_TO]-> (c)
CREATE (f28:Food {foodID: "CT03", foodName: "DON5-GyudonSw20D20", price:189000, img:"/Menu Sashimi/Cơm Tô/DON5-GyudonSw20D20.jpg", soLuong:100, trangThai:1 }) -[:BELONG_TO]-> (c)
CREATE (f29:Food {foodID: "CT04", foodName: "DON3-SakeTeridonV20St10Sw20D30", price:189000, img:"/Menu Sashimi/Cơm Tô/DON3-SakeTeridonV20St10Sw20D30.jpg", soLuong:100, trangThai:1 }) -[:BELONG_TO]-> (c)
CREATE (f30:Food {foodID: "CT05", foodName: "DON2-ToriTeridon", price:169000, img:"/Menu Sashimi/Cơm Tô/DON2-ToriTeridon.jpg", soLuong:100, trangThai:1 }) -[:BELONG_TO]-> (c)
CREATE (f31:Food {foodID: "CT06", foodName: "DON1-KatsudonF", price:169000, img:"/Menu Sashimi/Cơm Tô/DON1-KatsudonF.jpg", soLuong:100, trangThai:1 }) -[:BELONG_TO]-> (c)

MATCH (c:Category {categoryID: "MU"})
CREATE (f32:Food {foodID: "MU01", foodName: "UD10-CreamySeafoodPastaSw40D30_1", price:119000, img:"/Menu Sashimi/Mì Udon/UD10-CreamySeafoodPastaSw40D30_1.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f33:Food {foodID: "MU02", foodName: "UD9-SpaghettiV80Sw20D10", price:129000, img:"/Menu Sashimi/Mì Udon/UD9-SpaghettiV80Sw20D10.jpg", soLuong:100, trangThai:1 }) -[:BELONG_TO]-> (c)
CREATE (f34:Food {foodID: "MU03", foodName: "UD8-ZaruSobaFixed", price:139000, img:"/Menu Sashimi/Mì Udon/UD8-ZaruSobaFixed.jpg", soLuong:100, trangThai:1 }) -[:BELONG_TO]-> (c)
CREATE (f35:Food {foodID: "MU04", foodName: "UD7.3-YakiUdonSeafoodFixed", price:119000, img:"/Menu Sashimi/Mì Udon/UD7.3-YakiUdonSeafoodFixed.jpg", soLuong:100, trangThai:1 }) -[:BELONG_TO]-> (c)
CREATE (f36:Food {foodID: "MU05", foodName: "UD7.2-YakiUdonBeefFixed", price:129000, img:"/Menu Sashimi/Mì Udon/UD7.2-YakiUdonBeefFixed.jpg", soLuong:100, trangThai:1 }) -[:BELONG_TO]-> (c)
CREATE (f37:Food {foodID: "MU06", foodName: "UD7.1-YakiUdonChicken", price:139000, img:"/Menu Sashimi/Mì Udon/UD7.1-YakiUdonChicken.jpg", soLuong:100, trangThai:1 }) -[:BELONG_TO]-> (c)
CREATE (f38:Food {foodID: "MU07", foodName: "UD5-NikuUdonFixed", price:139000, img:"/Menu Sashimi/Mì Udon/UD5-NikuUdonFixed.jpg", soLuong:100, trangThai:1 }) -[:BELONG_TO]-> (c)
CREATE (f39:Food {foodID: "MU08", foodName: "UD4-SukiyakiUdonFixed", price:119000, img:"/Menu Sashimi/Mì Udon/UD4-SukiyakiUdonFixed.jpg", soLuong:100, trangThai:1 }) -[:BELONG_TO]-> (c)
CREATE (f40:Food {foodID: "MU09", foodName: "UD3-TempuraUdonFixed", price:129000, img:"/Menu Sashimi/Mì Udon/UD3-TempuraUdonFixed.jpg", soLuong:100, trangThai:1 }) -[:BELONG_TO]-> (c)
CREATE (f41:Food {foodID: "MU10", foodName: "UD2-SabusabuFixed", price:139000, img:"/Menu Sashimi/Mì Udon/UD2-SabusabuFixed.jpg", soLuong:100, trangThai:1 }) -[:BELONG_TO]-> (c)
CREATE (f42:Food {foodID: "MU11", foodName: "UD1.1-NabeyakiUdonV80Sw60D20", price:139000, img:"/Menu Sashimi/Mì Udon/UD1.1-NabeyakiUdonV80Sw60D20.jpg", soLuong:100, trangThai:1 }) -[:BELONG_TO]-> (c)


MATCH (c:Category {categoryID: "MN"})
CREATE (f43:Food {foodID: "MN01", foodName: "YA22-TunaKamaV40Hi20Sw100", price:169000, img:"/Menu Sashimi/Món Nướng_ yaki/YA22-TunaKamaV40Hi20Sw100.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f44:Food {foodID: "MN02", foodName: "ya12-filet-mignon", price:169000, img:"/Menu Sashimi/Món Nướng_ yaki/ya12-filet-mignon.jpg", soLuong:100, trangThai:1 }) -[:BELONG_TO]-> (c)
CREATE (f45:Food {foodID: "MN03", foodName: "YA11-HamachiKama1", price:169000, img:"/Menu Sashimi/Món Nướng_ yaki/YA11-HamachiKama1.jpg", soLuong:100, trangThai:1 }) -[:BELONG_TO]-> (c)
CREATE (f46:Food {foodID: "MN04", foodName: "ya8-wagyu", price:169000, img:"/Menu Sashimi/Món Nướng_ yaki/ya8-wagyu.jpg", soLuong:100, trangThai:1 }) -[:BELONG_TO]-> (c)
CREATE (f47:Food {foodID: "MN05", foodName: "YA6-SalmonHeadYaki", price:169000, img:"/Menu Sashimi/Món Nướng_ yaki/YA6-SalmonHeadYaki.jpg", soLuong:100, trangThai:1 }) -[:BELONG_TO]-> (c)
CREATE (f48:Food {foodID: "MN06", foodName: "YA5-SanmaYaki", price:169000, img:"/Menu Sashimi/Món Nướng_ yaki/YA5-SanmaYaki.jpg", soLuong:100, trangThai:1 }) -[:BELONG_TO]-> (c)
CREATE (f49:Food {foodID: "MN07", foodName: "YA4-SabaYaki_1", price:169000, img:"/Menu Sashimi/Món Nướng_ yaki/YA4-SabaYaki_1.jpg", soLuong:100, trangThai:1 }) -[:BELONG_TO]-> (c)
CREATE (f50:Food {foodID: "MN08", foodName: "YA3-SakeTeriyakiV40St10Sw30D40", price:169000, img:"/Menu Sashimi/Món Nướng_ yaki/YA3-SakeTeriyakiV40St10Sw30D40.jpg", soLuong:100, trangThai:1 }) -[:BELONG_TO]-> (c)
CREATE (f51:Food {foodID: "MN09", foodName: "YA1-GrilledChickenTeriyakiV40Sw50D20", price:169000, img:"/Menu Sashimi/Món Nướng_ yaki/YA1-GrilledChickenTeriyakiV40Sw50D20.jpg", soLuong:100, trangThai:1 }) -[:BELONG_TO]-> (c)



MATCH (c:Category {categoryID: "HR"})
CREATE (f52:Food {foodID: "HR01", foodName: "HR9-PokiHandroll", price:169000, img:"/Menu Sashimi/Han Rolls/HR9-PokiHandroll.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f53:Food {foodID: "HR02", foodName: "HR7-SalmonSkinHandRollFixed", price:169000, img:"/Menu Sashimi/Han rolls/HR7-SalmonSkinHandRollFixed.jpg", soLuong:100, trangThai:1 }) -[:BELONG_TO]-> (c)
CREATE (f54:Food {foodID: "HR03", foodName: "HR6-SpicyHotateHandRolFixed", price:169000, img:"/Menu Sashimi/Han rolls/HR6-SpicyHotateHandRolFixed.jpg", soLuong:100, trangThai:1 }) -[:BELONG_TO]-> (c)
CREATE (f55:Food {foodID: "HR04", foodName: "HR5-SpicyTunaHandRollFixed", price:169000, img:"/Menu Sashimi/Han rolls/HR5-SpicyTunaHandRollFixed.jpg", soLuong:100, trangThai:1 }) -[:BELONG_TO]-> (c)
CREATE (f56:Food {foodID: "HR05", foodName: "HR4-CaliforniaHandRoll10", price:169000, img:"/Menu Sashimi/Han rolls/HR4-CaliforniaHandRoll10.jpg", soLuong:100, trangThai:1 }) -[:BELONG_TO]-> (c)
CREATE (f57:Food {foodID: "HR06", foodName: "HR3-SakeHandRollFixed", price:169000, img:"/Menu Sashimi/Han rolls/HR3-SakeHandRollFixed.jpg", soLuong:100, trangThai:1 }) -[:BELONG_TO]-> (c)
CREATE (f58:Food {foodID: "HR07", foodName: "HR2-TempuraHandRollFixed", price:169000, img:"/Menu Sashimi/Han rolls/HR2-TempuraHandRollFixed.jpg", soLuong:100, trangThai:1 }) -[:BELONG_TO]-> (c)
CREATE (f59:Food {foodID: "HR08", foodName: "HR1-UnagiHandRollFixed", price:169000, img:"/Menu Sashimi/Han rolls/HR1-UnagiHandRollFixed.jpg", soLuong:100, trangThai:1 }) -[:BELONG_TO]-> (c)



MATCH (c:Category {categoryID: "KV"})
CREATE (f60:Food {foodID: "KV01", foodName: "AP36-DoritoChips_1", price:69000, img:"/Menu Sashimi/Khai Vị/AP36-DoritoChips_1.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f61:Food {foodID: "KV02", foodName: "ap35-tekka-take", price:369000, img:"/Menu Sashimi/Khai Vị/ap35-tekka-take.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f62:Food {foodID: "KV03", foodName: "AP33-KaniYakiV20St10Hi70Sw60D50", price:379000, img:"/Menu Sashimi/Khai Vị/AP33-KaniYakiV20St10Hi70Sw60D50.jpg", soLuong:100, trangThai:1 }) -[:BELONG_TO]-> (c)
CREATE (f63:Food {foodID: "KV04", foodName: "AP32-NoriVi50Sa50D40", price:79000, img:"/Menu Sashimi/Khai Vị/AP32-NoriVi50Sa50D40.jpg", soLuong:100, trangThai:1 }) -[:BELONG_TO]-> (c)
CREATE (f64:Food {foodID: "KV05", foodName: "AP51-JapaneseShisoLeafV40Hi30Sw50D40_1", price:39000, img:"/Menu Sashimi/Khai Vị/AP51-JapaneseShisoLeafV40Hi30Sw50D40_1.jpg", soLuong:100, trangThai:1 }) -[:BELONG_TO]-> (c)
CREATE (f65:Food {foodID: "KV06", foodName: "AP29-AgedashiTofu1", price:189000, img:"/Menu Sashimi/Khai Vị/AP29-AgedashiTofu1.jpg", soLuong:100, trangThai:1 }) -[:BELONG_TO]-> (c)
CREATE (f66:Food {foodID: "KV07", foodName: "ap28-grilled-salmon-belly", price:269000, img:"/Menu Sashimi/Khai Vị/ap28-grilled-salmon-belly.jpg", soLuong:100, trangThai:1 }) -[:BELONG_TO]-> (c)
CREATE (f67:Food {foodID: "KV08", foodName: "AP27-SteamedRiceFixed", price:29000, img:"/Menu Sashimi/Khai Vị/AP27-SteamedRiceFixed.jpg", soLuong:100, trangThai:1 }) -[:BELONG_TO]-> (c)
CREATE (f68:Food {foodID: "KV09", foodName: "AP26-MisoMushroomV30St10Br30Sw40D40", price:69000, img:"/Menu Sashimi/Khai Vị/AP26-MisoMushroomV30St10Br30Sw40D40.jpg", soLuong:100, trangThai:1 }) -[:BELONG_TO]-> (c)
CREATE (f69:Food {foodID: "KV10", foodName: "AP25-MisoSoup", price:69000, img:"/Menu Sashimi/Khai Vị/AP25-MisoSoup.jpg", soLuong:100, trangThai:1 }) -[:BELONG_TO]-> (c)
CREATE (f70:Food {foodID: "KV11", foodName: "AP24-YakiMozzarellaV80Sw20D70", price:49000, img:"/Menu Sashimi/Khai Vị/AP24-YakiMozzarellaV80Sw20D70.jpg", soLuong:100, trangThai:1 }) -[:BELONG_TO]-> (c)
CREATE (f71:Food {foodID: "KV12", foodName: "AP17-Chawanmushi1", price:89000, img:"/Menu Sashimi/Khai Vị/AP17-Chawanmushi1.jpg", soLuong:100, trangThai:1 }) -[:BELONG_TO]-> (c)
CREATE (f72:Food {foodID: "KV13", foodName: "AP8-SoftShellCrabTempura", price:99000, img:"/Menu Sashimi/Khai Vị/AP8-SoftShellCrabTempura.jpg", soLuong:100, trangThai:1 }) -[:BELONG_TO]-> (c)
CREATE (f73:Food {foodID: "KV14", foodName: "AP7-VegetableTempura1", price:69000, img:"/Menu Sashimi/Khai Vị/AP7-VegetableTempura1.jpg", soLuong:100, trangThai:1 }) -[:BELONG_TO]-> (c)
CREATE (f74:Food {foodID: "KV15", foodName: "AP6-EbiTempura", price:69000, img:"/Menu Sashimi/Khai Vị/AP6-EbiTempura.jpg", soLuong:100, trangThai:1 }) -[:BELONG_TO]-> (c)
CREATE (f75:Food {foodID: "KV16", foodName: "AP5-Tempura1", price:69000, img:"/Menu Sashimi/Khai Vị/AP5-Tempura1.jpg", soLuong:100, trangThai:1 }) -[:BELONG_TO]-> (c)
CREATE (f76:Food {foodID: "KV17", foodName: "AP3-PorkGyoza", price:99000, img:"/Menu Sashimi/Khai Vị/AP3-PorkGyoza.jpg", soLuong:100, trangThai:1 }) -[:BELONG_TO]-> (c)
CREATE (f77:Food {foodID: "KV18", foodName: "AP2-IchiEdamame1", price:269000, img:"/Menu Sashimi/Khai Vị/AP2-IchiEdamame1.jpg", soLuong:100, trangThai:1 }) -[:BELONG_TO]-> (c)
CREATE (f78:Food {foodID: "KV19", foodName: "AP1-EdamameV40St40Sw30D40", price:49000, img:"/Menu Sashimi/Khai Vị/AP1-EdamameV40St40Sw30D40.jpg", soLuong:100, trangThai:1 }) -[:BELONG_TO]-> (c)

MATCH (c:Category {categoryID: "NR"})
CREATE (f79:Food {foodID: "NR01", foodName: "NI37-SakeGunkanNigiri1", price:119000, img:"/Menu Sashimi/Nigiri/NI37-SakeGunkanNigiri1.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f80:Food {foodID: "NR02", foodName: "NI31-NishinWasabiNigiri", price:119000, img:"/Menu Sashimi/Nigiri/NI31-NishinWasabiNigiri.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f81:Food {foodID: "NR03", foodName: "NI30-TobikoWasabiNigiriFixed", price:99000, img:"/Menu Sashimi/Nigiri/NI30-TobikoWasabiNigiriFixed.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f82:Food {foodID: "NR04", foodName: "NI27-KakiFreshLaptop", price:119000, img:"/Menu Sashimi/Nigiri/NI27-KakiFreshLaptop.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f83:Food {foodID: "NR05", foodName: "NI25-HoneyMoonerFixed", price:119000, img:"/Menu Sashimi/Nigiri/NI25-HoneyMoonerFixed.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f84:Food {foodID: "NR06", foodName: "NI24-TempuraNigiriFixed", price:99000, img:"/Menu Sashimi/Nigiri/NI24-TempuraNigiriFixed.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f85:Food {foodID: "NR07", foodName: "NI23-MangoNigiriFixed", price:99000, img:"/Menu Sashimi/Nigiri/NI23-MangoNigiriFixed.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f86:Food {foodID: "NR08", foodName: "NI22-InariNigiriV30Sw60", price:69000, img:"/Menu Sashimi/Nigiri/NI22-InariNigiriV30Sw60.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f87:Food {foodID: "NR09", foodName: "NI21-TamagoNigiriV60Sw30D40", price:69000, img:"/Menu Sashimi/Nigiri/NI21-TamagoNigiriV60Sw30D40.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f88:Food {foodID: "NR10", foodName: "NI20-CookedSeaPrawnNigiri", price:99000, img:"/Menu Sashimi/Nigiri/NI20-CookedSeaPrawnNigiri.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f89:Food {foodID: "NR11", foodName: "NI19.2-IkuraTamaNigiriFixed", price:99000, img:"/Menu Sashimi/Nigiri/NI19.2-IkuraTamaNigiriFixed.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f90:Food {foodID: "NR12", foodName: "NI19-IkuraNigiriFixed", price:99000, img:"/Menu Sashimi/Nigiri/NI19-IkuraNigiriFixed.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f91:Food {foodID: "NR13", foodName: "NI18.2-TobikoTamaNigiriFixed", price:99000, img:"/Menu Sashimi/Nigiri/NI18.2-TobikoTamaNigiriFixed.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f92:Food {foodID: "NR14", foodName: "NI18.1-TobikoV100Hi20D90_1", price:99000, img:"/Menu Sashimi/Nigiri/NI18.1-TobikoV100Hi20D90_1.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f93:Food {foodID: "NR15", foodName: "NI17-KaniNigiriSt25Hi20Sw50Dt40", price:69000, img:"/Menu Sashimi/Nigiri/NI17-KaniNigiriSt25Hi20Sw50Dt40.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f94:Food {foodID: "NR16", foodName: "NI16-UnagiNigiriFixed", price:69000, img:"/Menu Sashimi/Nigiri/NI16-UnagiNigiriFixed.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f95:Food {foodID: "NR17", foodName: "NI15-HokkigaiNigiriFixed", price:69000, img:"/Menu Sashimi/Nigiri/NI15-HokkigaiNigiriFixed.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f96:Food {foodID: "NR18", foodName: "NI14-UniNigiriFixed", price:69000, img:"/Menu Sashimi/Nigiri/NI14-UniNigiriFixed.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f97:Food {foodID: "NR19", foodName: "NI13-AmaebiNigiriSw15D20", price:69000, img:"/Menu Sashimi/Nigiri/NI13-AmaebiNigiriSw15D20.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f98:Food {foodID: "NR20", foodName: "NI11-HotateNigiriFixed", price:69000, img:"/Menu Sashimi/Nigiri/NI11-HotateNigiriFixed.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f99:Food {foodID: "NR21", foodName: "NI10-IkaNigiriFixed", price:69000, img:"/Menu Sashimi/Nigiri/NI10-IkaNigiriFixed.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f100:Food {foodID: "NR22", foodName: "NI9-TakoNigiriFixed", price:69000, img:"/Menu Sashimi/Nigiri/NI9-TakoNigiriFixed.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f101:Food {foodID: "NR23", foodName: "NI8-ShimeSabaFixed", price:69000, img:"/Menu Sashimi/Nigiri/NI8-ShimeSabaFixed.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f102:Food {foodID: "NR24", foodName: "NI6-NishinNigiri", price:69000, img:"/Menu Sashimi/Nigiri/NI6-NishinNigiri.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f103:Food {foodID: "NR25", foodName: "NI5-MekajikiNigiriFixed", price:99000, img:"/Menu Sashimi/Nigiri/NI5-MekajikiNigiriFixed.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f104:Food {foodID: "NR26", foodName: "NI4-HamachiNigiri", price:99000, img:"/Menu Sashimi/Nigiri/NI4-HamachiNigiri.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f105:Food {foodID: "NR27", foodName: "NI3-SakeToroNigiri", price:99000, img:"/Menu Sashimi/Nigiri/NI3-SakeToroNigiri.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f106:Food {foodID: "NR28", foodName: "NI2-SakeNigiri1", price:99000, img:"/Menu Sashimi/Nigiri/NI2-SakeNigiri1.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f107:Food {foodID: "NR29", foodName: "NI1-MaguroNigiriHi60D20", price:99000, img:"/Menu Sashimi/Nigiri/NI1-MaguroNigiriHi60D20.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)


MATCH (c:Category {categoryID: "CC"})
CREATE (f108:Food {foodID: "CC01", foodName: "MA21-PokiMaki1", price:169000, img:"/Menu Sashimi/Cơm Cuộn/MA21-PokiMaki1.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f109:Food {foodID: "CC02", foodName: "MA20-AvocadoSalmonMakiFixed", price:169000, img:"/Menu Sashimi/Cơm Cuộn/MA20-AvocadoSalmonMakiFixed.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f110:Food {foodID: "CC03", foodName: "MA19-MangoMakiV20Hi10Sw40D15", price:169000, img:"/Menu Sashimi/Cơm Cuộn/MA19-MangoMakiV20Hi10Sw40D15.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f111:Food {foodID: "CC04", foodName: "MA18-SpicySalmonMaki1", price:169000, img:"/Menu Sashimi/Cơm Cuộn/MA18-SpicySalmonMaki1.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f112:Food {foodID: "CC05", foodName: "MA17-IkaMakiFixed", price:169000, img:"/Menu Sashimi/Cơm Cuộn/MA17-IkaMakiFixed.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f113:Food {foodID: "CC06", foodName: "MA16-EbiMaki", price:169000, img:"/Menu Sashimi/Cơm Cuộn/MA16-EbiMaki.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f114:Food {foodID: "CC07", foodName: "MA15-TempuraMakiV30St10Hi20D50_1", price:169000, img:"/Menu Sashimi/Cơm Cuộn/MA15-TempuraMakiV30St10Hi20D50_1.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f115:Food {foodID: "CC08", foodName: "MA14-SalmonSkinMakiFixed", price:169000, img:"/Menu Sashimi/Cơm Cuộn/MA14-SalmonSkinMakiFixed.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f116:Food {foodID: "CC09", foodName: "MA13-FutoMakiFixed", price:169000, img:"/Menu Sashimi/Cơm Cuộn/MA13-FutoMakiFixed.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f117:Food {foodID: "CC10", foodName: "MA12-CaterpillarMaki", price:169000, img:"/Menu Sashimi/Cơm Cuộn/MA12-CaterpillarMaki.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f118:Food {foodID: "CC11", foodName: "MA11-SpicyTunaMaki1", price:169000, img:"/Menu Sashimi/Cơm Cuộn/MA11-SpicyTunaMaki1.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f119:Food {foodID: "CC12", foodName: "MA10-CrispyMakiFixed", price:169000, img:"/Menu Sashimi/Cơm Cuộn/MA10-CrispyMakiFixed.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f120:Food {foodID: "CC13", foodName: "MA9-AbokadoUnagiMakiFixed", price:169000, img:"/Menu Sashimi/Cơm Cuộn/MA9-AbokadoUnagiMakiFixed.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f121:Food {foodID: "CC14", foodName: "MA8-RainbowMakiFixed", price:169000, img:"/Menu Sashimi/Cơm Cuộn/MA8-RainbowMakiFixed.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f122:Food {foodID: "CC15", foodName: "MA7-SpiderMakiFixed", price:169000, img:"/Menu Sashimi/Cơm Cuộn/MA7-SpiderMakiFixed.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f123:Food {foodID: "CC16", foodName: "MA6-AbokadoMakiFixed", price:169000, img:"/Menu Sashimi/Cơm Cuộn/MA6-AbokadoMakiFixed.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f124:Food {foodID: "CC17", foodName: "MA5-OshinkoMakiFixed", price:169000, img:"/Menu Sashimi/Cơm Cuộn/MA5-OshinkoMakiFixed.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f125:Food {foodID: "CC18", foodName: "MA4-KappaMakiFixed", price:169000, img:"/Menu Sashimi/Cơm Cuộn/MA4-KappaMakiFixed.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f126:Food {foodID: "CC19", foodName: "MA3-SakeMaki", price:169000, img:"/Menu Sashimi/Cơm Cuộn/MA3-SakeMaki.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f127:Food {foodID: "CC20", foodName: "MA2-TekkaMakiFixed", price:169000, img:"/Menu Sashimi/Cơm Cuộn/MA2-TekkaMakiFixed.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f128:Food {foodID: "CC21", foodName: "MA1-CaliforniaMakiFixed", price:169000, img:"/Menu Sashimi/Cơm Cuộn/MA1-CaliforniaMakiFixed.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)

MATCH (c:Category {categoryID: "IA"})
CREATE (f129:Food {foodID: "IA01", foodName: "IA26-Hirakura_2", price:569000, img:"/Menu Sashimi/Ichihana Awesome/IA26-Hirakura_2.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f130:Food {foodID: "IA02", foodName: "IA25-Tektakekura_2", price:269000, img:"/Menu Sashimi/Ichihana Awesome/IA25-Tektakekura_2.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f131:Food {foodID: "IA03", foodName: "IA24-HanaMaki_1", price:469000, img:"/Menu Sashimi/Ichihana Awesome/IA24-HanaMaki_1.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f132:Food {foodID: "IA04", foodName: "IA23-SurfinUSAMakiSt30Hi30Sw40D40", price:199000, img:"/Menu Sashimi/Ichihana Awesome/IA23-SurfinUSAMakiSt30Hi30Sw40D40.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f133:Food {foodID: "IA05", foodName: "ComIA22-HamachiJalapenoPeppersFixedboE", price:169000, img:"/Menu Sashimi/Ichihana Awesome/IA22-HamachiJalapenoPeppersFixed.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f134:Food {foodID: "IA06", foodName: "IA20-NikuKimsa", price:269000, img:"/Menu Sashimi/Ichihana Awesome/IA20-NikuKimsa.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f135:Food {foodID: "IA07", foodName: "IA18-MexiCaliRollV70Hi30D30", price:269000, img:"/Menu Sashimi/Ichihana Awesome/IA18-MexiCaliRollV70Hi30D30.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f136:Food {foodID: "IA08", foodName: "IA17-SpiderManNigiri2", price:259000, img:"/Menu Sashimi/Ichihana Awesome/IA17-SpiderManNigiri2.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f137:Food {foodID: "IA09", foodName: "IA16-SambaMakiBr40", price:249000, img:"/Menu Sashimi/Ichihana Awesome/IA16-SambaMakiBr40.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f138:Food {foodID: "IA10", foodName: "IA15-RockAndRollMaki1", price:169000, img:"/Menu Sashimi/Ichihana Awesome/IA15-RockAndRollMaki1.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f139:Food {foodID: "IA11", foodName: "ia14-teka-tarta", price:169000, img:"/Menu Sashimi/Ichihana Awesome/ia14-teka-tarta.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f140:Food {foodID: "IA12", foodName: "IA13-SalmonTartaSw30", price:469000, img:"/Menu Sashimi/Ichihana Awesome/IA13-SalmonTartaSw30.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f141:Food {foodID: "IA13", foodName: "IA12-FrenchMakiFixed", price:269000, img:"/Menu Sashimi/Ichihana Awesome/IA12-FrenchMakiFixed.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f142:Food {foodID: "IA14", foodName: "ComboNIA11-ItalyMakiFixed", price:269000, img:"/Menu Sashimi/Ichihana Awesome/IA11-ItalyMakiFixed.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f143:Food {foodID: "IA15", foodName: "IA10-KoreaMakiFixed", price:269000, img:"/Menu Sashimi/Ichihana Awesome/IA10-KoreaMakiFixed.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f144:Food {foodID: "IA16", foodName: "IA9-IchihanaHana", price:299000, img:"/Menu Sashimi/Ichihana Awesome/IA9-IchihanaHana.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f145:Food {foodID: "IA17", foodName: "IA8-SakeBotoNigiriSw60", price:169000, img:"/Menu Sashimi/Ichihana Awesome/IA8-SakeBotoNigiriSw60.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f146:Food {foodID: "IA18", foodName: "IA7-KanigiNigiriSt20Hi20Sw40Dt30", price:169000, img:"/Menu Sashimi/Ichihana Awesome/IA7-KanigiNigiriSt20Hi20Sw40Dt30.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f147:Food {foodID: "IA19", foodName: "IA6-USAMakiSw10", price:269000, img:"/Menu Sashimi/Ichihana Awesome/IA6-USAMakiSw10.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f148:Food {foodID: "IA20", foodName: "IA5-SaigonMakiV40Sw40D20", price:199000, img:"/Menu Sashimi/Ichihana Awesome/IA5-SaigonMakiV40Sw40D20.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f149:Food {foodID: "IA21", foodName: "IA4-JapanMaki", price:169000, img:"/Menu Sashimi/Ichihana Awesome/IA4-JapanMaki.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f150:Food {foodID: "IA22", foodName: "IA3-TokyoMaki1", price:169000, img:"/Menu Sashimi/Ichihana Awesome/IA3-TokyoMaki1.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f151:Food {foodID: "IA23", foodName: "IA2-DragonRollSt20Sw60D30", price:169000, img:"/Menu Sashimi/Ichihana Awesome/IA2-DragonRollSt20Sw60D30.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f152:Food {foodID: "IA24", foodName: "IA1-MrVanMakiV20St10D20", price:169000, img:"/Menu Sashimi/Ichihana Awesome/IA1-MrVanMakiV20St10D20.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)


MATCH (c:Category {categoryID: "CB"})
CREATE (f153:Food {foodID: "CB01", foodName: "SuperPremiumBoat", price:3699000, img:"/Menu Sashimi/Combo/SuperPremiumBoat.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f154:Food {foodID: "CB02", foodName: "SuperPremium3", price:4169000, img:"/Menu Sashimi/Combo/SuperPremium3.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f155:Food {foodID: "CB03", foodName: "SuperPremium2", price:2169000, img:"/Menu Sashimi/Combo/SuperPremium2.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f156:Food {foodID: "CB04", foodName: "SuperPremium1", price:3969000, img:"/Menu Sashimi/Combo/SuperPremium1.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f157:Food {foodID: "CB05", foodName: "SupremeOmakase5", price:5169000, img:"/Menu Sashimi/Combo/SupremeOmakase5.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f158:Food {foodID: "CB06", foodName: "SupremeOmakase4", price:6569000, img:"/Menu Sashimi/Combo/SupremeOmakase4.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f159:Food {foodID: "CB07", foodName: "SupremeOmakase3", price:2369000, img:"/Menu Sashimi/Combo/SupremeOmakase3.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f160:Food {foodID: "CB08", foodName: "SupremeOmakase2", price:1969000, img:"/Menu Sashimi/Combo/SupremeOmakase2.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f161:Food {foodID: "CB09", foodName: "SupremeOmakase1", price:2169000, img:"/Menu Sashimi/Combo/SupremeOmakase1.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f162:Food {foodID: "CB10", foodName: "SalmonNishinSet", price:999000, img:"/Menu Sashimi/Combo/SalmonNishinSet.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f163:Food {foodID: "CB11", foodName: "SalmonSet", price:869000, img:"/Menu Sashimi/Combo/SalmonSet.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f164:Food {foodID: "CB12", foodName: "SashimiSet8", price:1699000, img:"/Menu Sashimi/Combo/SashimiSet8.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f165:Food {foodID: "CB13", foodName: "SashimiSet7_1", price:1999000, img:"/Menu Sashimi/Combo/SashimiSet7_1.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f166:Food {foodID: "CB14", foodName: "SashimiSet6", price:969000, img:"/Menu Sashimi/Combo/SashimiSet6.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f167:Food {foodID: "CB15", foodName: "SashimiSet5_1", price:1469000, img:"/Menu Sashimi/Combo/SashimiSet5_1.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f168:Food {foodID: "CB16", foodName: "SET_4", price:569000, img:"/Menu Sashimi/Combo/SET_4.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f169:Food {foodID: "CB17", foodName: "SET_3", price:769000, img:"/Menu Sashimi/Combo/SET_3.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f170:Food {foodID: "CB18", foodName: "SET2", price:869000, img:"/Menu Sashimi/Combo/SET2.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f171:Food {foodID: "CB19", foodName: "SET_1", price:969000, img:"/Menu Sashimi/Combo/SET_1.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)


MATCH (c:Category {categoryID: "SM"})
CREATE (f172:Food {foodID: "SM01", foodName: "SAS23-Lobster_2", price:669000, img:"/Menu Sashimi/Sashimi/SAS23-Lobster_2.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f173:Food {foodID: "SM02", foodName: "SAS44-Abalone", price:369000, img:"/Menu Sashimi/Sashimi/SAS44-Abalone.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f174:Food {foodID: "SM03", foodName: "SAS43-ShirakoShot1", price:169000, img:"/Menu Sashimi/Sashimi/SAS43-ShirakoShot1.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f175:Food {foodID: "SM04", foodName: "SAS42-Hirame_1", price:169000, img:"/Menu Sashimi/Sashimi/SAS42-Hirame_1.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f176:Food {foodID: "SM05", foodName: "SAS39-AmaebiUni_2", price:169000, img:"/Menu Sashimi/Sashimi/SAS39-AmaebiUni_2.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f177:Food {foodID: "SM06", foodName: "SAS38-A5WagyuSashimi", price:469000, img:"/Menu Sashimi/Sashimi/SAS38-A5WagyuSashimi.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f178:Food {foodID: "SM07", foodName: "SAS37-TakoWasabi", price:269000, img:"/Menu Sashimi/Sashimi/SAS37-TakoWasabi.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f179:Food {foodID: "SM08", foodName: "SAS35-EbikoHi50D40B", price:169000, img:"/Menu Sashimi/Sashimi/SAS35-EbikoHi50D40B.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f180:Food {foodID: "SM09", foodName: "SAS34-AkamiV40D20", price:169000, img:"/Menu Sashimi/Sashimi/SAS34-AkamiV40D20.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f181:Food {foodID: "SM10", foodName: "SAS33-IkaShiokara", price:169000, img:"/Menu Sashimi/Sashimi/SAS33-IkaShiokara.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f182:Food {foodID: "SM11", foodName: "SAS32-NishinWasabiHi20Sw50D50_1", price:469000, img:"/Menu Sashimi/Sashimi/SAS32-NishinWasabiHi20Sw50D50_1.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f183:Food {foodID: "SM12", foodName: "SAS31-TobikoWasabiFixed", price:169000, img:"/Menu Sashimi/Sashimi/SAS31-TobikoWasabiFixed.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f184:Food {foodID: "SM13", foodName: "SAS30-AnkimoV40St10Hi20Sw20D60_1", price:169000, img:"/Menu Sashimi/Sashimi/SAS30-AnkimoV40St10Hi20Sw20D60_1.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f185:Food {foodID: "SM14", foodName: "SAS29-SeaAmaebi_1", price:99000, img:"/Menu Sashimi/Sashimi/SAS29-SeaAmaebi_1.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f186:Food {foodID: "SM15", foodName: "SAS27-Tsubugai_2", price:169000, img:"/Menu Sashimi/Sashimi/SAS27-Tsubugai_2.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f187:Food {foodID: "SM16", foodName: "SAS25-Otoro_2", price:169000, img:"/Menu Sashimi/Sashimi/SAS25-Otoro_2.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f188:Food {foodID: "SM17", foodName: "SAS22-KakiSashimiNew", price:169000, img:"/Menu Sashimi/Sashimi/SAS22-KakiSashimiNew.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f189:Food {foodID: "SM18", foodName: "SAS21-Tamago", price:169000, img:"/Menu Sashimi/Sashimi/SAS21-Tamago.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f190:Food {foodID: "SM19", foodName: "SAS20-ShrimpUni", price:269000, img:"/Menu Sashimi/Sashimi/SAS20-ShrimpUni.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f191:Food {foodID: "SM20", foodName: "SAS19-Ikura", price:169000, img:"/Menu Sashimi/Sashimi/SAS19-Ikura.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f192:Food {foodID: "SM21", foodName: "SAS18-TobikoD40_1", price:169000, img:"/Menu Sashimi/Sashimi/SAS18-TobikoD40_1.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f193:Food {foodID: "SM22", foodName: "SAS17-Kaorikabo", price:269000, img:"/Menu Sashimi/Sashimi/SAS17-Kaorikabo.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f194:Food {foodID: "SM23", foodName: "SAS16-Unagi", price:169000, img:"/Menu Sashimi/Sashimi/SAS16-Unagi.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f195:Food {foodID: "SM24", foodName: "SAS15-Hokkigai1", price:169000, img:"/Menu Sashimi/Sashimi/SAS15-Hokkigai1.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f196:Food {foodID: "SM25", foodName: "SAS14-Uni_Menu", price:269000, img:"/Menu Sashimi/Sashimi/SAS14-Uni_Menu.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f197:Food {foodID: "SM26", foodName: "SAS13-Amaebi_3", price:259000, img:"/Menu Sashimi/Sashimi/SAS13-Amaebi_3.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f198:Food {foodID: "SM27", foodName: "SAS11-HotateSashimi", price:269000, img:"/Menu Sashimi/Sashimi/SAS11-HotateSashimi.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f199:Food {foodID: "SM28", foodName: "SAS10-IkaFixed", price:169000, img:"/Menu Sashimi/Sashimi/SAS10-IkaFixed.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f200:Food {foodID: "SM29", foodName: "SAS9-TakoV40Cn15Sw40D50_1", price:169000, img:"/Menu Sashimi/Sashimi/SAS9-TakoV40Cn15Sw40D50_1.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f201:Food {foodID: "SM30", foodName: "SashiSAS8-ShimeSabaFixedmi4", price:269000, img:"/Menu Sashimi/Sashimi/SAS8-ShimeSabaFixed.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f202:Food {foodID: "SM31", foodName: "SAS6-Nishin2", price:269000, img:"/Menu Sashimi/Sashimi/SAS6-Nishin2.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f203:Food {foodID: "SM32", foodName: "SAS5-ToroMekajiki", price:269000, img:"/Menu Sashimi/Sashimi/SAS5-ToroMekajiki.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f204:Food {foodID: "SM33", foodName: "SAS4-Hamachi2", price:269000, img:"/Menu Sashimi/Sashimi/SAS4-Hamachi2.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f205:Food {foodID: "SM34", foodName: "SAS3-ToroSake_1", price:269000, img:"/Menu Sashimi/Sashimi/SAS3-ToroSake_1.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f206:Food {foodID: "SM35", foodName: "SAS2-SakeSashimi_1", price:269000, img:"/Menu Sashimi/Sashimi/SAS2-SakeSashimi_1.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)
CREATE (f207:Food {foodID: "SM36", foodName: "Sashimi10", price:269000, img:"/Menu Sashimi/Sashimi/SAS1-Maguro.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)

CREATE FULLTEXT INDEX text_index_fName FOR (f:Food) ON EACH [f.foodName]

CREATE FULLTEXT INDEX text_index_Employee FOR (e:Employee) ON EACH [e.tenNV,e.soDienThoai,e.maNV]

 CREATE FULLTEXT INDEX text_index_food FOR (f: Food) ON EACH [f.foodID, f.foodName]

CREATE FULLTEXT INDEX text_index_customer for (c:Customer) on EACH [c.tenKH,c.soDienThoai,c.maKH]

CREATE FULLTEXT INDEX text_index_Order FOR (o:Order) ON EACH [o.maHD, o.khachHang, o.nhanVien, o.diaChi]


MATCH (c:Category {categoryID: $idDM})
CREATE (f1:Food {foodID: "DR1", foodName: "KIWI", price:65000, img:"/Menu Sashimi/Nước uống/TRA-HIBI-KIWI-GHEP-ANH-450x450.jpg", soLuong:100, trangThai:1}) -[:BELONG_TO]-> (c)

#Tao khách hàng vãng lai
CREATE (k:Customer {maKH: 'KH0000', tenKH: 'Khách vãng lai', gioiTinh: -1, 
ngaySinh: localdatetime({ year: 1, month: 1, day: 1, hour: 1, minute: 1, second: 1, millisecond: 1 }), 
soDienThoai: 'Trống', diemTichLuy:0})

