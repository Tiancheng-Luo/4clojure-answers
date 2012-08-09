(ns four-clojure-answers.problem-023)

(def answer-023-a
  (fn [coll]
    (loop [c coll rc ()]
      (if (empty? c)
        rc
        (recur (rest c) (conj rc (first c)))))))

(def answer-023-b
  (partial reduce conj ()))
