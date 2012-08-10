(ns four-clojure-answers.problem-023)

(def answer-a
  (fn [coll]
    (loop [c coll rc ()]
      (if (empty? c)
        rc
        (recur (rest c) (conj rc (first c)))))))

(def answer-b
  (partial reduce conj ()))
