﻿using System;

namespace EnumApplication
{

    class EnumProgram
    {
        enum Days { Sun, Mon, tue, Wed, thu, Fri, Sat };

        static void Main(string[] args)
        {
            int WeekdayStart = (int)Days.Mon;
            int WeekdayEnd = (int)Days.Sat;
            Console.WriteLine("Monday Position   : {0}", WeekdayStart);
            Console.WriteLine("Saturday Position : {0}", WeekdayEnd);
            Console.ReadKey();
        }
    }
}