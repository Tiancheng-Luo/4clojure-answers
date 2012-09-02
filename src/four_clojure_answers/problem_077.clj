(ns four-clojure-answers.problem-077)

(def answer
  (fn [coll]
    (->> coll
      (group-by sort)
      vals
      (filter #(< 1 (count %)))
      (map set)
      set)))
