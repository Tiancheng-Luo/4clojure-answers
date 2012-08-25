(ns four-clojure-answers.problem-118-test
  (:use four-clojure-answers.problem-118
        clojure.test))

(deftest problem-118-test
  (is (= [3 4 5 6 7]
         (answer inc [2 3 4 5 6])))
  (is (= (repeat 10 nil)
         (answer (fn [_] nil) (range 10))))
  (is (= [1000000 1000001]
         (->> (answer inc (range))
           (drop (dec 1000000))
           (take 2)))))
