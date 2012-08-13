(ns four-clojure-answers.problem-034)

(def answer
  (fn [start end]
    (take-while #(< % end) (iterate inc start))))
