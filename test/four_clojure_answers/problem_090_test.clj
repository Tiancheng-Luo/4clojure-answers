(ns four-clojure-answers.problem-090-test
  (:use four-clojure-answers.problem-090
        clojure.test))

(deftest problem-090-test
  (are [s1 s2 expected]
    (= (answer s1 s2) expected)
    #{"ace" "king" "queen"} #{"♠" "♥" "♦" "♣"}
    #{["ace"   "♠"] ["ace"   "♥"] ["ace"   "♦"] ["ace"   "♣"]
      ["king"  "♠"] ["king"  "♥"] ["king"  "♦"] ["king"  "♣"]
      ["queen" "♠"] ["queen" "♥"] ["queen" "♦"] ["queen" "♣"]}
    #{1 2 3} #{4 5} #{[1 4] [2 4] [3 4] [1 5] [2 5] [3 5]})

  (is (= 300 (count (answer (into #{} (range 10)) (into #{} (range 30)))))))
