---
date: July 2021
title: Project Rules and Agreements.
---

![image](Pictures/android_logo.jpg){width="75mm"}

# Вводная часть.

Итак, если Вы читаете данный документ, значит являетесь участником
команды, которая будет заниматься разработкой игры в рамках собственной
инициативы летом 2021 года. Ниже будут представлены правила и тезисы, с
которыми Вам придется согласиться, если Вы хотите участвовать. Меня
звать Ваня, в рамках проекта буду решать организационные вопросы и
возникающие проблемы. У меня нет каких-то особых знаний и умений по
отношению ко всем участникам, просто так получилось, что мне доверили
этим заниматься с:

П.с. в доке очень важные вещи отмечены красным цветом, все ссылки
зеленого цвета. [Нужно]{style="color: red"} тыкать на такого рода слова,
дабы наше взаимодействие было успешным и качественным.

# Общие правила.

1.  Не бывает глупых вопросов, но прежде чем задать свой содержательный
    вопрос кому бы то ни было, лучше воспользоваться знаниями
    человечества([Google](https://google.com/)) и если все таки
    разобраться самостоятельно не удалось, спросить у товарища. Это не
    моя прихоть, а стремление к получению каждым участником важного
    опыта. Если будут возникать вопросы общего характера пишите в
    беседу, тегая нужных людей, либо если хотите спросить конкретно меня
    о чем то пишите [сюда](https://t.me/IvanBazalii)

2.  По поводу оформления кода, думаю, длинные комментарии излишни,
    поскольку Вы как минимум год прогаете и you know, what the good code
    is, но [это](http://neerc.ifmo.ru/teaching/disalgo/cppcodestyle.pdf)
    и [это](https://google.github.io/styleguide/) обязательно
    прочитайте. По поводу непосредственно codestyle: составлен
    [.editorconfig](https://github.com/Bazalii/School_Live_Simulator/blob/master/.editorconfig),
    который задает размер таба, оформление конца файла, о которых я пишу
    ниже, но все таки нам [важно]{style="color: red"} договориться и о
    тезисах, которые зависят только от Вас:

    a\) Названия переменных должны быть [говорящие]{style="color: red"}
    (исключение счетчики в циклах, можете называть из i, j, k, но лучше
    counter и т.п.). Но без фанатизма, не нужно давать название на 30
    слов, что Вы имели в виду, четко, конкретно и по делу

    b\) Условимся, что все названия \"серьезных\" объектов(не переменные
    и не константы): нимена классов, интерфейсов, метаклассов и т.п.
    будем оформлять в UpperCamelCase, а названия функций, методов
    классов в lowerCamelCase
    ([тык](https://ru.wikipedia.org/wiki/CamelCase)), все константы -
    caps и нижнего подчеркивания(THIS_IS_AN_EXAMPLE.),а все
    переменные(поля классов\...) будут строго с использованием маленьких
    букв и разделением нижним подчеркиванием:

    this_is_an_example.

    c\) [Необходимо]{style="color: red"} оставлять развернутые(без
    фанатизма) комментарии по поводу того, что делает та или иная
    функция, и кратко по поводу переменных. Комментарии должны строиться
    в JavaDoc Style. Более подробно читайте в разделе документирование
    [тут](https://github.com/Bazalii/School_Live_Simulator/blob/master/Documents/Project_formalization.pdf)

    d\) Размер Tab == 4 пробела.

    Если будут возникать какие-то нюансы в процессе работы - будем
    вводить уинифицированные договоренности по поводу оформления(e.g.
    пробел/enter перед { в for)

3.  Дедлайнов по промежуточным задачам как таковых нет, чем быстрее -
    тем лучше. Главное, чтобы качество от этого не страдало. Крайний
    дедлайн - середина августа, где то к 15 числу очень хотелось бы
    иметь готовый продукт, имеющий право на жизнь. Но если все пойдет
    как и планируется, то мы должны управиться за одну-две недели. Очень
    надеюсь, что у нас это получится, поскольку группа получается
    немаленькая.

4.  Предложения и пожелания приветствуются, но решение об их
    утверждении/воплощении в жизнь не обязательно будет утвердительным.

# Github

1.  Вся работа будет осуществляться в рамках репозитория на github,
    поэтому важно знать базу и понимать, о чем идет речь. Вот
    [тут](https://github.com/features/code-review/) хорошие хайлайты,
    почти все из которых мы будем использовать.

2.  По поводу оформления issues, commits, pull request читайте
    [тут](https://github.com/Bazalii/School_Live_Simulator/blob/master/Documents/Project_formalization.pdf),
    это [обязательно]{style="color: red"}!

3.  Чтобы приступить к работе Вам необходимо: посмотреть в
    [табличку](https://github.com/Bazalii/School_Live_Simulator/blob/master/Pictures/Task_distribution.JPG)
    $\rightarrow$ найти свои таски $\rightarrow$ оставить комментарий
    под соответствующим issue $\rightarrow$ переместить ваше issue на
    вкладке project в колонку todo.

4.  [Любые]{style="color: red"} ваши push'ы должны быть понятными,
    конкретными и развернутыми(без фанатизма), вне зависимости от того,
    куда Вы пушите, всем должно быть ясно из краткого комментария, о чем
    идет речь.

5.  Большинство(или все) задачи будут сформулированы в виде issue,
    поскольку будет удобно трекать кто чем занимается.

6.  Все pull requests, commits и issues(а так же возможные обсуждения
    reviews и issues) должны быть на английском.

7.  Ветка master будет защищенной.

8.  При работе над задачей в любом случае необходимо будет:
    отбранчеваться $\rightarrow$ выполнить поставленную задачу
    $\rightarrow$ создать pull request $\rightarrow$ repeat while code
    is not prefect: (дождаться review $\rightarrow$ внести правки, если
    это необходимо) $\rightarrow$ смерджить вашу ветку в master
    $\rightarrow$ Вы великолепны.

# Соглашения

Так как разрабатывать игру будут несколько человек, то важно отметить,
что мы все - равноправные участники и никто не обладает абсолютным
правом на итоговый продукт, то есть все решения отрешенные от процесса
разработки - в плане жизни продукта, того, как он будет поддерживаться,
рекламироваться и т.п. будут решаться коллективно, с правом итогового
решения - моего и Арсения. Если в будущем продукт станет источником
дохода(что не планируется на текущий момент), то все участники в равном
объеме будут получать соотвествующие дивиденды.

# Результат работы

Через $\approx$`<!-- -->`{=html}2 недели планируется, что у нас будет
готов финальный продукт, который будет представлять из себя игру кликер,
которая будет выложена в play market без какой либо цели по извлечению
финансовой выгоды(во всяком случае первоначально).
