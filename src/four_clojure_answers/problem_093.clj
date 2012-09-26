(ns four-clojure-answers.problem-093)

(def answer-a
  (fn [s]
    (letfn [(partially-flatten [[x & more :as s] r]
              (cond
                (empty? s) r
                (coll? x) (partially-flatten
                            more
                            (partially-flatten x r))
                :else (conj r s)))]
      (partially-flatten s []))))

(def answer-b
  (fn partially-flatten [s]
    (when-let [[x & more :as xs] (seq s)]
      (if (sequential? x)
        (concat (partially-flatten x)
                (partially-flatten more))
        [xs]))))

(def answer-c
  (fn [s]
    (->> s
      (tree-seq sequential? seq)
      (filter sequential?)
      (filter (comp (complement sequential?) first)))))
