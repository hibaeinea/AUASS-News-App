// automatically generated by the FlatBuffers compiler, do not modify

package com.example.newsapp.model;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.BooleanVector;
import com.google.flatbuffers.ByteVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.DoubleVector;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.FloatVector;
import com.google.flatbuffers.IntVector;
import com.google.flatbuffers.LongVector;
import com.google.flatbuffers.ShortVector;
import com.google.flatbuffers.StringVector;
import com.google.flatbuffers.Struct;
import com.google.flatbuffers.Table;
import com.google.flatbuffers.UnionVector;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

@SuppressWarnings("unused")
public final class Article extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_23_5_26(); }
  public static Article getRootAsArticle(ByteBuffer _bb) { return getRootAsArticle(_bb, new Article()); }
  public static Article getRootAsArticle(ByteBuffer _bb, Article obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public Article __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public byte status() { int o = __offset(4); return o != 0 ? bb.get(o + bb_pos) : 0; }
  public int id() { int o = __offset(6); return o != 0 ? bb.getInt(o + bb_pos) : 0; }
  public String title() { int o = __offset(8); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer titleAsByteBuffer() { return __vector_as_bytebuffer(8, 1); }
  public ByteBuffer titleInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 8, 1); }
  public String text() { int o = __offset(10); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer textAsByteBuffer() { return __vector_as_bytebuffer(10, 1); }
  public ByteBuffer textInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 10, 1); }
  public Image images(int j) { return images(new Image(), j); }
  public Image images(Image obj, int j) { int o = __offset(12); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int imagesLength() { int o = __offset(12); return o != 0 ? __vector_len(o) : 0; }
  public Image.Vector imagesVector() { return imagesVector(new Image.Vector()); }
  public Image.Vector imagesVector(Image.Vector obj) { int o = __offset(12); return o != 0 ? obj.__assign(__vector(o), 4, bb) : null; }
  public String author() { int o = __offset(14); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer authorAsByteBuffer() { return __vector_as_bytebuffer(14, 1); }
  public ByteBuffer authorInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 14, 1); }
  public int likes() { int o = __offset(16); return o != 0 ? bb.getInt(o + bb_pos) : 0; }
  public int dislikes() { int o = __offset(18); return o != 0 ? bb.getInt(o + bb_pos) : 0; }
  public String date() { int o = __offset(20); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer dateAsByteBuffer() { return __vector_as_bytebuffer(20, 1); }
  public ByteBuffer dateInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 20, 1); }

  public static int createArticle(FlatBufferBuilder builder,
      byte status,
      int id,
      int titleOffset,
      int textOffset,
      int imagesOffset,
      int authorOffset,
      int likes,
      int dislikes,
      int dateOffset) {
    builder.startTable(9);
    Article.addDate(builder, dateOffset);
    Article.addDislikes(builder, dislikes);
    Article.addLikes(builder, likes);
    Article.addAuthor(builder, authorOffset);
    Article.addImages(builder, imagesOffset);
    Article.addText(builder, textOffset);
    Article.addTitle(builder, titleOffset);
    Article.addId(builder, id);
    Article.addStatus(builder, status);
    return Article.endArticle(builder);
  }

  public static void startArticle(FlatBufferBuilder builder) { builder.startTable(9); }
  public static void addStatus(FlatBufferBuilder builder, byte status) { builder.addByte(0, status, 0); }
  public static void addId(FlatBufferBuilder builder, int id) { builder.addInt(1, id, 0); }
  public static void addTitle(FlatBufferBuilder builder, int titleOffset) { builder.addOffset(2, titleOffset, 0); }
  public static void addText(FlatBufferBuilder builder, int textOffset) { builder.addOffset(3, textOffset, 0); }
  public static void addImages(FlatBufferBuilder builder, int imagesOffset) { builder.addOffset(4, imagesOffset, 0); }
  public static int createImagesVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startImagesVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static void addAuthor(FlatBufferBuilder builder, int authorOffset) { builder.addOffset(5, authorOffset, 0); }
  public static void addLikes(FlatBufferBuilder builder, int likes) { builder.addInt(6, likes, 0); }
  public static void addDislikes(FlatBufferBuilder builder, int dislikes) { builder.addInt(7, dislikes, 0); }
  public static void addDate(FlatBufferBuilder builder, int dateOffset) { builder.addOffset(8, dateOffset, 0); }
  public static int endArticle(FlatBufferBuilder builder) {
    int o = builder.endTable();
    return o;
  }
  public static void finishArticleBuffer(FlatBufferBuilder builder, int offset) { builder.finish(offset); }
  public static void finishSizePrefixedArticleBuffer(FlatBufferBuilder builder, int offset) { builder.finishSizePrefixed(offset); }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public Article get(int j) { return get(new Article(), j); }
    public Article get(Article obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
}
