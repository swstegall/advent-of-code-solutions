package me.stegall.day4

val day4Input = """
  MSSMMSXSMSMSXMXXXMSMSSMSAMXAXASXSASMSMXMXMMAMSMMMSMSXSAMXSSXMASMMMXXMASXMSXMSSXXXAMMXMXSMSAMAAASAMXMMSSSXXSMMXXXSMXSXMXMMXXMASMMMMSXXMAXXMAS
  XAAAAAXMASMSASXMAMAAMXAAMSSXSAMASASAAAXSAMXAMAAASAASAMMSMMMAXAXAMSMMAAAAAXASXAASXSSMAMAMXMASXMMAASASXMAMAMMAMSMMMMAAAMMSMXSAMXSAMASMSMSSMSSM
  MMSMMMSMAMAMAMSAMXMSMMXMAAXAMAMAMMMXMSMSAMSASMSMSMMMAMAAMAMSMMSXMAAMMSSMMSXMMMMAAAXMAMAMMSXMAXXXXSASXMASAASAMXMAAMSSXMXAAAMASAMXMXSAAAAXAXXS
  AXXXSAMMAMAMMMSXMASAMXMXMMMXXAMXSXAXXAAMAMSMMAAXSXXXXMSSSSSXAASMSMSMAAXAASAMXSSMMMXMXXASAMAMAMSSMMXMASAXMXXXSASMSXAAMSSMSMSAMASXSMSXMSMMSMMM
  SSMAMASXMSASXASASMSAXXAXXSXXSAXAXMSXMMSMAASASXMMSAMXAXMMAMXMMASAAAAMMSSMMSAXAXMXXAMSSSXMXXAMAMXAAXMSAMMSMMSMMXSAXMMSMAAAAXMASAMMMASAMXXSMAAM
  XAMMMAMXAXAXMASAMMSXMMMSAMXMAMSMSXMASAXMSXSMMASXMAMSAMXMSMXAMSMMMSMSMAXMASAMSSMMMMSAAXMAMSASXSSSMMAMXSAAASAMSAMXMAMAMAMXMMSXMASAMSMMMMMXMMMM
  SSMMMASMXMMMXAMXMXMASAAMMXXSAMAAMASAMAMXXAMASAMMMSMAAAXSAMXAMAAAMXMAMXMMASMAXAMXAXMMMMMAMMAMXMAAXMMSAMMMSMAXSASXAMSASXSSMXXXSAMASAMASASMSMSA
  AXAAMMXMXMAAMMSMMASMMMXSXXMAXSMAMAMAMASMMMMAMXSAXAMAMSMSMMXXXMSMSXSXSMSSMMMMSAMMSMSAMAMMXSSMMMSMMMAMASAXXMSMSAMMAMMMMMMAMSMMMMSMMASASMSAAAAS
  ASXMSMASMSMSMSAAXAMAXSAMXMAMASXSMSSXMAAXAAMASXSMSXSXMAMMXMMSMXMMXMMASAAAMASASAMXAAMXSAXSAMXAXMASAMASXMXXSAMXMAMMXXSMSAMMMAAAXMAXSXMASXMMMXMA
  MXMAMMMSAXMAXSSSMSSSMXMAXSMXMMAXAXAMMSSSSMSMSXMAXMXAMXXMASAAMAMAAAMAMMSMMAMXSAMMMSMASAMMMMMMMSASMSASAMXXMAMASMXMMXSASMMXMMMMMSSMXAAASAMXSSMM
  ASMMSSMMMMMSXMAMAXAMMMMSMMASXMAMXMXXXAAMAMMAXAMSMASMSSXSAMSMXAMMSSMSSXXAMXXASMMMAAMXMMMMMXMAMMMMAMXXAMAXMAMMMMAAMSMAMSMSMSMSMAXMASMASAMXMAMX
  MXSAAMXSMAAMAMXMXMAMXAAAASAMAMAMMAMXMMSMMAXXAMXAXXMAAAAMXMAXMSSXAAAMAAMSSSMASXAMSSSMAASAMXSASAMXMXAXSMSMSASXMSSSXMMSMMMAAAAAMXMXAXMMMMMMSMMM
  XAMMSMASMMSSMMMMXMMMSMSSXMMSXSXMXXAXSAMXXMSAMXMMSSMMMMMSXMASAAAMSMMMMSXAAAMXMXSXMXAMSMSASAMMSMSXXMSXMAXAMASAMXAMASAAMASMMMSMSMSAXAXSMSSMMXXS
  MSMMXMXSAMAMXAAMAMMAMMMMAMASASAMSSSMMMSAMXMMXAAXAASAMAXMXAAMMSSMXMASXMMMSMMAMAMXSMMMMXSMMMSMXMMMXAMAMMMSMMMAXMAXAMMXSASXXXXMAAAMMSAMXAAAXSAM
  XMASXMASAMMXSSXSASMASAMXAMMMAMAMAAXAMASAMXAMXXMMSMMMASAMXSXSXXAMXSMMMMAXMASXSSMMSAXAXASMSXAXXAAAMSMAMAAXAXMSMMSMMXAMMASMMSAMMSMXAMAAMSSMMMAX
  MSAMAMASAMXMMAMXMAMASASXXSAMXXXMMSMSMXXAMSSMSSMXMAASMXAMXXAMXSAMAMXAASXMSAMMAAXASXMASMSASXSSXSAMSAXSSSMSAMSMSAAMAMSXMAMMAXXMXAXMAMMXAMXMXSMM
  XMAXXMASAMMAMAMAXAAMMAMAASXSMSSMAMMXMASMMXXAASMAMXMMAMMMMMXMAXAMMMSSMMAMMMMMSMMMSAMAMXMAMAMAMXAXXAMXAMAXMXAAMSSMAXAAMMSMSSMXXMSSSMMASXMXAMAS
  SSSMSMASAMSASMSMMMSXMXMMXMXAMAAMSMSAMXXMASMMMSMASAMMXMAMAXXSMSMMAAMMMSAMXMAMAMSXSXMMMAMAMXMXMMMMSMSMAMMMMSMSXXMXXSSXMAAAMXMASXAAAAMAMAXMXSAM
  MAAAAMXSMMAASXAXMAAMSMSMSMAMMMSMMAXXXSAMXMMAAXXASASAXSASXMMMAAMMMMSAASAMXSXSAXSASXSAXAMASASASXAAAMAXSMXXMXXMMSMMMMXAMSSSXAMASMMSMMMSMXMMAMAS
  MSMMMXAMMSMMMMMSMAMMAAAXXXSMSAAAMMMSMSXXSXSMSSMXSAMAMMASAAAMMMSXAMMMMSAMAMMSXMMAMASMSXSMSASXMXMSSSMAXAMXXMAMAXSAAMSMMAMXMXMASAMAMAAXSMAMXSAM
  XXAXXMASAXAAAASAMMSSMSMSMXMAXSMMMSASAMXASAMAMXMXMXMXMMXMMSSSSMXMXSAAXSXMMSAMMMMAMXMAAASXMAMAAXXXAXXXSAMMXMXSSMSXXMAAMXSASXMASAMMSMXXAMXMASAS
  MSMSMMMMASXMSMSASAMXAAAXAMMMMXMMAMASAXMASMMAMAMMMXAMXXMMXMAAXMASMSXSMSAMAMMXAAMXXAMMMMXAMXMXMXMSMMSMAAMXXXMAAAXASMMXMMMXXAMAXAMXSAMSSMSSMSAA
  MAMAAAXXMXMAXAMMMXSMSMSMMMASMSAMXXMMMXMASXSXMASASASASXAMAMMMMSXXAMAMASAMASMSSSSMXXSMSSSSMSMAMAMAXMAAXMMSMMAMMMMXSAMSSMMSSSMSSMMAMAMAMMXAAMXM
  SASMSMSMMAMASASMSMMAMXMXMMAMASXMMSSMSAMXSAMASASMSAXAMAXSASXSMMSMSMAMXMAMASXAAAAASMMMAAXXAMMAMAXASMMSMXXXXAXXMXSAMXMAAAXAAXAMAAMXSAMMSMSMMMAM
  SAXXAAAXMXMASAMXAAMAMASAMMSMMMAMAAAMAXAMMAMAMMSXMXMAMSMSAMMXAASMAXAXSSSMXSMMSMMMXAAMMSMMMMSMMMMMXAMMASXMSXSAMXMASMMSSMMMSMSSXMAMAMSXAAXAAMAS
  MMMSMSMSXAXXMAMMXMMASMMASAAAASAMMSSMMMSXSMMMSAMXMMSMMMAMAMMXMMSSMSXSMAAAXMAXMXMXSXMMAAAAMMAMXMASXSMMMAAAAAXAMXSMMMMAAAXXAXXAMSASASMXMSMSMSMS
  XSAMAMAAXMMXMSMXAXSAXAMAMMXMMXASAMAAXAXAMMAXMAMAXAAAAMAMXSAASAXAXAMSMSMMMSSMMASXSAAMMSMMXSASASMSAXAMSSMMMSXMMXXSAMMSSMMMSSSMAXAMXMXAXMXXXAXX
  MMASAMAMXSAMXAASMMMMSSMSXMMSSXMMMMMMMMSAASXSSSXMSSMSMSXSAMMSMASXMXMSAAAMAMMMSAMAMSMMAXAMXSASMSAMAMAMAAAAAXASMMMMXSAAAAXAMXAXSMMMSXSMMXASMSSM
  MSMMASXXMSSSMMMMAAXAAAXMAMAMAASMSSXMSXSMMXAAAMXMAMXXAMXMXSSXMXMAMMASXMXMXSAAMAMXMMXMASAMMMMMMMXMXMAMSSMMAMAMMAAAXMMMSMMSSXMAXASXAASXMMXAMAMA
  MAMXAMXSAMAXXXMSSMMMSMMSMMAMSMMAXMASXAXASMMMMMSMASAMAMASXMMASMSSMMASMMSMMMMSSXMSXSAMXSMMAXXAAMMAAMAMXMMMMMSMMSMSSSMXAMXMAMXASXSAMXMAXXXXMAMM
  SASXMMMMAMMMSMXMASXMAMMAMSSXMAMMMSXMMXMMAAMXXAMSMMMSSMMXMAMXMAAXXMAMAXAAAXMAXAAMXMASXMASXMSSSMASMSMSAMXASAXAMXAMMAMXSAMXXMMXXAXXXAXXMASXMMSX
  SAMXXAASAMAAAAMSXMXMAXXAMAXAMAMAAMASASMXSMMMMMXAXMMAMASMSAMXMMMMSMSMSMSXMSMASMMMASAMXSAMXXAAAMMMAAXMMMSASXMASMAMMXMAMAMAAXXASMXSSSMXSXMAASMM
  MAMASMMSMSMSXSAMXMXMXSSMMSSMSSSMSSXMASMXASXXAXSXSXMXSAMXSASASXAXAAMMXXMASAMXMXAMXSASXMASMMXSXMASXMXAAXMMMMSMMXSMMXMAXAMSSXMMMXAMAMMXMAMSMMAM
  XMMMAMAXMAMMAAAXAASXXMASAAAXMMAMXMXMXMMMMAXMMMSMMXXXMAMASXSASMMXMMMXSAMXSAMASMXSASMMAASMMAXMAXXSASXSMXSAAMMMSMMAMMSSSMXAMAXXAMMMAMXAXMMAMMSM
  XXAMAMXMXSAMXMMSXXAMMSAMMSMSXSAMAMMSAMXSXMSMSASAXAAMSSMMXAMXMASASASMSMMAMMMASXXAMXMSXMASXSAMXSAMAMMAXAMMMSAASASAMXAASMMASXMMAMAMSSSSSSMMSAMX
  ASXSMSMMMXAXXAMAXSMAAMXSXMMSASXSMSASASASAXMAMASMMMAAAAAMSMMXMMSASASAMMMSMMMMMXAMXSMXMASMXXSXSAMMMXSMMSXSAMMXSASXSMMSMMMMAMXAMMMMMAAXAAXAMASA
  MMAMXAAMASMXSAMAXAXSMMAMXAAMAMAAAMMSAMXSASMXMAMAMXAXXSMMAMMMSAXAMAMMSXAMXSASMMXMASAAAMXMASMXSMXAXMMXAXXSAMXAMAMXXXXAXASXMAMMXASAMMMMXMMXSAMM
  XXSSSSSMAAAASAMSAMXAXMASMMMSSMMMAMMXAMXMASAMXXSSMSMSMAMMXSAAMXSXMXMAMMMMAMASMXSXMXSMMMAXMAMAMXSMMAMAMAMXMXMMMXMXMASXMMMXXSSMSAXAMSAAAXXXMXSX
  XXXAAAXMSMMMSXMXMAXXMSAXMAAAAXAMASXSXMXMXMMAXXMAXSAAMXMAASMSXMAXXSMMSASMAXSMMASAMAMMXSMXXAMASMSAXSASMSMMMAAAAAMASAXSAMXSXMAXXASMMXMSSSXXMASA
  MSMMMMXMAXMAXAXMMSSSMMSMSAMSMMASAXXSAMXXAAXSMSAMXMSMSXMMXSXMASMMMSAMSAMMMMMAMMSAMSXSXMAMXASXXAMXMMAMAMAASMSMSXSAMAMAXSAMAMMMMMAMXMXXAMXAMAMM
  AXAXXXXMMSMMXSMXAAMAAAAXXMXMASXMMSMXAMAXSSMAXMASMMMXSXMMXMASAMXAAMAMMSMASAMAMXSAMAAXMSAMMMMMMSMMMMAMMSSMSXXMAAMMMSMMXMASAMAXSAXAMAXMAMMMMASA
  SMXMMMMAAMAAAXAMMSSSMMSSXMAMMMAXAAAXSMSMMAMAXMASMASAMAXAASAMASMMXSXMAXMXMAXAMXSXMMSMAMXSASASMXAXXSXMXMMASMSMMSMMAMAMMSAMXSSSMXMXASMMAMMSAXAA
  XAAMXAXMMSMMMSASXAAMXMMMMXAXASMMSMSMMAMXSAMXMMMSMAMASAMMMMXSXMXSASAMAMXAXXMSSMMASAMMAMXSAMASASXMASMSSSMMMMSASMXSASAMASMSXAMXMASXSMMSXSAMXSSM
  MSSSSXMAXMXAASAMMSSMMSAASXMMASMAAAAMMSMXMASMXAXMMAMXMMSAAXXAXMXMASASAMXSSXXMAAMXMAXSASXMSMAMMMXSMSAXMAMXAAMXMAASXSASXXAXXXAAXSAMXAAMMMASAAXS
  XXAXAXSXMXMXXMAMAMAAXMMMSASMAMMSMMSXAXXAXAMASMSXSSSMXAXMSMMAMXAMAMXMASAAAMMSSMMAMMMMASMAXMAMAAASAMXSAMMSMSMAMMMXASAMXMMMMMSMSMSASMMSMSAMXMSA
  XSMMMMSMAXAMXSMMSSSMMXSXMAMMMMAXXAXMMSSMMSXXAMMMXXAAMSSMAMMAMXMSAXXSAMMSMSAMXASASXSMAMMSMSSSMMSMAMAMXAMXAAXXMMSMMMAMMXAAAAAMAAXMMAMAAMSMSXAM
  MXXAMASXMMXSAMAAAMAASAXAMAMASMSSMSXAAAAXAXMMAASMSMMMMAAXASMMMAMAMAXMASXMXMMSMMMASAAXSXXAAAAAXXXXAMXAMXMMSMMXSAXAXMASMSMSMSSSMSMMSAMMSMAXMMMX
  AMXXSASAMAXMASMMSSMSMASMSASASAMXAAMMMSMMASASXMAXMASAMMSMXSMMSMSASMMSAMXSSSMSASXXMXAMXAAMXMSMMMMSXMMMSMAXMAMXMXSAMSASAAXXMAXAMXAXMAMAMMMSMAXS
  SAMXMXSAMASXMMASXMXAMXMAAASMMMMMMMXSXMASMSAMMSMXXAMMSXAXAXAXAMMAMXXMASXXXAASAMMXSXMXXSMSXMXMXAAMASAAAXMMSMMMXAMAXMSMXMSMASXMMAXSSSMAMAAAASAS
  XXXXSMSXMASAMXXMAMSMSAMXMMMMAAXAXXASASAMMXMAMMXSMXSAMXSMMSMMMASAMXSSMMMMMMMMAMSXMASMXMAXAMASMSMSAMMSMSXAXXAMMMSAMXAXASXXAXAMMSAMAXASMMSSSMAS
  XXSAMXSXMASAMAAMAMSASMSMSMASMSSSXMMMAMMMMMMXMXAMXAMAMSMAAAXAMASASAAXAAAAXXXSAMMAMAMXAXXSMMASAMAMXSXMXMMSMXXMAXXAMXSMMSAMXMAMAMAMXMAMAMXXXMAM
  XAMXXMSASASAMXXMAXMAMASAASXMXMXAASXMXMAAMAAAMMSSSXSAMXASMMSSMXSAMXSSSSSSSMASMSMXMMXSSSMMXMASMMMMXMASAXAAAMSSMSMSMAXXSXMASXXMXSAMAAXSSMAXMMAS
  MXMMAAMAMAMAXSASXSMMMAMSMSMMAMMSMMAMSMSSSMSXSAXAAMXAAAXMAMAXMAMXSAMXMAMAAMAMMAMMMSAAMAAAAMXSXSAMAMAXXMMMXMAAXAAXMAMSMAMXMASAASMSSSXMAMXMMASM
  SAXMASMMMMSAMSAMXAAXMMMMMMASMXAXMSAMSAMAAMAMMXMXMAXXMXSSXMAXMAXMSAMXMAMSMMSMMAXAAMMMMSMMSSMMASMSSSSXSAMSSMSXMMSMMXSXSAMMMAMMMMXAMXXAAXMSSMMX
  SMASAMXXAXMAMMXMSSMMSSMAAMMMSMAXMMMMXAMSMMAXXMAMXSAXXXAMMMSMSMSASAMXSAMAXAXMSMMMMSXXMXXXAAAMAMXAMAMAMXMXAAAMSMMXMXMAMXMXMASMMMMMMMMSSSMAAASX
  MAMSAXSMMMXXMAMXAMXAXASMMMSAMMMMSSMXSXMXXSMMSASXAMMMSAMXAAAXAAXMSSMMSSSMMMXAAAASXSMSMMAAASMMMXMMMAMSMSMSMMMAXAXASXMSMSMSAASXAAAAAAAAAXMAMMAS
  XAMXAMXMMXSAMMMMMSMMXMMSAMMAMSXMAAMAMAMXMSAXASMMMSAAASXSMSXMMXMXMASAMAMXASXSMSMSAXXAAMASXMMXMAXMMSMMAMXMXXXSSXSMMXAAAAAAMMMXMSSXMMMXMAMSSSXS
  SMSXSMSXAAXXMAAMXMASASAMXMMAMMAMXXMXSAMAMMAMMAXAASMMXXXMAAXAXAXASMMMSAMMMXAMAMAMAMSSSMMMMSSMSXSAAMAMXMSMMSMAAASXMMAMSMSMXMASXAXASMSSXSXAAMAM
  SAAAAAXMMXSSSSSSMSAMXMASAMMSMSAMSMSMMAXAMXAAXMXMMXAMSMXMXMASXXSASXAXMASASMAMAMSMSMAAMXAAAXAAAAXMMMAMXMAAAXMMMMMAMAXXMXAXXMASMSMMMAASAAXMXMAM
  SMMSMSMXSXAMAMAMAXASXMAMASAAXSMSAAAASXSSSSMSSMSXMMSMAMSXMMMAAXMAMXMSMXXASAAMASXAMMMMSMSMSSMMMSMSMMMMXSSSMSAXMASAMSAMXSASMMMXAMAXMMMMMMMSASAS
  SAXMAXMAMMMMAMXMXMXAAMXSAMMSMXSXMSMXMMAAAMAAAASMMAMSMXMAAXXMMMMAMAMAMAMSMXASXSMAMAAAAXMAMAXMXMXMAASMMMAAAXMMMASMSMMMXXMAMAASMSSMSAAAAAASASMS
  XMMMAMMASAXSMSMSSSMSAMAMAXSAMXMMXAXXXMMMMMMMSMMAMAMAXAMSMMMMAASASASAMMXXASXSASMXSMMMSXSXSMMMAXXMSMXAMXSMMMXAMMMMAAASMSMASMMXAAMASXSSSMMSAXAM
  MSXMASMXSXXSAAAMAMXAAMXSAMAAMMAASMSMAMXMSMXMMASMMSSSMSMXASMSSXSASMSMXMAMXMAMAXMMSXMXMXSAMXAMXSAMXXSSMAMXXAMMSSXMMSMMAASASXSMAMMXMAMAAMAMAMSM
  XSAMASAXMASMSMSMAMXMMMAXMASMMMMAMAAAAMXXMMAAMAMAAAAAAMAXAMAAMAMXSMMASMASAMXMXMSASMXAMAMAMSMSAXXMAXAAMXMXSMMSAMMSMXXMSMMMSASASMXMMXMSMMXXAAAX
  MMSMAXMAXSXMASAMASMSSMMMSAMXXMMSMSMSMSXAASMMSASMMSSMSMAMSMMMSXMAXAMAMMXSASASAAMASAMXSASAMAXMXMSSMSSSMASMAASMAMAAMXMMMASAMXSAMXXAMXAXXSSSSSMS
  SXMMSSXSMASMXSXSMSASXAMAMAMMSXAXAMXMAXXMMSAXMAMMAMXAXMAMAASAMASMSSMMSSXMMSASMSMSMXAMSXXMXSSMSXMAXMAXMASMMXMSAMSAXXMAMAMASXSAMXASXMXMAMAAAAXA
  AAXAMXAXAXMSAMXSAMXMAMMASXMAMMMMMSAMXMASAMMMMAMMMSSSMSXSSSMASAMMAMAAXXASXMXMAMMXMSSXMMSSXAAAMXSSMMMMMMSXMAMXMAMAMSXMMASAMMSAMSMMXASMSMMMMMSS
  MSMMMMMMMMSXSXAMMMSMSMSXSMMSSSMAMXAMMMXMAMXASAMXSAXAAXMXMAMAMXXMASMMXSMMAAXMXMASMAMAASAMMMMMXAMAAMXAXMXAMSXSSSMAMMAMSMMASAMAMAAXXMSAAMAXAAXX
  XMAMAMMAXSXAAMMSMAAAAASASAXAAXMASXSMAAAXXMSXSMSMMXSMMMAXMAMXSXMXMSXSXAAMAMMMAMSMMASXMMASMSSSMASAMMSMXMSMMAMXAASMMMAMAASAMXSSSSSMMXMXMAMMMMMM
  XMXMAMXMSMMMMMXAMMMMMSMAMSMMSMMXSAMXXSASXMMASXAAAMXMSSSMXSSMMXSAXMAMXSSMMXAXXMAASAXAXMAMAAAAMAMASXXAAXAMXMAMMMAXASASMXMMSAXAXMAXSAMMXSSXSASM
  MSMXMSMMAASMASMSMSSMMMMXMAMSAXMAMMMXXAAXAAMMMXXSMXMAMAAXAXAAAAMAMMAMAAMAMSSMMSMMMMSMSMSSMSMMMMSXMXMSMXASMXSAXXMSXMASMMMSMMSSSSSMMXSAAMAXSASX
  MASAAAXSMSMMASMAMAASASMMSSXSAMMAMXMXMASXSMMMMSMMMAXXMXMMMSSMMMSAXSAMMMSAMAXAAAMSMXAAAAMSAMXXXXAMXAXAMMSMMXMASXXSAMXMAXXAAMSAAAAXXAMMSSMAMAMA
  SASMSMMXXXAMAXMAMXSMMMAMAMMMAMSASAXSMMMAMASAAAAAMMSMMSXSXAMAXXAMXSASXASXSAMMMMSAAMMMMSMMMMSMSMSSSMSASMMAASMMMMAXMMMXMMSSXMMMMMMMMXMAXAXSMSMS
  MASXXXSSXSAMSSSXSXMMXSXMASXMSMSASXMSAMMXMASMSSSMSAMXAMMMMMSAMAMSXMASMXMAXMXSAXSMSXSAMXAXMASMXAAAMXMXMASXMXSAAMSMSAMAAAAAASXSMXAAXMASXMMXAXAX
  SXSASAAXASAMXAAASXMAMAMXXAXAMAMMMAMXAMSAMASAAMMMMMMMMMAMSMMASMXSAMAMMAMXMAXMAMXXMASAMSSMMASXMMMMSAMAMMMXMASXMSAASASXSMMSMSASAXSXSXMMAMMMMMMM
  MAMAMSMMMMASMAMMMAMMSAMSSSMXMAMSSXMSSMMXSAMXMAAAASXSMSMSAAXXAXAMAMMMSASAAXMMMAMAMAMAMAAAMASAAXXASASASXSAMMSXMMMXMAMAAAAXXMAMMMMAMXMSAMAAAAXX
  MXMAMAXAASMMAXMASXMXMAMAAMAXXAMXXAMAXAXMMMSAXSXSMMAAAAMSXSMSAMXSSMMMSASXSMSXMAAAMASXMXSXMXSMSSMMMXXASXXAXASAXMSSMSMSSMMSAMXMXAMAMMAMASMSXXSA
  AAMAXASMXXAXSXSASAMSSXMMMMMMSMSMSSMMSSSXAMXMAXAXXMSMMMMXAXAMMMMMAASAMXMMAMAASMMSXMXMSXMASXXMAXAMMSMMMMSSMASAMXSAAXAXAMXXMXSSMXSAAXMSMMAMMSMX
  SSSSXMMMXSMMMAMMSAMMSXAAMAAMAAAXXAAAAXAMAMAXAMMMMXMAMXMMMMSAMXAMMMMAMAMXAMXXXMAMXMMXSAMXSAMMSMSMASAMXAAAMAMXXMXMMMXMMSMMXAMAMXMMXAMAMXAMMMAM
  AAAAXSSMMAXAXXXXXXMAXMSMSSMSMSMSXXMMSMMAASXSASAAAAXAMAXAAMAXMSSSXXSSMSSSMSSSMMAMASAMXAMAXMMAXAMMXSSMMMMMMASXMMMSAMXXXXASMMMSAXXAASXMSSMSAMXM
  MMMMMXAAXXXASAMXSSSSMMXMXMAXXAMXXASXXXXSASXXASMMMSSSSSSSSSXMASAAXMAXAXAAAAAAAMMMAMXXXSMSMXMASASXMXASXMMXSASMAAAXASXMASMMSAAMSAMMXMAXXMASASMS
  XAXXXSSMMMXXMAAASAAAAAXSAMXMSMMXAMXAXMXMASXMAMASAMXXXAAMAXMXXMMMMAAMMMSMMMSSMMXMSSMMSMAXXAMASXMMMSAMXSAXMASAMMMSAMXMASAAXMXSMXXMASXMMSXXASAX
  XAXSAXXMXXAASXMMMMMSMMMMASXMXXMXSAMXMSMMSMMAAXXMSSMMMMMMAMMMXXXSSMSMMAXAXXXMMSMMAAASAMAMSSMXXMXAMMAMAMAXMAMMSAMXASAMXXMMMXSXMSASXMSAMXMMMMMX
  AXAMAMXMAXXXMMXAAAXAAMASAMAMMASAMAMXXMAXAAMSXSAAXXAXMAXMMSAAXSMAMXXAMSSMMMSMAXAMMSMMAMMMAAMXMAMSSSXMXSXSMAXXMAXSSXMMSXAMSXMAXSASAMXMXAXAXAXM
  SMXSAAAMASMASASMSSSMXMAMAMSMSAMXSAMXMMSSSMMAAXMXMXMMSXSAASMSMSMAXXSAMAAAAAXMASMMMMMSSMMMMXSAMSAMAAXSXMXAMAMSMMMXXASASMSMAMSMMMAMMMXMSMSMSXSA
  XAXMAXXXAXXAMXMAAMAASMSXXSAMMXSAMMSXAAAMAMMXSSSXSSMAAMMMMSXAAXSSMMXAMSSSMMSMMXMAMMAAAAASXMSASASMMMAMAMXMMSMSAASASXMASAAAMMAAAMAXAXAXAXAXMAMX
  SSSSMSMMMSMMMAMMMMMXMAMAXSAMAXMASMSMMMXMAMXAMAXXMAMMMSAMXMMSSXXMASXSMXAMXASASMSMMMMMXSMSAMXMMMXXAMAXAMXXMXAMSMMASMMMMXMMXMAMXSASMXSSMSSSMAMX
  XAAXAAAAMAASXSMMAAXAMAMSMSMMMSMMSAMASASXXXMXSAAMSSMSASASAXXMMAXMXMAMXMXMMAMAMXAASXSMAMASAMAXAXMASXSSSSMAMMMMMXMXMXAXMASXMMSSMMMSAAMAMXMAMXMM
  MXMMSMSMSXSAAMSSSMSSXMXAAXXAXAXMMASMMASAMSXMMASXAXXMXSAMAXXASMSMXMXXXSXSMSMXMSMSAMAMAXASASXSMSAXMAXAAMMASAXAXAMMMSMSMXAAAAAAAAXMMMMAMXXSMSXA
  AAMAXXAXSXMMMMAXAAAMAASMSMSMSMSXSAMXMXMASMXMXAMMMSMMAMXXMMMMAAAMMSSMMMAAAAMXXXMAMAMMSSMMAMXAASMSMMMMSXSASASMSMMAMAXAAMMMMMSMMMAMSSSSMMXAAMSS
  MAMASMSSMAXXXMXSMMMMMMSXMAXMAMMMMMSAMAMMAMMMMMXXMSMASXMXAMXSMSMMAMAAAMSMMMSMMXSAMSXAAMAMMMXSASMMAXXXAAMAMASAAMSMSMSMSXXASMMMSXSXAAAXAXSMSMAM
  SMSMSAMAMAMMSSMMAXSAMXXAXSMSAMXMAMMMXAMXSXAAAAASMXMAMAMSXMASXMMMSSSMMXXAXXAAMAMASMMMMMAMAMAMAMAXXMXMMXMMMSMMMMAASXSXXXMASAMASAXSMSMMMMMAXMXM
  AAAAMXSAMASASAMAAASASXSMMMXMMMMMMSXSSXSAASXSMXAMAAMXSAMAAMASXXMXMAAXXXXSMSSSMASMMXAAMSSSXMXSSSSMXMAAMASAMXAXXMMMMAXAMMAAMAMAMXMAXAXAAASMSMSS
  MSMSMASASAAXSAMXMXSASASXSMSMSAAMAMXXAAMMMXMAMMAMSMSXSXMXSMASAMXMMSMMMAMXAXMAXASXSSMMXAMMAMXXAAMAXSAMSASASXMMXXXSAMMMAAXMSMMXSMMSSMSSSXSAAAAX
  XMAXMASMMASMSXMXMXMAMXMASAAASMSMASMMMMMSSSMAMMAMAXXMMASAXMMMMXSAAAXAXSAMMMSAMXMAMXMMMMSXMMAMMMMSMMAMMASXMAMXAAXAXMAXXMMXAXXMXAAAAXAAXAMMMMMS
  XMXMMMSXMAMAMXMMSAMAMXMXMMMXMAMXMXAAAMAAAXMMSSMSXSMMSAMXSMXXAAMSSXSASXMASAXXMXMMMXAXAAXASXXSAMMAAMSXMMMMMAMMMMMMMXXMASXXMSSXSMMSMMMSMSMXXAMX
  SXMXMAMMSASAMXMASASXSASASASAMXXAMSMMMSMMSMXAAAXMAAMAMASXMASMMMXMXMAXMXXXSASMSSSSMSMSMMSAMAXMASMSXMMMMMMSMMXXAAAXAASMMSAASAMMAMXXMAXAAXAXSXSX
  XXMAMASASASXXXMXMAMASASASXSXSMSAXAAXMXXXAMMMXMMMXMMXSSMXXMAXMMAXMASMMSMMMAMAAAAAAAXXAAMMMMMSXMAMXAMMSAXMASXSMSMSAXMAXMMMMASXSMASMXMMSMMASAMM
  MASASXSAMAMASXMSXXMMMXMAMAXAAASMSMSMAAXSASXSXSASAAMXXMASMSMXSSSSMSXMAAMAMAMMMMMMSMSMXMSXSAMXMMAMSSMASXMSAMAAAAXXMASXMSSXMXMAAMXMXXSXMASAMASX
  MMMAMMXAMSMMMAAXAMXXMXMAMXMSMAMXXXMMMMAXAMXSAAASMSMSSMAMAAASMAMMXXXMSSSSSSMXSAMXAAAMMMSAXXMAXSXMAMMMXAMXAMSMMMXSXMMAMXAXXXSXMASXMXMASXMXSAMX
  MASXSMSAMXAASMMMSMSASAXXXMAAMMSAMXMXXSMSMSAMXMXMXXMXMXAMSMMMMAMMASAXXAXAAAXASMSAMSMSSMMAMSSSMASAMXMSMSXMAMXMASMMAXMAMMMMMMAAXAMAAMSAMXXXMAMA
  MMSAAAAXXSSMMAMXXASAXXXSMXSXSAXMAXAAXXXAAMMSAXAMMSSMSSXMXMXSSMSMASXMMMMMMMMMSAAMMMXXAAMXMXAAAMXSXMASMAXMXSXSASASXMSAMAAAASXSMXSASXMASMXXSAMM
  MXMXMMMMAMAXXAMMMAMAMSSMAAMSMMSSSMSSSSMMXMASMSMSAAASAMXAXMAMAMXMXSASASAXXXXAMXMMSXMSSMMXAMSMMXMMXXASXMMXAXMMXSAMXAMAXSSSXSAXAMXXMASXAXSMSASX
  SMMSXSAXXSAMSXMAMMMSMXAMSMSAXAAXAAMAAXXAXMAMAMXMMMMMMMXSAMASAMXSMSASXSXSAMMSSMXASAMAAAMXMAAXMASMAMSMAXAMSSMMMMMMSMMSMMAMAMAMAMSASAMSXAMAXXMM
  AASMASXMMMAMAMSSMSAMMSSMMXMMMMSSMMMMMMXMMSAXSMSSMSSMXSAMMSAXAXXSAMXMAMAMAXAAAAMXSAMMSMMAMMMSMAAXASASXMMMAAXMAAAAXXAXAMXMXMASAMXAXMASMSMMMAXA
  MSAMXMAMXSAMAXAAAMXSAAAMMAXXXAAMAMXSASAMAMMMXAAAAAAMAMAMXMMXSMMMAMSSSMASAMMSSMMXSXMAAASMXMAAMXMSXSASXSXMMSMSSXMMXMMMAMSSXSXSASMSMXAXMMAMSMMM
  XXXMAXAMXSXSSMSAMMMMMMSASASXMMSSMSASMSAMSAMAMMMMMMSMSSMMSXXAMASXSMXAASAMXSXAMAMXMMSSMMXAXAXXSAXMAMAMASMSAAAMMASMMSMSAMAXASASXMAAAMASXMXMAAAX
  AXAXXSXSXXAXAAMMAXAXAXXAXXAMAXXXAMASASAMXAMXSXMASXXAMAXSAMMMSAMXAAMSMMMSMXMSXSMMSAXAMMMMMMXAMXMXSMMMAMAAMMMMSAMAAAASAMXSAMAMAMSMXAXAXMASXSSS
  MSSXMAMSMMXMMMMXSSMSASMSMSMAXSXMMMMMAMMMSXMMMMXASMMAMAMSAMAMMAMSXMMMMAAAAMMMAAAXMMMMMAAAXXASXMSXMAXMMSSMXMAXMXMMMSXMXXXMXSXMMXAAXSMXMSAXAAAA
  MAXAAMASASMAMAMXMAMXAMAAAMXSXAAMXAAMSMMAMASMXSMMSASXMAXMAMXMXAMMAMXXSMSSSXAMSMMMMMSSSMSMXAXXAASXSAMSMMAXXMMSASMXMXXAXMXMASAXXSXSMMAMAAXSMMMM
  MSSMMSXSMMASASMMSAMMMMSMSMAXAMMMSXMMXMMAXAMMAXAMSAMMXMSSXMAMXAAXAMMXXXAMAMMMAXXAMXAAAMAXAXMMMMMAMXXAAXMMMSMMASXAMMSXMMAMXXAMXAMMAXMAXAXAXAXM
  MAAAASASXSSMMXAMSAMAAMAAAMMMMSSXMMSMAXMSXSAMXMAMMMMSSMAAAMASXSMSASXSMMMMAXXMXSSSXMMMMMAASAMXAAMXSSSSSMSAXAAMSMMMSASAMSMSMMSMMSXSAMMMSAMXXMAS
  MSSMMMAMAMXMXSAMXSSSMSMSXMSAAAXAMAAMASXAAMXSAMXXXAAXAMXSXMASXAMSMSAMAAAMSMMSAMAXXMSXMMSXMMAMSXSAXAAAMMMSSMSMXAXXAMXAMAXMAAAAXAAXASXAAAXAMXAM
  XMAMSMMMSMMSAMAMAXXXXAAMAASMMMSXMSSMAMMMMMAAAXAMSMSSXMMMXXMSXMXXXMAMMMMMAAXSAMAMSAXMMAMAMXAAAAMXMMMMMXMAMXXAMXMMMSSMMSSXMASXMMXSSMMMXSMXXASX
  MMAMAAAAMSAMXSSMMSMSSMMMMMXXXMXMMXXMAXAXAMXMMMSXMAAXAAAMMMMMMSMMMSAMSMSSMSMSMMXMXXMSXAMAMSMSMXMMSASAXMMXSASAAASMMAAAAAMMXMMAAXAMXAXAXMAXAAXS
  MMMSMMMXXAMXAAXAXAMMXXAXXSMSMSASXMXXASMSSSMXAAXASMSSMMMXAASAXAXAMMASXAXXXAAMXSXSMMASMMMAXXAAMAMXSAXASXAAMMSXSMMAMSSMMMSAASMSMMSSSMMXMMAMSXMX
  MAMAXSSMMSSMAMXAMMMSAASMXAAAASAMASAXXXMAXAAMMMSAMAMMAAXMSMSAMMSXXAXMMXMASMSMAMAAAMAMAMSMMMXMSSSMMSMAMMMMSXSAMXSAMAAAAXMXSAAMAAMXAXSAMMMMXAMX
  SXSAXMAMXAAMMMASXSAMXMMAXMSMMMMMXMMMMAMXSSSSSXMMMSMSMSSXMAXAMXAMSSMXXXAMXAAMAMSMXMASMMASXASMXAAMAMXSMXMXSAMAMASASXSMMMAMMMMMMSMSMMSXMAXSMSMS
  XMMMMSMMMSSMXMXXAMASMSASXXMMSMMMAMAAXAMXAAAAXAMXAXXXAAMMMMMSMXAXAMAXSMXMXSMXAMAXMSASMSAXXMAXAXMMXSAMXXXAMAMXMXSMMMMMMSSMASXMXMAMXAMASMMSAAAX
  XAAAXAXXAXAMMMAMAMXMASAMSXSAAAASAMMMXAMXMMMMMMMMMMMMMMSAMAAXMXMMMMSAAXAMXXXMSSMSAMASAMXXSASMSSSXAMMMMMMSSMMSMXSXSXAXMAAMASAMAMAMMAMMMXAMSMMM
  MSSSSSMMMSXMAMASAMAMMMAMSMMXMSMXASASXMMAXXAXSMASMASAMASASMSSMXSAXSMMMSASMSSMAAAAMMAMMMSAMAXAXAXMXSAAAXAAXAASMMSAMSMSMSSMXSAMASAMSMXSAMMMXXXA
  AAAMAXXAXAAMXSMMASXSAMAMXASXMMXSAMASXSMSSMXSAMAXXAMAMAXMMXMAAASAMXAAXSXAXAAXMMMMMMSSMAMASAMSMMMSXSMSSMMSSMMSAAMXMAXMXAAXASASASAMSAASAMSAMXXA
  SMSMAMSSMMMSMAMSMMASXSSSSSMAAAXMXMMMMAXMMXMAMMASXMSAMMSMSXSMMMSASXSMASXMMSMMXAXSAXXAMXSAMXSXMSAAMXAXMAAAAXASMMSMSMSSMMMMMSAMASMMMMMSAMMMSMSX
  AAMMSXXXAXAAXAMAASMSXAAAMMSXMMSMAXAAXMMXAAXAXXAMXAXASXAASXSXSXSAMAAMAMAXAXXAXXMSMXSAMXMXSMMAAMXXAMSMSMMSAMXSXXMAXMAMAXXAXMAMMMXSSMAMAMXMAMMM
  MMMAMMSSMMSSSMSMXMAXMMMXMASMSAAMASXXMXAMMMXXSMASMMSMMMMMMASXMAMXMSXMASMMMXSSSMASAMMXMXXXXAXAMMMMSAAASXMMMSAXMMSXXMASMSSMMSSMXMXAAMXSAMXMAXAM
  XMMAMXAAAAXAAAAXSMSMXXXXMASAMXSMMXMAMXMAXXAMXMAXAXAXSXSAMMMAMSMSMMXMAXMASAAXMAXSAMXAMSMMMSSMMSAAMSMXMAXXAMMMSAAMSXMXAXXAASAMXAMSSMXSASXSMSAS
  SXMMSMSSMMMSMMMSXAXMAMASMAMAMMXASXXSAMXSASMMMAXSSSSXSAXMMASAMAMAAXAMMMSAMMSMSSMMXMSXXAAAAMAAAMSMMMXMSSMMMXSAMSSSMASMSMMMXXAMMXMAXMXSMMMAMSAM
  XAMAXAMXAMXMMXXXMMMMAMXAMASAMASXMAAXAMAMAXMASMMMAAXAMSMXSASASXSSSMSXSAMXSAXMAMXXSMSMSXSMSMMMMXAXMXAMAAAXAAMMMAMAMAMAAAAXASMXMAMMASAMXAMAMMMM
  SSMSSSMSSSSMSSMAMMAMAMXMSMSASMMAMMMMMMXSMSAMXXAMMMMAMMMXMASAMMMAXAAAMXMSMMSMMSSXXAXAAXXXMXMAMXXMASMMSSMMMSSXMXSSMSSSSSMSMXAAMMSSMSASMXSMSAMX
  XXAAAXXXXAMSAXMAMMMSASMXAAXAMXSAMAAAAMXXAMXAMMSMXXAMSASXSXMXMAMAMSMMMSXMAXAXMAMAMMMMMXMAMAMAMSSMMSAMXMASAAMMMMXXAXAAAMAMXSSSMXAAMSAMMASASASM
  AMMMSMMMXMMMSSMMSAASAMXSMSMMMMMASMSSXSASXMSASMAMASMMSASAMAMAMXMMXMAXAXASMMSMMXSMSAAAAAMAMSSMMAAMXSXMAMSMMXSAAASMSMMMMMAMXAAMXMSSMMMMMAMXSAMM
  SXMAXAXMASMXAXAAXMASAMASAMXAAMSMMMAMXMASAAMAXXAMAAAAMXMASASASAXMASMMSSMMAAXAMAMXMASMSMMAMMAMMSMMASMSMSAAMXSXSMSAAMASASXSAMMSXXAAXAAAMXSXMAMX
  MAMAXXMXAXAMMSMMSXMSAMMXXXXSXXAMAMAMXMASXMMSMSMSMSMMMXXASMMASMMSASAAAXXXMMSXMASASXMMXMSMSMAMXMAMASMXSSXSMAMAMAMMMSASAMSAXXAXAMMSMSSMSMSASAMX
  SAMMSMSMSSXMXSAXMAMXXAXSMSMASMXSASXSXMXMASAXAXAXAXASMSSMMAMXMMAMSSMMMSSSXMAMSASXXAMXAXAAXMSMMXSMAMASXMAMMAMAMAMAXMAMAXAMMMMSMAMAAXAMAMXAMMSS
  SASXAAXAAXAMXSXMSMMMSMAAAAMXMXMSMSAMXASMMMSSXMXMAXXAAAXAMMMSAMXSXSASMXMASMXMMASAMSMSSSMXMMMASAXMXSMMAMAMSASAMXSMMSSMMMMXAAMMMMAMXXMMSSMSMSAX
  MMMXMSMMMSMMAMAAXXAAAMSMSMSMMSMSAMAMMMXAXAXMXSAMXSSMMMSMMSXMAMXMASMMMAMAMMMMMAMAMXAXMAMASASAMXMMAAXSSMAMSXSASAAXAAAAXAXSSXSAAMXSSMSAASAMXMMS
  SAAXSXAXAAAAXMMMAMSSMMAAAMAAMXAMXSAMXXSAMXSAAXXXMAXXAXAXAXAAXMAMAMAAMAMMMSAMMXSSMMXMMAMAAAMSMAMXAMMXXXXMMAMAAXXMMSSMMSMMMAMXMSAXAAMMMMMMXAAM
  SMASXSMMSSSMSXSMSMXAXSMSMSSSMMXMASASMASAMAXMASMMSMMSSSMMSSXMASAMASXMSSSMAMSASMMAAMMSSSSXMAMAMMMSAMAMMMMAMAMMMASAMAXAAAAAMMMSXMASMSMMASAMSMSS
  SAMXXXXAAMAMMAXAXMASMXXAAMXMASXMXSAMMAMAMMSAMSAASAAAXAXAMSASASASMSAAAAAMXSMMMASMMSAAMXMXXSSMSAASAMSXMASASASAXMASMMSMMSSMSXXSAMXXXAXSASAMMAAM
  SSXMASMMSSMMMAMMMASAMXSMSMASAMAXAMAMMSSXMXXXMSXMSMMXSAMSSSXMMSAMXSMMMSMMSMMXAXXXSMMXSAXSAMXXMMXSSMASMXSMSMSASMXXMXXXAXMASAXSXMSASAMMXSXMMMMS
""".trimIndent()
