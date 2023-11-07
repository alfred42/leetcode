func checkIfPangram(sentence string) bool {
    bools := [26]bool{}
    for _, c := range sentence {
        bools[c - 'a'] = true
    }

    for _, b := range bools {
        if !b {
            return false
        }
    }

    return true
}