(ns four-clojure-answers.problem-055)

(def answer-a
  (comp (partial apply merge-with +)
        (partial map (fn [x] {x 1}))))

(def answer-b
  (fn [coll]
    (into {} (for [[k v] (group-by identity coll)]
               [k (count v)]))))
