package com.example.inferno.choose_logic

import com.example.inferno.player.*


class Replics{
     var replics : HashMap<Int, Replica> = HashMap()

     init {
         var r1 = Replica(
             "— Можно еще пять минуточек понежиться в постели?",
             "Да", "Нет", "-1",
             2,2, -1, true, false)

         var r2 = Replica("К тебе приходит осознание, что что-то здесь не так. Открываешь левый глаз и смотришь в потолок. \n" +
                 "Твой потолок. \n" +
                 "Открываешь правый глаз и поворачиваешь голову вправо. И точно, ты в своей постели. \n" +
                 "А разве что-то должно быть по-другому?", "Вспомнить", "-1", "-1",
             3, -1, -1, false, false)

         var r3 = Replica("Резкая, точечная головная боль проходит словно молнией в твоем мозгу. \n" +
                 "Ты начинаешь вспоминать. \n" +
                 "Вчера ты шел на квест, пришел в компанию, что обещала тебе 1000 евро за прохождение, выпил чай, не успел предупредить остальных, что он не тот, за кого себя выдает и отключился. \n" +
                 "Неужели ты умер? \n" +
                 "Вот так вот взял и умер и оказался не на Бали, не в Калифорнии, а здесь. В своей спальне. \n" +
                 "Я буду долго смеяться, если сегодня понедельник и тебе придется снова топать на \"любимую\" работу :)",
             "Поёжиться", "Ну, хорошо...", "-1",
             4, 5, -1, true, false)

         var r4 = Replica("— Нет! Только не это! Я даже до пенсии дожить не успел, а опять на работу! ",
             "Ущипнуть себя", "-1", "-1",
             6,-1, -1, false, false)

         var r5 = Replica("— Да, видимо, так и положено. Я сейчас снова встану, снова пойду умываться, снова надену \"белый воротничок\" и пойду на \"любимую\" работу.",
             "Ущипнуть себя", "-1", "-1",
             6,-1, -1, false, false)

         var r6 = Replica("- Погоди! погоди, нет. Больно! Значит я жив. Значит я чувствую. Как говорил Декарт: \"Я мыслю, следовательно, я есмь\". \n" +
                 "Тебя опять кажется, что здесь что-то не так. ты встаешь с кровати и понимаешь, что твоя комната чиста. Не так чиста, когда ты проводил ген.уборку, а чиста в прямом смысле этого слова. У тебя ничего кроме шкафа, пустых полок, стула и кровати в комнате нет. Тебя кто-то обокрал! Окна занавешаны жалюзями. \n" +
                 " - Ладно хоть жалюзи целы.\n" +
                 "Ты встаешь ногами на голый линолиум, не нащупываешь тапочки.",
             "\"— Тапочки с зайчиками!\"", "-1", "-1",
             7,-1, -1, false, false)

         var r7 = Replica("Да, их нет. \n" +
                 "Кажется, воры забрали и их. \n" +
                 "Тапочки твои и вправду были очень милыми.",
             "Открыть жалюзи", "Заглянуть в шкаф", "Осмотреть комнату",
             8,10, 9, true, true)

         var r8 = Replica("Ты подошел к жалюзям и открыл их. Вместо того, чтобы солнечный луч попал ровно на сетчатку глаза, как ты этого ожидал, ты увидел продолжение стены. Окно отсутствует. \n" +
                 "Рама есть, но не более.\n" +
                 "Тебе кажется это странным?",
             "\"Нет, не странно\"", "Да! Я заперт?!", "-1",
             11,12, -1, true, false)

         var r9 = Replica("Ничего нового ты не увидел. Шкаф, стол, окно, которое стена, дверь да кровать, на которой ты спал.",
             "Взглянуть на стол", "Подойти к двери", "-1",
             15,20, -1, true, false)

         var r10 = Replica("Это явно не твой шкаф. Или здесь очень хорошо поработали воры. \n" +
                 "Но, с другой стороны, кому нужны твои майки с Телепузиками?",
             "Осмотреть комнату", "-1", "-1",
             9,-1, -1, false, false)

         var r11 = Replica("Твоя воля. Твоя игра. Твоя жизнь.",
             "Заглянуть в шкаф", "-1", "-1",
             10,-1, -1, false, false)

         var r12 = Replica("Кажется, ситуация начинает накаляться. \n" +
                 "Но не торопись так накручивать себя. \n" +
                 "Быть может, не все так плохо?",
             "Закричать", "Помолиться", "Осмотреть комнату",
             13,14, 9, true, true)

         var r13 = Replica("Ну покричал ты. И что? Ничего хорошего не случилось. \n" +
                 "Правда, и плохого-то ничего не началось. Похоже, что ты здесь один. \n" +
                 "Никто не слышит тебя. Да и ты, впрочем, никого не слышишь.",
             "Осмотреть комнату", "-1", "-1",
             9,-1, -1, false, false)

         var r14 = Replica("Ты внезапно понял, что не можешь найти восток, ибо у тебя нет окна. Какая жалость.",
             "Осмотреть комнату", "-1", "-1",
             9,-1, -1, false, false)

         var r15 = Replica("Над столом ты увидел зеркало, которое здесь всегда висело. Не лучшее дизайнерское решение, но масштабы комнаты обязывают.",
             "Посмотреть в зеркало", "-1", "-1",
             84,-1, -1, false, false)

         var r84 = Replica("О, Боже! Не показывайся мне в таком виде! Ты же абсолютно гол. Гол как сокол!",
             "Отвернуться", "-1", "-1",
             85,-1, -1, false, false)

         var r85 = Replica("Так-то лучше... Кажется, и вправду ты не дома. Иначе зачем тебе появляться передо мной в таком виде?\n" +
                 "- Но я не...\n" +
                 "Никакого не! Либо оденься, либо больше не смотрись в зеркало!",
             "Взглянуть в зеркало еще раз", "- Но здесь нет моей одежды", "-1",
             16,17, -1, true, false)

         //the end
         var r16 = Replica("Ты испытываешь мое терпение? \n" +
                 "Друг мой, я не еврей, я не привык шутить.",
             "Взглянуть в зеркало в третий раз", "Подойти к двери", "-1",
             18,20, -1, true, false)

         var r17 = Replica("А ты прав. Действительно, ничего. Хоть в одеяло заворачивайся.",
             "Завернуться в одеяло", "Подойти к двери", "-1",
             19,20, -1, true, false)

         var r18 = EndReplica("Друг мой. Слушать надо свой голос. \n" +
                 "Человечек внутри тебя ничего плохого не скажет. \n" +
                 "Но ты не послушал меня...\n" +
                 "Ты испытал мое терпение.\n" +
                 "И вот оно - оно кончилось. \n" +
                 "Я покидаю тебя. \n" +
                 "Теперь ты остаешься здесь один. \n" +
                 "Как перед сном - один на один с собой и со своими мыслями.",
             "Конец", "-1", "-1",
             -1,-1, -1, false, false, false)

         var r19 = Replica("Так-то лучше!",
             "Подойти к двери", "-1", "-1",
             20,-1, -1, false, false)

         var r20 = Replica("Ха! А дверь-то открыта! Ну все, сейчас ты выйдешь, разберешься со всеми, как умеешь, да?\n" +
                 "- Угу...\n" +
                 "Что не так? Силы тебя оставили иль ругаться уже не хочешь?\n" +
                 "- Взгляни за дверь...\n" +
                 "Опаньки, а это что за штука? Ах, лифт. Ну ничего. Сейчас поднимешься наверх и задашь этим ученым жару! Будут знать, как над людьми добрыми издеваться",
             "Зайти в лифт", "-1", "-1",
             86,-1, -1, false, false)

         var r86 = Replica("Вполне обычный лифт. Правда, не исписан словами гадкими. \n" +
                 "Реклам такси нет. Кнопки не подожжены. \n" +
                 "Кнопки... \n" +
                 "Тут всего одна кнопка, друг мой, красная, как кровь девственницы. И написано на ней: \"АД\".",
             "Едем в ад!", "-1", "-1",
             87,-1, -1, false, false)

         var r87 = Replica("Лифт закрылся и в нем стало темно. \n" +
                 "Очень темно. \n" +
                 "Подсвечивается только кнопка, но ее хватает только до того, чтобы увидеть свой нос. Что делают твои руки, ни я, ни ты не видим.\n" +
                 "...\n" +
                 "Лифт остановился. Тяжело так остановился, грузно. Открылись ставни, и лифт тебя будто выплюнул. \n" +
                 "Ты не понял, как это произошло, но это произошло. \n" +
                 "Ты оказался на полу. Холодном, бетонном полу.",
             "Осмотреться", "Подойти к лифту", "-1",
             23,21, -1, true, false)

         var r21 = Replica("Кроме закрытых намертво дверей ты не увидел ничего. Ни одной кнопочки. Ни одного рычажка.\n" +
                 "Кажется, ты в западне. Лох!",
             "Осмотреться", "Стукнуть лифт ногой", "-1",
             23,22, -1, true, false)

         //  -10hp
         var r22 = HpChangingRepilca("Ну зачем ты так делаешь? \n" +
                 "Не делай так больше, пожалуйста. Отобьешь себе все конечности. \n" +
                 "Они тебе еще пригодятся.",
             "Осмотреться", "-1", "-1",
             23,-1, -1, false, false, -10)

         var r23 = Replica("Жутко. \n" +
                 "Темно.\n" +
                 "Чувство леденящего страха охватывает тебя.\n" +
                 "В дальнем углу горит какой-то огонек. Волосы встают дыбом. \n" +
                 "Даже там, где, по идеи, вставать не умеют.",
             "Подойти к огоньку", "-1", "-1",
             88,-1, -1, false, false)

         var r88 = Replica("Огоньком оказался факел. Хм, мне вот интересно, ты до этого хоть раз видел факел вживую? Али всё на картинках, в фильмах да играх?\n" +
                 "...\n" +
                 "Присмотревшись, ты увидел рядом с факелом табуретку. \n" +
                 "Советскую такую, деревянную. Ей сто лет в обед, а крепенькая с виду. \n" +
                 "На ней лежит фонарь.",
             "Взять фонарь", "Взять факел", "-1",
             24,25, -1, true, false)

         //добавляется предмет фонарь в правую руку
         var r24 = ItemChangingReplica("Ты взял фонарь в правую руку. Как заметили ранее, у тебя нет карманов, поэтому у тебя осталась всего одна рука свободная. \n" +
                 "Береги её.",
             "Идти дальше, освещая себе путь фонарём", "-1", "-1",
             26,-1, -1, false, false, FlashLight(), "right")

         //добавляется факел в правую руку
         var r25 = ItemChangingReplica("Ты взял факел в правую руку. Как заметили ранее, у тебя нет карманов, поэтому у тебя осталась всего одна рука свободная. \n" +
                 "Береги её.",
             "Идти дальше, освещая себе путь фонарём", "-1", "-1",
             26,-1, -1, false, false, Torch(), "right")

         var r26 = Replica("Действительно, что тут сидеть. Давай искать выход, раз так вышло. У тебя есть чем осветить себе дорогу, это хорошо, ибо без света тут глаз выколи, ни черта не видно. \n" +
                 "- Черта мне тут еще не хватало.\n" +
                 "Ну что бубнеть? Иди, раз подписался на такое приключение. \n" +
                 "Дороги назад нет.",
             "Продолжать идти", "-1", "-1",
             89,-1, -1, false, false)

         var r89 = Replica("Впереди тупик. Ты, видимо, где-то пропустил поворот. Внимательнее надо быть! Вдруг от этого зависит твоя жизнь?",
             "Усмехнуться", "-1", "-1",
             90,-1, -1, false, false)

         var r90 = Replica("Что наша жизнь?",
             "Игра", "Икра", "Друзь",
             27,28, 29, true, true)

         var r27 = Replica("Right! То бишь правильно. Это из арии Германа, опера \"Пиковая Дама\" Чайковского, но это ты итак без меня знал, верно?",
             "Безусловно", "-1", "-1",
             30,-1, -1, false, false)

         var r28 = Replica("А ты шутник, я посмотрю. Ну, шути-шути, это же не я заперт не пойми где.\n" +
                 "У меня вот к тебе тут вопрос назрел по существу. Ты выход-то искать планируешь?",
             "\"Угу\"", "-1", "-1",
             30,-1, -1, false, false)

         var r29 = Replica("О, мсье знает толк в извращениях. Тоже осеннюю серию ждете?",
             "\"Естественно, обижаешь!\"", "-1", "-1",
             30,-1, -1, false, false)

         //blanket YES or NO
         var r30 = CheckItemReplica("Ты завернул за угол, прошел до конца очередного ветвления, завернул направо, затем до конца и налево. \n" +
                 "Ты идешь уже приличиных четыре минут и достаточно устал!",
             "Прилечь отдохнуть blanketYes", "Некогда отдыхать, двигаем дальше", "Прилечь отдохнуть blanketNo",
             31,35, 91, true, true, "Blanket")

         //есть ли одеяло у героя (blanketYes)
         var r31 = Replica("Хоть и стоит адская холодрыга, тебе удается оставаться в сознании, лежа на полу, ибо захватил одеяло и лежишь на нем.",
             "\"- Предусмотрительность моё второе имя!\"", "-1", "-1",
             32,-1, -1, false, false)

         //есть ли одеяло у героя (blanketNo)
         //the end
         var r91 = Replica("Дурашка, зачем ты лег нагим на ледяной пол?",
             "Уже встаю", "И что? Полежу еще немного.", "-1",
             33,34, -1, true, true)

         var r32 = Replica("И молодец. Хотя Акакий звучало бы лучше. \n" +
                 "Двигай дальше.",
             "Двигаю", "-1", "-1",
             35,-1, -1, false, false)

         var r33 = Replica("Вот и правильно. Вот и молодец. Нечего испытывать судьбу.",
             "\"Предусмотрительность - мой второе имя!\"", "-1", "-1",
             32,-1, -1, false, false)

         var r34 = EndReplica("Ты не заметил, как к тебе сзади подползла змея. Они же очень тихие, не правда ли? \n" +
                 "Ты укушен. \n" +
                 "Сломлен. \n" +
                 "Разбит и подвален. \n" +
                 "А еще ты проиграл.",
             "Конец", "-1", "-1",
             -1,-1, -1, false, false, false)

         var r35 = Replica("Следующим препятствием для тебя стала дверь.",
             "Подёргать", "И так понятно, что закрыта", "-1",
             36,37, -1, false, false)

         var r36 = Replica("Н-да... Друг мой, ты фильмов не смотрел? Книжек не читал? Естестевенно, что она закрыта. \n" +
                 "Ну и работенка у меня, с такими, как ты якшаться.",
             "Приглядеться к двери", "-1", "-1",
             38,-1, -1, false, false)

         var r37 = Replica("Ну, конечно, а как по-другому? Я бы разочаровался, если бы ты стал дергать эту чертову ручку. \n" +
                 "Не расстраивай меня, будь лапочкой.",
             "Приглядеться к двери", "-1", "-1",
             38,-1, -1, false, false)

         var r38 = Replica("На ней ты разглядел амбарный замок. А на нем 6 значный код. \n" +
                 "Хм... Тебе нужно угадать этот код, дорогой мой, чтобы пройти дальше.",
             "Попробовать 00-00-00", "Закатить глаза", "-1",
             39,40, -1, false, false)

         var r39 = Replica("Пф, друг мой, не подходит. Ты и вправду надеялся на такой просто исход событий?",
             "Думать", "-1", "-1",
             41,-1, -1, false, false)

         var r40 = Replica("Э, не. \n" +
                 "Это тебе не поможет. \n" +
                 "Нужно подумать, какой код тут может быть.",
             "Думать", "-1", "-1",
             41,-1, -1, false, false)

         var r41 = Replica("6 делений, по 10 цифр. Всего-то миллион комбинаций.\n" +
                 "Либо думай, либо подбирай.",
             "Подумать ещё", "Начать подбирать", "-1",
             42,43, -1, true, false)

         var r42 = Replica("Дам небольшую подсказку. За последние пару дней ты слышал только одну последовательность из шести цифр подряд. Вспоминай.",
             "- Может, это их номер?!", "-1", "-1",
             47,-1, -1, false, false)

         var r43 = CheckItemReplica("00-00-01...\n" +
                 "00-00-02...\n" +
                 "00-00-03...\n" +
                 "...\n" +
                 "00-00-30...",
             "Продолжить подбирать flashlightYes.", "Устал", "Продолжить подбирать flashlightNo",
             45,44, 92, true, false, "FlashLight")

         var r44 = Replica("Устал, говоришь? Ладно, дам подсказку. За последние пару дней ты слышал только одну последовательность из шести цифр подряд. Вспоминай.",
             "\"- Может, это их номер?!\"", "-1", "-1",
             47,-1, -1, false, false)

         //что именно у героя: фонарь (flashlightYes)
         var r45 = Replica("00-00-40...\n" +
                 "00-00-41...\n" +
                 "00-00-42...\n" +
                 "...\n" +
                 "00-26-99...\n" +
                 "...\n" +
                 "Твой фонарь погас. \n" +
                 "Теперь ты ничего не видишь.\n" +
                 "\"Вернуться туда, где брал фонарик\"",
             "Ущипнуть себя", "-1", "-1",
             46,-1, -1, false, false)

         //что именно у героя: факел (flashlightNo)
         var r92 = Replica("00-00-40...\n" +
                 "00-00-41...\n" +
                 "00-00-42...\n" +
                 "...\n" +
                 "00-26-99...\n" +
                 "...\n" +
                 "Твой факел погас. \n" +
                 "Теперь ты ничего не видишь.\n" +
                 "\"Вернуться туда, где брал факел\"",
             "Ущипнуть себя", "-1", "-1",
             46,-1, -1, false, false)


         var r46 = EndReplica("Ты еле в потёмках нашел то место, но там не осталось даже табуретки. \n" +
                 "Ты присел на пол и заплакал. \n" +
                 "Горько заплакал.\n" +
                 "А еще проиграл.",
             "Конец", "-1", "-1",
             -1,-1, -1, false, false, false)


         var r47 = Replica("Ты попробовал ввести 20-02-20 и, к моему и твоему удивлению, замок поддался.",
             "Зайти в дверь", "-1", "-1",
             93,-1, -1, false, false)

         var r93 = Replica("По иронии судьбы, дверь за тобой захлопнулась так быстро, что ты ничего не успел понять. Кажется, ты прошел на следующий уровень. Вроде, было не сложно, не правда ли?",
             "\"Да, несложно\"", "\"Вообще-то, не очень...\"", "-1",
             48,49, -1, true, false)

         var r48 = Replica("Вот и правильно, вот и ладненько! Нечего нюни распускать!",
             "Двигаться дальше flashlightYes", "Двигаться дальше flashlightNo", "-1",
             50,94, -1, true, false)

         var r49 = CheckItemReplica("Да хорош стонать. Жить же так здорово здорово! А ты жив, так что все супер гуд.\n" +
                 "- Татарстан супер гуд...\n" +
                 "Бер, ике, эч, дурт! Ну вот, не теряешь оптимизма.",
             "Двигаться дальше, напевая песенку flashlightYes", "-1", "Двигаться дальше, напевая песенку flashlightNo",
             50,-1, 94, false, true, "FlashLight")

         //что именно у героя: фонарь (flashlightYes)
         var r50 = Replica("Ты уже замечал, как твой фонарик тухнет, но подумал, что он еще сможет долго прожить. \n" +
                 "Но снова оказался неправ. \n" +
                 "Фонарь окончально издох и никакие постукивания батареек друг о друга тебя не спасли.",
             "Расстроиться", "-1", "-1",
             51,-1, -1, false, false)

         //что именно у героя: факел (flashlightNo)
         var r94 = Replica("Ты так сильно был занят вглядыванием в темноту, что не заметил, как у тебя погас твой факел тем потоком обжигающе холодного воздуха, который прошелся с тобой рядом, когда захлопнулась дверь.",
             "Расстроиться", "-1", "-1",
             51,-1, -1, false, false)


         var r51 = Replica("Эх, вот незадачка-то... Будем идти дальше наощупь...\n" +
                 "Ты оперся на левую стенку и пошел вперед.",
             "Угу", "-1", "-1",
             95,-1, -1, false, false)

         var r95 = Replica("Передвигаясь по стеночке ты полз вперед, тихонько, прислушиваясь. \n" +
                 "Буквально через минуту ты услышал чье-то тяжелое дыхание. \n" +
                 "Чуть позже понял, что его издает не человек.",
             "\"Волк?\"", "\"Собака?\"", "-1",
             96,96, -1, true, false)

         var r96 = Replica("А я почем знаю! Ишь советника нашел.\n" +
                 "...\n" +
                 "Меж тем, дыхание слышалось всё чётче. Ты понял, что оно исходит откуда-то справа.",
             "Ринуться вперёд", "Продолжать идти на цыпочках", "-1",
             52,53, -1, true, false)

         var r52 = Replica("Ты вытянул руки вперед и стал бежать со всех сил. Наткнулся на очередную дверь и чуть не распластался. \n" +
                 "Черт, она заперта!\n" +
                 "Животное тебя заметило и с лаем движется на тебя.",
             "Ощупать всё вокруг", "-1", "-1",
             54,-1, -1, false, false)

         var r53 = Replica("Животное приближалось. А твое сердцебиение учащалось.",
             "Идти на цыпочках", "Побежать в неизвестность", "-1",
             55,52, -1, true, false)

         var r54 = Replica("Кажется, ты нащупал на полу пистолет, нож и игрушку, кажется, это петух-пищалка. Что выбираешь?",
             "Взять нож", "Взять петуха", "Взять пистолет",
             58,59, 57, true, true)

         var r55 = Replica("Оно учуяло тебя. Залаяло и побежало на тебя.",
             "Бежать со всех ног!", "-1", "-1",
             56,-1, -1, false, false)

         //минус 20 хп
         var r56 = HpChangingRepilca("Ты добежал до конца коридора и чуть не вляпался в дверь. Подергал, но безрезультатно, она заперта. \n" +
                 "Упал на пол и копчиком нащупал пистолет.",
             "Взять пистолет", "-1", "-1",
             57,-1, -1, false, false, -20)

         //добавляется предмет пистолет в правую руку
         //the end
         var r57 = ItemChangingReplica("Слава твоему ОБЖшнику, ты знаешь, где снимать пистолет с предохранителя. Ты его снял и направил в темноту, в ту сторону, откуда издавались запыхивающиеся звуки.\n" +
                 "Животное очень близко!",
             "Стрелять!", "Подождать ещё немного", "-1",
             61,60, -1, true, false, Gun(), "right")

         //добавляется предмет нож в правую руку
         var r58 = ItemChangingReplica("В тебе заиграла природа, ты чувствуешь, что главная цель сейчас - выжить!\n" +
                 "Ты размахиваешь ножом перед своим носом, не видя ни зги.",
             "Размахивать дальше", "Успокоиться", "-1",
             63,64, -1, true, false, Knife(), "right")

         //добавляется предмет петух в правую руку
         var r59 = ItemChangingReplica("Ты решаешь, что это все-таки собака и что она успокоиться и отстанет от тебя, если ты кинешь ей игрушку. Проверим...\n" +
                 "Ты нажимаешь на петуха, он крякает, а затем кидаешь его со всей силы куда-то вдаль.",
             "Кинуть", "-1", "-1",
             62,-1, -1, false, false, Cock(), "right")


         var r60 = EndReplica("Оно налетело на тебя так мгновенно, что ты ничего не успел предпринять, ты встрелил, но мимо. \n" +
                 "Последнее, что ты услышал, был звук отскакивающей от стены пули.\n" +
                 "Ты проиграл, навсегда проиграл.",
             "Конец", "-1", "-1",
             -1,-1, -1, false, false, false)

         var r61 = Replica("Удача сегодня благоволит тебе. Выстрелив, ты услышал громкий стон животного и гулкий пух! Животное пало замертво. \n" +
                 "Кажется, ты его убил.",
             "Встать на ноги", "-1", "-1",
             97,-1, -1, false, false)

         var r97 = Replica("У тебя есть еще левая рука, ты можешь в нее что-то взять.",
             "Нож", "Собачью игрушку", "-1",
             69,70, -1, true, false)

         var r62 = EndReplica("Не происходит ровным счётом ничего. Животное всё также несется на тебя. Ты инстинктивно закрываешь лицо руками. \n" +
                 "А потом ты проигрываешь. Больно, очень больно проигрываешь.",
             "Конец", "-1", "-1",
             -1,-1, -1, false, false, false)

         //минус 30 хп
         //левая рука недееспособна
         var r63 = DisableHandReplica("Животное налетело на тебя, первый удар пришелся ему. \n" +
                 "Второй достался тебе - это волк - он прокусил твою левую руку. \n" +
                 "Третий удар достался волку. Ты глубоко порезал его нос. \n" +
                 "Тот не решил дальше испытывать судьбу и покавылял туда, откуда пришел.",
             "Встать", "-1", "-1",
             65,-1, -1, false, false, -30)

         //минус 60 хп
         //левая рука недееспособна
         var r64 = DisableHandReplica("Животное неустанно бежит к тебе. Первый КУСЬ сделало оно. Ты почувствовал, как его клыки вонзаются в твою левую руку и протыкают её насквозь. От прилива адреналина ты вонзил нож в брюхо волка, да, кажется, это волк, и животное замертво пало. \n" +
                 "Тебе повезло, что у тебя был не нож, а чуть ли не мачете.",
             "Встать", "-1", "-1",
             65,-1, -1, false, false, -60)

         var r65 = Replica("Ты можешь взять что-то с собой.",
             "Пистолет", "Окровавленный нож", "Собачью игрушку",
             66,67, 68, true, true)

         //добавляется предмет пистолет в правую руку
         var r66 = ItemChangingReplica("В связи с последними событиями, он может вполне сгодиться для чего-то. Но он такой ледяной...",
             "Осмотреть дверь", "-1", "-1",
             71,-1, -1, false, false, Gun(), "right")

         //добавляется предмет окровавленный нож в правую руку
         var r67 = ItemChangingReplica("Были б штаны, ты б его об штаны обтёр. Но, увы, их как не было, так и нет.",
             "Осмотреть дверь", "-1", "-1",
             71,-1, -1, false, false, BloodyKnife(), "right")

         //добавляется предмет собачья игрушка в правую руку
         var r68 = ItemChangingReplica("Не самое лучшее решение. Зато развлечься можно, если будет скучно.",
             "Осмотреть дверь", "-1", "-1",
             71,-1, -1, false, false, Cock(), "right")

         //добавляется предмет нож в левую руку
         var r69 = ItemChangingReplica("Неплохо, может сгодиться.",
             "Осмотреть дверь", "-1", "-1",
             71,-1, -1, false, false, Knife(), "left")

         //добавляется предмет собачья игрушка в левую руку
         var r70 = ItemChangingReplica("Не самое лучшее решение. Зато развлечься можно, если будет скучно.",
             "Осмотреть дверь", "-1", "-1",
             71,-1, -1, false, false, Cock(), "left")


         var r71 = Replica("Дверь... И снова преграды. Так как по-прежнему темно, ты стал ее ощупывать. \n" +
                 "Здесь засовы, щеколды, кажется, в несметном количестве. Ты стал их все открывать.",
             "Открыл!", "-1", "-1",
             98,-1, -1, false, false)

         var r98 = Replica("Ну вот и здорово, наконец-то мы можем двигаться дальше. Но нет! Снова та же дверь! Что за издевательство!",
             "Открыл! x2", "-1", "-1",
             99,-1, -1, false, false)

         var r99 = Replica("Надеюсь, теперь всё. Но нет... Предположим, Бог любит троицу...",
             "Открыл! x3", "-1", "-1",
             100,-1, -1, false, false)

         var r100 = Replica("Да, всё, ура! Ты вышел.\n" +
                 "Эта комната уже в цвете. В тяжелом, мигающем красном цвете. С ума сойти можно.",
             "Ага", "Всё под контролем", "-1",
             101,101, -1, true, false)

         var r101 = Replica("Ты увидел стол, на котором лежит яблоко и записка.",
             "Прочесть записку", "-1", "-1",
             102,-1, -1, false, false)

         var r102 = Replica("На ней написано: \n" +
                 "'Это яблоко может быть ядовитым. Это так, если Ева в Райском саду надкусила именно яблоко и не так, если плод был другим'",
             "Съесть яблоко", "Не есть яблоко", "-1",
             72,73, -1, true, false)

         //плюс 20 хп (либо максимум)
         var r72 = HpChangingRepilca("Ты оказался прав, яблоко - не ядовитое, и Ева съела именно \"запретный плод\", нигде не указывается, что это было именно яблоко.",
             "Пройти дальше", "-1", "-1",
             74,-1, -1, false, false, 20)


         //минус 10 хп
         var r73 = HpChangingRepilca("Ну и ладно, но яблоко-то всё-таки полностью безопасное. \n" +
                 "Ева съела \"запретный плод\", который никогда не назывался \"яблоком\".\n" +
                 "У тебя урчит в животе. Ты давно не ел",
             "Пройти дальше", "-1", "-1",
             74,-1, -1, false, false, -20)


         //todo
         var r74 = CheckItemReplica("",
             "Далее", "-1", "knifeNo",
             104,-1, 105, false, false, "Knife")

         //knifeYes
         var r104 = CheckItemReplica("",
             "Далее", "-1", "gunNo",
             109,-1, 106, false, false, "Gun")

         //knifeNo
         var r105 = CheckItemReplica("",
             "Далее", "-1", "gunNo",
             107,-1, 112, false, false, "Gun")

         //knifeYes gunNo
         var r106 = CheckItemReplica("",
             "Далее", "-1", "petuhNo",
             10,-1, 108, false, false, "Cock")

         //нет ситуации knifeYes gunNo petuhYes

         //knifeNo gunYes
         var r107 = CheckItemReplica("",
             "Далее", "petuhNo", "-1",
             110,-1, 111, false, false, "Cock")

         //knifeYesGunNoPetuhNo
         var r108 = Replica("Пройдя дальше, ты увидел невообразимое! Огромные ворота под самые небеса, которых даже не видно. \n" +
                 "Перед ними стоят два стражника. Не как ты подумал, в доспехах и с копьями, а в броннике и с калашом на плече. \n" +
                 "Они смотрят в твою сторону, но, кажется, тебя не видят. \n" +
                 "Они выглядят опасными, но если бы тебе хотели зла, давно бы уже его причинили. \n" +
                 "Что думаешь делать?",
             "Подбежать к ним и располосовать их страшные лица", "Подойти к ним и спросить, как можно пройти", "-1",
             75,80, -1, true, false)

         //knifeYesGunYesPetuhNo
         var r109 = Replica("Пройдя дальше, ты увидел невообразимое! Огромные ворота под самые небеса, которых даже не видно. \n" +
                 "Перед ними стоят два стражника. Не как ты подумал, в доспехах и с копьями, а в броннике и с калашом на плече. \n" +
                 "Они смотрят в твою сторону, но, кажется, тебя не видят. \n" +
                 "Они выглядят опасными, но если бы тебе хотели зла, давно бы уже его причинили. \n" +
                 "Что думаешь делать?",
             "Подбежать к ним и располосовать их страшные лица",
             "Подойти к ним и спросить, как можно пройти",
             "Подойти и сделать два хедшота из пистолета",
             75,80, 76, true, true)


         //knifeNoGunYesPetuhYes
         var r110 = Replica("Пройдя дальше, ты увидел невообразимое! Огромные ворота под самые небеса, которых даже не видно. \n" +
                 "Перед ними стоят два стражника. Не как ты подумал, в доспехах и с копьями, а в броннике и с калашом на плече. \n" +
                 "Они смотрят в твою сторону, но, кажется, тебя не видят. \n" +
                 "Они выглядят опасными, но если бы тебе хотели зла, давно бы уже его причинили. \n" +
                 "Что думаешь делать?",
             "Подойти к ним и спросить, как можно пройти",
             "Отдать им собачью игрушку взамен на пропуск дальше",
             "Подойти и сделать два хедшота из пистолета",
             80,77, 76, true, true)

         //knifeNoGunYesPetuhNo
         var r111 = Replica("Пройдя дальше, ты увидел невообразимое! Огромные ворота под самые небеса, которых даже не видно. \n" +
                 "Перед ними стоят два стражника. Не как ты подумал, в доспехах и с копьями, а в броннике и с калашом на плече. \n" +
                 "Они смотрят в твою сторону, но, кажется, тебя не видят. \n" +
                 "Они выглядят опасными, но если бы тебе хотели зла, давно бы уже его причинили. \n" +
                 "Что думаешь делать?",
             "Подойти к ним и спросить, как можно пройти",
             "Подойти и сделать два хедшота из пистолета",
             "-1",
             80,76, -1, true, false)

         //knifeNoGunNoPetuhYes
         var r112 = Replica("Пройдя дальше, ты увидел невообразимое! Огромные ворота под самые небеса, которых даже не видно. \n" +
                 "Перед ними стоят два стражника. Не как ты подумал, в доспехах и с копьями, а в броннике и с калашом на плече. \n" +
                 "Они смотрят в твою сторону, но, кажется, тебя не видят. \n" +
                 "Они выглядят опасными, но если бы тебе хотели зла, давно бы уже его причинили. \n" +
                 "Что думаешь делать?",
             "Подойти к ним и спросить, как можно пройти",
             "Отдать им собачью игрушку взамен на пропуск дальше",
             "-1",
             80,77, -1, true, false)



         var r75 = EndReplica("Ты очень явно и громко бежал на них, сверкая своим мачете. Они не такие простаки, как ты, поэтому схватили свои аппараты, направили на тебя и... \n" +
                 "И игра закончилась. \n" +
                 "А финал был так близок...",
             "Конец", "-1", "-1",
             -1,-1, -1, false, false, false)


         var r76 = EndReplica("Нет, нет и еще раз нет. У тебя конечно ничего не вышло. Ты думаешь, что ты такой профи? \n" +
                 "По-моему, надо было развенчать этот миф еще в самом начале истории. \n" +
                 "Пока ты направлял свой пистолет на одного из них, ты уже падал на ледяной пол.\n" +
                 "Игра закончилась. Ты был так близок к финалу...",
             "Конец", "-1", "-1",
             -1,-1, -1, false, false, false)


         var r77 = Replica("Ты подошел к страже, протянул одному из них петуха и жалобно так, как щенок, заскулил: ",
             "\"- Пропустите\"", "-1", "-1",
             103,-1, -1, false, false)

         var r103 = Replica("Они взорвались диким хохотом, но ничего не стали предпринимать. Смеялись, смеялись, сгибаясь в три погибели. А когда прекратили, второй сказал:\n" +
                 "\"Позабавил, друг мой, ты первый, кто выбрал этот исход событий. Пусть это против правил, но я не думаю, что начальство будет слишком против. Проходи\"\n" +
                 "...\n" +
                 "Они отворили врата и оттуда повалил яркий-яркий свет. После тьмы он тебя ослепил, и ты шел вперед медленно, боясь неосторожного шага.",
             "Ковылять", "-1", "-1",
             78,-1, -1, false, false)

         //GOOD
         var r78 = EndReplica("Тебя встретили чуть дальше. Трясли за плечи и снова хохотали. \n" +
                 "Спустя несколько десятков разнообразных вопросах об ощущениях, мотивах и действиях, тебя отпустили. \n" +
                 "Отпустили с тысячей евро в руках. Класс! Оригинальность спасает иногда жизни.",
             "Конец", "-1", "-1",
             -1,-1, -1, false, false, true)


         var r80 = Replica("Стражник посмотрел на тебя сверху вниз и заговорил. Голос его был низок и груб:\n" +
                 "'Это финальное испытание, чтобы пройти его, тебе необходимо сразиться с Добрыней в битве.'",
             "\"Какой?\"", "-1", "-1",
             113,-1, -1, false, false)

         var r113 = Replica("'Добрыня выбирает на своё усмотрение. Игра до трёх побед. Добрыня?'\n" +
                 "'Сегодня я хочу, чтобы ты для меня выиграл два полцарства!' - сказал Добрыня.",
             "\"Смеёшься?\"",
             "\"Два полцарства, серьёзно?\"",
             "\"Может быть выберем что-то другое?\"",
             81,82, 83, true, true)


         //два полцарства
         var r81 = GameReplica("'Нет. Я абсолютно серьёзен. Ты сразишься с моим другом - Деревянным Дедом.'",
             "В бой!", "-1", "-1",
             -10,-1, -1, false, false, "tree")

         //два полцарства
         var r82 = GameReplica("'А что-то не так? Одного полцартсва будет маловато, чтобы пройти дальше.'",
             "\"- Справедливо. В бой!\"", "-1", "-1",
             -10,-1, -1, false, false, "tree")

         var r83 = GameReplica("'Хитрец. Ладно, Добрыня сегодня добрый. Будем играть в камень-ножница-бумага-ящерица-спок'",
             "\"Что?!\"", "-1", "-1",
             114,-1, -1, false, false, "tree")

         //кнб
         var r114 = GameReplica("'Хех, пошутил я. Тебе здесь точно не выиграть. Я мастер. Будем играть в 'камень-ножница-бумага'. Но и там у тебя мало шансов, друг мой. Я знаю секретные тактики, доступные только шаолинским монахам.'",
             "\"Погнали\"", "-1", "-1",
             -11,-1, -1, false, false, "knb")



         replics.set(1, r1)
         replics.set(2, r2)
         replics.set(3, r3)
         replics.set(4, r4)
         replics.set(5, r5)
         replics.set(6, r6)
         replics.set(7, r7)
         replics.set(8, r8)
         replics.set(9, r9)
         replics.set(10, r10)
         replics.set(11, r11)
         replics.set(12, r12)
         replics.set(13, r13)
         replics.set(14, r14)
         replics.set(15, r15)
         replics.set(16, r16)
         replics.set(17, r17)
         replics.set(18, r18)
         replics.set(19, r19)
         replics.set(20, r20)
         replics.set(21, r21)
         replics.set(22, r22)
         replics.set(23, r23)
         replics.set(24, r24)
         replics.set(25, r25)
         replics.set(26, r26)
         replics.set(27, r27)
         replics.set(28, r28)
         replics.set(29, r29)
         replics.set(30, r30)
         replics.set(31, r31)
         replics.set(32, r32)
         replics.set(33, r33)
         replics.set(34, r34)
         replics.set(35, r35)
         replics.set(36, r36)
         replics.set(37, r37)
         replics.set(38, r38)
         replics.set(39, r39)
         replics.set(40, r40)
         replics.set(41, r41)
         replics.set(42, r42)
         replics.set(43, r43)
         replics.set(44, r44)
         replics.set(45, r45)
         replics.set(46, r46)
         replics.set(47, r47)
         replics.set(48, r48)
         replics.set(49, r49)
         replics.set(50, r50)
         replics.set(51, r51)
         replics.set(52, r52)
         replics.set(53, r53)
         replics.set(54, r54)
         replics.set(55, r55)
         replics.set(56, r56)
         replics.set(57, r57)
         replics.set(58, r58)
         replics.set(59, r59)
         replics.set(60, r60)
         replics.set(61, r61)
         replics.set(62, r62)
         replics.set(63, r63)
         replics.set(64, r64)
         replics.set(65, r65)
         replics.set(66, r66)
         replics.set(67, r67)
         replics.set(68, r68)
         replics.set(69, r69)
         replics.set(70, r70)
         replics.set(71, r71)
         replics.set(72, r72)
         replics.set(73, r73)
         replics.set(74, r74)
         replics.set(75, r75)
         replics.set(76, r76)
         replics.set(77, r77)
         replics.set(78, r78)
         replics.set(80, r80)
         replics.set(81, r81)
         replics.set(82, r82)
         replics.set(83, r83)
         replics.set(84, r84)
         replics.set(85, r85)
         replics.set(86, r86)
         replics.set(87, r87)
         replics.set(88, r88)
         replics.set(89, r89)
         replics.set(90, r90)
         replics.set(91, r91)
         replics.set(92, r92)
         replics.set(93, r93)
         replics.set(94, r94)
         replics.set(95, r95)
         replics.set(96, r96)
         replics.set(97, r97)
         replics.set(98, r98)
         replics.set(99, r99)
         replics.set(100, r100)
         replics.set(101, r101)
         replics.set(102, r102)
         replics.set(103, r103)
         replics.set(104, r104)
         replics.set(105, r105)
         replics.set(106, r106)
         replics.set(107, r107)
         replics.set(108, r108)
         replics.set(109, r109)
         replics.set(110, r110)
         replics.set(111, r111)
         replics.set(112, r112)
         replics.set(113, r113)
         replics.set(114, r114)
     }

 }
