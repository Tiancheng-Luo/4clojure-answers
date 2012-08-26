(ns four-clojure-answers.problem-128-test
  (:use four-clojure-answers.problem-128
        clojure.test))

(deftest problem-128-test
  (are [card expected]
    (= (answer card) expected)
    "DQ" {:suit :diamond :rank 10}
    "H5" {:suit :heart :rank 3}
    "CA" {:suit :club :rank 12})

  (is (= (range 13) (map (comp :rank answer str)
                         '[S2 S3 S4 S5 S6 S7
                           S8 S9 ST SJ SQ SK SA]))))
