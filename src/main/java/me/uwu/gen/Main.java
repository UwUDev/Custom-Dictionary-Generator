package me.uwu.gen;

import me.uwu.gen.utils.GenUtils;

public class Main {

    public static void main(String[] args) {
        String[] keywords = GenUtils.getKeywords();

        System.out.print("loaded keywords:");
        for (String k: keywords)
            System.out.print(" "+ k);
        System.out.println("\n");

        if (keywords.length < 2){
            System.out.println("Add more keywords...");
            System.exit(0);
        }

        StringBuilder sb = new StringBuilder();

        if(keywords.length >= 2) {
            for (int a = 0; a < keywords.length; a++) {
                for (int b = 0; b < keywords.length; b++) {
                        if (b != a)
                            sb.append(keywords[a]).append(keywords[b]).append("\n");
                }
            }
        }

        if(keywords.length >= 3) {
            for (int a = 0; a < keywords.length; a++) {
                for (int b = 0; b < keywords.length; b++) {
                    for (int c = 0; c < keywords.length; c++) {
                            if (b != a && c != b && a != c)
                                sb.append(keywords[a]).append(keywords[b]).append(keywords[c]).append("\n");
                    }
                }
            }
        }

        if(keywords.length >= 4) {
            for (int a = 0; a < keywords.length; a++) {
                for (int b = 0; b < keywords.length; b++) {
                    for (int c = 0; c < keywords.length; c++) {
                        for (int d = 0; d < keywords.length; d++) {
                                if (b != a && c != b && a != c && d != a && d != b && d != c)
                                    sb.append(keywords[a]).append(keywords[b]).append(keywords[c]).append(keywords[d]).append("\n");
                        }
                    }
                }
            }
        }

        if(keywords.length >= 5) {
            for (int a = 0; a < keywords.length; a++) {
                for (int b = 0; b < keywords.length; b++) {
                    for (int c = 0; c < keywords.length; c++) {
                        for (int d = 0; d < keywords.length; d++) {
                            for (int e = 0; e < keywords.length; e++) {
                                    if (b != a && c != b && a != c && d != a && d != b && d != c && e != a && e != b && e != c && e != d)
                                        sb.append(keywords[a]).append(keywords[b]).append(keywords[c]).append(keywords[d]).append(keywords[e]).append("\n");
                            }
                        }
                    }
                }
            }
        }

        if(keywords.length >= 6) {
            for (int a = 0; a < keywords.length; a++) {
                for (int b = 0; b < keywords.length; b++) {
                    for (int c = 0; c < keywords.length; c++) {
                        for (int d = 0; d < keywords.length; d++) {
                            for (int e = 0; e < keywords.length; e++) {
                                for (int f = 0; f < keywords.length; f++) {
                                        if (b != a && c != b && a != c && d != a && d != b && d != c && e != a && e != b && e != c && e != d && f != a && f != b && f != c && f != d && f != e)
                                            sb.append(keywords[a]).append(keywords[b]).append(keywords[c]).append(keywords[d]).append(keywords[e]).append(keywords[f]).append("\n");
                                }
                            }
                        }
                    }
                }
            }
        }

        if(keywords.length >= 7) {
            for (int a = 0; a < keywords.length; a++) {
                for (int b = 0; b < keywords.length; b++) {
                    for (int c = 0; c < keywords.length; c++) {
                        for (int d = 0; d < keywords.length; d++) {
                            for (int e = 0; e < keywords.length; e++) {
                                for (int f = 0; f < keywords.length; f++) {
                                    for (int g = 0; g < keywords.length; g++) {
                                            if (b != a && c != b && a != c && d != a && d != b && d != c && e != a && e != b && e != c && e != d && f != a && f != b && f != c && f != d && f != e && g != a && g != b && g != c && g != d && g != e && g != f)
                                                sb.append(keywords[a]).append(keywords[b]).append(keywords[c]).append(keywords[d]).append(keywords[e]).append(keywords[f]).append(keywords[g]).append("\n");
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        if(keywords.length >= 8) {
            for (int a = 0; a < keywords.length; a++) {
                for (int b = 0; b < keywords.length; b++) {
                    for (int c = 0; c < keywords.length; c++) {
                        for (int d = 0; d < keywords.length; d++) {
                            for (int e = 0; e < keywords.length; e++) {
                                for (int f = 0; f < keywords.length; f++) {
                                    for (int g = 0; g < keywords.length; g++) {
                                        for (int h = 0; h < keywords.length; h++) {
                                            if (b != a && c != b && a != c && d != a && d != b && d != c && e != a && e != b && e != c && e != d && f != a && f != b && f != c && f != d && f != e && g != a && g != b && g != c && g != d && g != e && g != f && h != a && h != b && h != c && h != d && h != e && h != f && h != g)
                                                sb.append(keywords[a]).append(keywords[b]).append(keywords[c]).append(keywords[d]).append(keywords[e]).append(keywords[f]).append(keywords[g]).append(keywords[h]).append("\n");

                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        if(keywords.length >= 9) {
            for (int a = 0; a < keywords.length; a++) {
                for (int b = 0; b < keywords.length; b++) {
                    for (int c = 0; c < keywords.length; c++) {
                        for (int d = 0; d < keywords.length; d++) {
                            for (int e = 0; e < keywords.length; e++) {
                                for (int f = 0; f < keywords.length; f++) {
                                    for (int g = 0; g < keywords.length; g++) {
                                        for (int h = 0; h < keywords.length; h++) {
                                            for (int i = 0; i < keywords.length; i++) {
                                                if (b != a && c != b && a != c && d != a && d != b && d != c && e != a && e != b && e != c && e != d && f != a && f != b && f != c && f != d && f != e && g != a && g != b && g != c && g != d && g != e && g != f && h != a && h != b && h != c && h != d && h != e && h != f && h != g && i != a && i != b && i != c && i != d && i != e && i != f && i != g && i != h)
                                                    sb.append(keywords[a]).append(keywords[b]).append(keywords[c]).append(keywords[d]).append(keywords[e]).append(keywords[f]).append(keywords[g]).append(keywords[h]).append(keywords[i]).append("\n");
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        //System.out.println(sb.toString());
        GenUtils.saveResult(sb);

    }

}
