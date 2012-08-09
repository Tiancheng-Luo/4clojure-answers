(ns four-clojure-answers.problem-022)

(def answer-022-a
  (fn [coll]
    (loop [c coll cnt 0]
      (if (empty? c)
        cnt
        (recur (rest c) (inc cnt))))))

(def answer-022-b
  (comp (partial apply +)
        (partial map (constantly 1))))
