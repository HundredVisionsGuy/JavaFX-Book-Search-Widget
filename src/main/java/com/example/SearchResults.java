package com.example;

import java.util.List;

public class SearchResults {
    private long id;
    private String title;
    private List<AuthorType> authors;
    private List<AuthorType> translators;
    private List<String> subjects;
    private List<String> bookshelves;
    private List<String> languages;
    private boolean copyright;
    private String mediaType;
    private List<FormatType> formatType;
    private long downloadCount;
    
    // Getters and Setters
    public void setId(long id) {
        this.id = id;
    }
    public long getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public List<AuthorType> getAuthors() {
        return authors;
    }
    public void setAuthors(List<AuthorType> authors) {
        this.authors = authors;
    }
    public List<AuthorType> getTranslators() {
        return translators;
    }
    public void setTranslators(List<AuthorType> translators) {
        this.translators = translators;
    }
    public List<String> getSubjects() {
        return subjects;
    }
    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }
    public List<String> getBookshelves() {
        return bookshelves;
    }
    public void setBookshelves(List<String> bookshelves) {
        this.bookshelves = bookshelves;
    }
    public List<String> getLanguages() {
        return languages;
    }
    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }
    public boolean isCopyright() {
        return copyright;
    }
    public void setCopyright(boolean copyright) {
        this.copyright = copyright;
    }
    public String getMediaType() {
        return mediaType;
    }
    public void setMediaType(String mediaType) {
        this.mediaType = mediaType;
    }
    public List<FormatType> getFormatType() {
        return formatType;
    }
    public void setFormatType(List<FormatType> formatType) {
        this.formatType = formatType;
    }
    public long getDownloadCount() {
        return downloadCount;
    }
    public void setDownloadCount(long downloadCount) {
        this.downloadCount = downloadCount;
    }
}
