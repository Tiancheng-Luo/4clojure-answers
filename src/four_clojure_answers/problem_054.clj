(ns four-clojure-answers.problem-054)

(def answer
  (fn [n coll]
    (loop [xs coll ret []]
      (if (< (count xs) n)
        ret
        (recur (drop n xs) (conj ret (take n xs)))))))
