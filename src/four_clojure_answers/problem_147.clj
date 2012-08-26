(ns four-clojure-answers.problem-147)

(def answer
  (partial iterate
           (fn [nums]
             (vec
               (map +' (conj nums 0) (cons 0 nums))))))
