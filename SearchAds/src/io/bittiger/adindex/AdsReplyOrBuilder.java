// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SelectAds.proto

package io.bittiger.adindex;

public interface AdsReplyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:adindex.AdsReply)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .adindex.Ad ad = 1;</code>
   */
  java.util.List<io.bittiger.adindex.Ad> 
      getAdList();
  /**
   * <code>repeated .adindex.Ad ad = 1;</code>
   */
  io.bittiger.adindex.Ad getAd(int index);
  /**
   * <code>repeated .adindex.Ad ad = 1;</code>
   */
  int getAdCount();
  /**
   * <code>repeated .adindex.Ad ad = 1;</code>
   */
  java.util.List<? extends io.bittiger.adindex.AdOrBuilder> 
      getAdOrBuilderList();
  /**
   * <code>repeated .adindex.Ad ad = 1;</code>
   */
  io.bittiger.adindex.AdOrBuilder getAdOrBuilder(
      int index);
}