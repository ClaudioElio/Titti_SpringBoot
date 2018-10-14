package it.mariani.titti.utility.Logger;

public interface Logger {

  public void debug(String format, Object... argArray);
  public void info(String format, Object... argArray);
  public void error(String format, Throwable t, Object... argArray);

}
